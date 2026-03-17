package dev.lemonjuice.neo_greatswords.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.lemonjuice.neo_greatswords.NeoGreatswords.MOD_ID;
import static net.minecraft.world.item.ToolMaterial.*;

public class NGItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    private static final float BASE_ATTACK_DAMAGE = 3.0F;
    private static final float ADDITIONAL_ATTACK_DAMAGE = 3.0F;
    private static final float ATTACK_DAMAGE = BASE_ATTACK_DAMAGE + ADDITIONAL_ATTACK_DAMAGE;
    private static final float ATTACK_SPEED = -3.2F;
    private static final int DURABILITY_MULTIPLIER = 4;

    public static final DeferredItem<Item> WOODEN_GREATSWORD = ITEMS.registerItem("wooden_greatsword", properties -> new Item(greatswordProperties(properties, WOOD)));
    public static final DeferredItem<Item> STONE_GREATSWORD = ITEMS.registerItem("stone_greatsword", properties -> new Item(greatswordProperties(properties, STONE)));
    public static final DeferredItem<Item> COPPER_GREATSWORD = ITEMS.registerItem("copper_greatsword", properties -> new Item(greatswordProperties(properties, COPPER)));
    public static final DeferredItem<Item> IRON_GREATSWORD = ITEMS.registerItem("iron_greatsword", properties -> new Item(greatswordProperties(properties, IRON)));
    public static final DeferredItem<Item> DIAMOND_GREATSWORD = ITEMS.registerItem("diamond_greatsword", properties -> new Item(greatswordProperties(properties, DIAMOND)));
    public static final DeferredItem<Item> GOLDEN_GREATSWORD = ITEMS.registerItem("golden_greatsword", properties -> new Item(greatswordProperties(properties, GOLD)));
    public static final DeferredItem<Item> NETHERITE_GREATSWORD = ITEMS.registerItem("netherite_greatsword", properties -> new Item(greatswordProperties(properties, NETHERITE)));

    private static Item.Properties greatswordProperties(Item.Properties properties, ToolMaterial material) {
        return properties
                .sword(material, ATTACK_DAMAGE, ATTACK_SPEED)
                .durability(material.durability() * DURABILITY_MULTIPLIER);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
