package com.dbi.client;

import com.dbi.entity.Dino1Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class Dino1Model extends AnimatedGeoModel<Dino1Entity> {

    @Override
    public Identifier getModelLocation(Dino1Entity entity) {
        return new Identifier("dbi", "geo/dino1.json");
    }

    @Override
    public Identifier getTextureLocation(Dino1Entity entity) {
        return new Identifier("dbi", "textures/entity/mobs/dino/dino.png");
    }

    @Override
    public Identifier getAnimationFileLocation(Dino1Entity entity) {
        return new Identifier("dbi", "animations/dino1.animation.walk.json");
    }
}
