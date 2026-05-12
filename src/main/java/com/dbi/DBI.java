package com.dbi;

import com.dbi.entity.Dino1Entity;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.command.argument.EntitySummonArgumentType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBI implements ModInitializer {

    public static final String MOD_ID = "dbi";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static EntityType<Dino1Entity> DINO1 = FabricEntityTypeBuilder
            .create(SpawnGroup.MONSTER, Dino1Entity::new)
            .dimensions(EntityDimensions.fixed(2.5f, 3.0f))
            .build();

    @Override
    public void onInitialize() {
        Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "dino1"), DINO1);

        net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry
                .register(DINO1, Dino1Entity.createAttributes());

        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
            dispatcher.register(
                CommandManager.literal("spawndino")
                    .requires(src -> src.hasPermissionLevel(2))
                    .executes(ctx -> {
                        ServerCommandSource src = ctx.getSource();
                        Dino1Entity dino = new Dino1Entity(DINO1, src.getWorld());
                        dino.refreshPositionAndAngles(
                            src.getPosition().x,
                            src.getPosition().y,
                            src.getPosition().z,
                            0, 0
                        );
                        src.getWorld().spawnEntity(dino);
                        src.sendFeedback(
                            new net.minecraft.text.LiteralText("Dino1 spawnado!"), false
                        );
                        return 1;
                    })
            );
        });

        LOGGER.info("DBI 1.16.5 iniciado!");
    }
}
