package net.maks.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.maks.tutorialmod.TutorialMod;
import net.minecraft.block.AmethystBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

// kod od tąd DO
public class ModBlocks {
    //tutaj będę dodawać bloki jakie chce
    public  static final Block STEELIUM_BLOCK =  registerBlock("steelium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public  static final Block CRYSTALIUM_BLOCK =  registerBlock("crystalium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(4.0f)));


    //Block
    public  static final Block CRYSTALIUM_BUDDING =  registerBlock("crystalium_budding",
            new Block(FabricBlockSettings.copyOf(Blocks.BUDDING_AMETHYST).strength(1.5f)));

    //raw blocks
    public  static final Block RAW_STEELIUM_BLOCK =  registerBlock("raw_steelium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public  static final Block CRYSTALIUM_CLUSTER =  registerBlock("crystalium_cluster",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(2.2f).sounds(BlockSoundGroup.AMETHYST_CLUSTER)));
    //ore
    public  static final Block STEELIUM_ORE =  registerBlock("steelium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(1.7f), UniformIntProvider.create(2,5)));
    public  static final Block CRYSTALIUM_ORE =  registerBlock("crystalium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(1.5f), UniformIntProvider.create(1,12)));

    //deepslate ores
    public  static final Block DEEPSLATE_STEELIUM_ORE =  registerBlock("deepstale_steelium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(2,5)));

    public  static final Block DEEPSLATE_CRYSTALIUM_ORE =  registerBlock("deepslate_crystalium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(2.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK), UniformIntProvider.create(1,12)));



    //nether things
    public  static final Block NETHER_CRYSTALIUM_ORE =  registerBlock("nether_crystalium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(5f), UniformIntProvider.create(5,36)));
    public  static final Block NETHER_CRYSTALIUM_CLUSTER =  registerBlock("nether_crystalium_cluster",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(2.2f).sounds(BlockSoundGroup.AMETHYST_CLUSTER)));
    public  static final Block NETHER_CRYSTALIUM_BLOCK =  registerBlock("nether_crystalium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(2.2f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));



    //end dimension
    public  static final Block END_CRYSTALIUM_ORE =  registerBlock("end_crystalium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(3f), UniformIntProvider.create(5,7)));




















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
