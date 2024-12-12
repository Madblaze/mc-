package net.com.thanosmod.item;

import net.com.thanosmod.ThanosMod;
import net.com.thanosmod.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThanosMod.MOD_ID);

   public static final RegistryObject<Item> magic_potion = ITEMS.register("magic_potion",
           ()->new Item(new Item.Properties().food(ModFoodProperties.MAGIC_POTION)) );

    public static final RegistryObject<Item> romans_empire_disc = ITEMS.register("romans_empire_disc",
            ()->new Item(new Item.Properties().jukeboxPlayable(ModSounds.ROMAN_EMPIRE).stacksTo(1)) );


    public static final RegistryObject<Item> battle_theme_disc = ITEMS.register("battle_theme_disc",
            ()->new Item(new Item.Properties().jukeboxPlayable(ModSounds.BATTLE_THEME_KEY).stacksTo(1)) );



    public static void register(IEventBus eventBus){
       ITEMS.register(eventBus);



    }
}
