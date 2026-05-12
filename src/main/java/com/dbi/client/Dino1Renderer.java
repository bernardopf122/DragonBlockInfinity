package com.dbi.client;

import com.dbi.entity.Dino1Entity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class Dino1Renderer extends GeoEntityRenderer<Dino1Entity> {

    public Dino1Renderer(EntityRendererFactory.Context ctx) {
        super(ctx, new Dino1Model());
    }

    @Override
    public Identifier getTexture(Dino1Entity entity) {
        return new Identifier("dbi", "textures/entity/mobs/dino/dino.png");
    }
}
