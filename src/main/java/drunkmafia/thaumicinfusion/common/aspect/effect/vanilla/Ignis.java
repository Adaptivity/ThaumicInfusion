package drunkmafia.thaumicinfusion.common.aspect.effect.vanilla;

import drunkmafia.thaumicinfusion.common.aspect.AspectEffect;
import drunkmafia.thaumicinfusion.common.util.annotation.Effect;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by DrunkMafia on 25/07/2014.
 *
 * See http://www.wtfpl.net/txt/copying for licence
 */
@Effect(aspect = ("ignis"), cost = 1)
public class Ignis  extends AspectEffect {

    public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face){
        return 0;
    }

    public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face){
        return true;
    }

    public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face){
        return 4096;
    }

    public boolean isFireSource(World world, int x, int y, int z, ForgeDirection side){
        return true;
    }
}
