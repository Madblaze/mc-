package net.com.thanosmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties MAGIC_POTION = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 2400, 9), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 9), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 9), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 9), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 9), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 100000000), 1.0F)
            .effect(new MobEffectInstance(MobEffects.JUMP, 2400, 9), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 2400, 9), 1.0F)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 2400, 9), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DARKNESS,  100, 1), 1.0F)
            .alwaysEdible()
            .build();
    
}
