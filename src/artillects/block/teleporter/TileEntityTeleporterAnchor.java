package artillects.block.teleporter;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.ForgeDirection;
import artillects.Vector3;
import artillects.VectorWorld;
import artillects.tile.TileEntityAdvanced;

/** @author Archadia */
public class TileEntityTeleporterAnchor extends TileEntityAdvanced
{
    private long lastFrequencyCheck = 0;
    private int frequency = 0;
    private boolean forceXYZ = false;
    private Vector3 xyz = null;

    public void setTeleportLocation(Vector3 location)
    {
        if (location != null)
        {
            this.forceXYZ = true;
            this.xyz = location;
        }
    }

    @Override
    public void validate()
    {
        if (!worldObj.isRemote)
        {
            TeleportManager.addAnchor(this);
        }
        super.validate();
    }

    @Override
    public void invalidate()
    {
        if (!worldObj.isRemote)
        {
            TeleportManager.remAnchor(this);
        }
        super.invalidate();
    }

    public void refresh()
    {
        this.invalidate();
        this.validate();
    }

    @Override
    public boolean canUpdate()
    {
        return true;
    }

    @Override
    public void updateEntity()
    {
        super.updateEntity();
        if (worldObj.getWorldTime() % 600 == 0)
        {
            refresh();
        }
    }

    public void doTeleport(Entity entity)
    {

        if (this.getFrequency() > 0)
        {
            TileEntityTeleporterAnchor teleporter = TeleportManager.getClosestWithFrequency(new VectorWorld(this), this.getFrequency(), this);
            if (teleporter != null)
            {
                worldObj.markBlockForUpdate(teleporter.xCoord, teleporter.yCoord, teleporter.zCoord);
                entity.setPosition(teleporter.xCoord + 0.5, teleporter.yCoord + 2, teleporter.zCoord + 0.5);
                System.out.println("Entity Pos: " + entity.posX + ", " + entity.posY + ", " + entity.posZ);
            }
        }
    }

    /** @return -1 if the teleporter is unable to teleport. */
    public int getFrequency()
    {
        if (this.lastFrequencyCheck - System.currentTimeMillis() > 10)
        {
            this.lastFrequencyCheck = System.currentTimeMillis();
            for (int i = 2; i < 6; i++)
            {
                ForgeDirection direction = ForgeDirection.getOrientation(i);
                Vector3 position = new Vector3(this.xCoord + direction.offsetX, this.yCoord + direction.offsetY, this.zCoord + direction.offsetZ);

                Block block = Block.blocksList[this.worldObj.getBlockId((int) position.x, (int) position.y, (int) position.z)];

                if (block instanceof BlockGlyph)
                {
                    int metadata = this.worldObj.getBlockMetadata((int) position.x, (int) position.y, (int) position.z);
                    this.frequency += Math.pow(BlockGlyph.MAX_GLYPH, i - 2) * metadata;
                }
                else
                {
                    return -1;
                }
            }
        }
        return this.frequency;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        if (this.xyz != null)
        {
            nbt.setCompoundTag("teleportLocation", this.xyz.save(new NBTTagCompound()));
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
        if (nbt.hasKey("teleportLocation"))
        {
            this.xyz = new Vector3(nbt.getCompoundTag("teleportLocation"));
            this.forceXYZ = true;
        }
    }
}