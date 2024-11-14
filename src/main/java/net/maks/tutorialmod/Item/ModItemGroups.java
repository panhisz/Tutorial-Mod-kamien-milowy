package net.maks.tutorialmod.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maks.tutorialmod.TutorialMod;
import net.maks.tutorialmod.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
//                                     ||
//                                     ||
// tutaj zaczyna się grupowanie itemów \/
// to powoduje, że w ekwipunku minecrafta pojawia się zakładka z tymi konkretnymi itemami w tej grupie

// grupa w tym znaczniu = zakładka w ekwipunku w minecraft
public class ModItemGroups {
    public static final ItemGroup STEELIUM_INGOT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID,"steelium_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.steelium_ingot"))
                    .icon(() -> new ItemStack(ModItems.STEELIUM_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.STEELIUM_INGOT);
                        entries.add(ModItems.RAW_STEELIUM);
                        entries.add(ModItems.CRYSTALIUM_SHARD);
                        entries.add(ModItems.CRYSTALIUM_INGOT);

                        //block
                        entries.add(ModBlocks.STEELIUM_BLOCK);
                        entries.add(ModBlocks.CRYSTALIUM_BLOCK);



                        //raw
                        entries.add((ModBlocks.RAW_STEELIUM_BLOCK));
                        entries.add((ModBlocks.CRYSTALIUM_CLUSTER));



                        //ore
                        entries.add((ModBlocks.STEELIUM_ORE));










                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for" + TutorialMod.MOD_ID);
        //tutaj się kończy pierwsza grupa
    }
}
