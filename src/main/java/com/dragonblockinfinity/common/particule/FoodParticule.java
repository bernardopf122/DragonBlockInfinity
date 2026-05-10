package com.dragonblockinfinity.common.particule;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;

public class FoodParticule extends SimpleParticleType {
    public FoodParticule() {
        super(false);
    }

    @Override
    public ResourceLocation getRegistryName() {
        return new ResourceLocation("dragonblockinfinity", "textures/particules/dino_meat_raw");
        return new ResourceLocation("dragonblockinfinity", "textures/particules/dino_meat_cooked");
    }
}