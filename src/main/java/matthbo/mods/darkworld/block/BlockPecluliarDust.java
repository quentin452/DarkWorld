package matthbo.mods.darkworld.block;

import net.minecraft.block.material.Material;


public class BlockPecluliarDust extends BlockFallingDarkWorld {
	
	public BlockPecluliarDust(){
		super(Material.sand);
		this.setBlockName("peculiardustblock_anim");
		this.setStepSound(soundTypeSand);
		this.setHardness(0.5F);
	}

}
