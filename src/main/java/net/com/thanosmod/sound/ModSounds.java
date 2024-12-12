package net.com.thanosmod.sound;

import net.com.thanosmod.ThanosMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.level.block.JukeboxBlock;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static  final DeferredRegister<SoundEvent>SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ThanosMod.MOD_ID);

     public static final RegistryObject<SoundEvent>ROMAN= registerSoundEvent("romans_empire");
     public static final ResourceKey<JukeboxSong> ROMAN_EMPIRE = ResourceKey.create(Registries.JUKEBOX_SONG,
             ResourceLocation.fromNamespaceAndPath(ThanosMod.MOD_ID,"romans_empire"));



    public static final RegistryObject<SoundEvent>BATTLE_THEME= registerSoundEvent("battle_theme");
    public static final ResourceKey<JukeboxSong> BATTLE_THEME_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(ThanosMod.MOD_ID,"battle_theme"));








    private static RegistryObject<SoundEvent> registerSoundEvent(String name){

        return SOUND_EVENTS.register(name, ()->SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(ThanosMod.MOD_ID,name)));
    }


    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}