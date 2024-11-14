package net.maks.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.maks.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// kod od tąd DO
public class ModBlocks {
    //tutaj będę dodawać bloki jakie chce
    public  static final Block STEELIUM_BLOCK =  registerBlock("steelium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public  static final Block CRYSTALIUM_BLOCK =  registerBlock("crystalium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    //raw blocks
    public  static final Block RAW_STEELIUM_BLOCK =  registerBlock("raw_steelium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public  static final Block CRYSTALIUM_CLUSTER =  registerBlock("crystalium_cluster",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    //ore
    public  static final Block STEELIUM_ORE =  registerBlock("steelium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));







    private  static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }


    private  static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public  static  void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering ModBlocks for" + TutorialMod.MOD_ID);

        //Tąd pozwala stworzyć dowolne bloki
    }
}
