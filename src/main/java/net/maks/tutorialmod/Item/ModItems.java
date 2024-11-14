package net.maks.tutorialmod.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maks.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

//w tym miejscu tutaj się robi register itemów
public class ModItems {
    public  static final Item STEELIUM_INGOT = registerItem("steelium_ingot", new Item(new FabricItemSettings()));
    public  static final Item RAW_STEELIUM = registerItem("raw_steelium", new Item(new FabricItemSettings()));     //jak chcesz dodać nowy item po prostu skopiuj linijke i zmień nazwy... Potem musisz skopiować plik .json z nazwą danego itemu np: steelium_ingot.json kopiujesz to i zmieniasz nazwe np na " raw_steelium jason" i w tym jsonie w folderze models->item piszesz jaką ścieżke ma obrać program żeby dobrać odpowiednie textury
    public  static final Item CRYSTALIUM_SHARD = registerItem("crystalium_shard", new Item(new FabricItemSettings()));
    public  static final Item NETHER_CRYSTALIUM_SHARD = registerItem("nether_crystalium_shard", new Item(new FabricItemSettings()));
    public  static final Item CRYSTALIUM_INGOT = registerItem("crystalium_ingot", new Item(new FabricItemSettings()));
    public  static final Item NETHER_CRYSTALIUM_INGOT = registerItem("nether_crystalium_ingot", new Item(new FabricItemSettings()));
    //public  static final Item END_CRYSTALIUM_INGOT = registerItem("end_crystalium_ingot", new Item(new FabricItemSettings()));
    //public  static final Item END_CRYSTALIUM_SHARD = registerItem("end_crystalium_shard", new Item(new FabricItemSettings()));

















    private  static void addItemsToIngredientItemGroup(FabricItemGroupEntries entires) {
        entires.add(STEELIUM_INGOT);
        entires.add(RAW_STEELIUM);
        entires.add(CRYSTALIUM_INGOT);
        entires.add(NETHER_CRYSTALIUM_INGOT);
        entires.add(NETHER_CRYSTALIUM_SHARD);
       // entires.add(END_CRYSTALIUS_SHARD);
        //entires.add(END_CRYSTALIUS_INGOT); //wrazie gdy będzie mi sie chciało robić end bloki


    }



    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);

    }


    public  static  void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
