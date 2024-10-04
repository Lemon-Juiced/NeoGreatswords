package dev.lemonjuice.neo_greatswords.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static dev.lemonjuice.neo_greatswords.NeoGreatswords.MOD_ID;
import static dev.lemonjuice.scalar_core.item.ToolItemPropFactory.getNonBurningSwordItemProperties;
import static dev.lemonjuice.scalar_core.item.ToolItemPropFactory.getSwordItemProperties;

public class NGItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final Supplier<Item> WOODEN_GREATSWORD = ITEMS.register("wooden_greatsword", () -> new GreatswordItem(NGTiers.WOODEN_GREATSWORD_TIER, getSwordItemProperties(NGTiers.WOODEN_GREATSWORD_TIER)));
    public static final Supplier<Item> STONE_GREATSWORD = ITEMS.register("stone_greatsword", () -> new GreatswordItem(NGTiers.STONE_GREATSWORD_TIER, getSwordItemProperties(NGTiers.STONE_GREATSWORD_TIER)));
    public static final Supplier<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword", () -> new GreatswordItem(NGTiers.IRON_GREATSWORD_TIER, getSwordItemProperties(NGTiers.IRON_GREATSWORD_TIER)));
    public static final Supplier<Item> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword", () -> new GreatswordItem(NGTiers.DIAMOND_GREATSWORD_TIER, getSwordItemProperties(NGTiers.DIAMOND_GREATSWORD_TIER)));
    public static final Supplier<Item> GOLDEN_GREATSWORD = ITEMS.register("golden_greatsword", () -> new GreatswordItem(NGTiers.GOLDEN_GREATSWORD_TIER, getSwordItemProperties(NGTiers.GOLDEN_GREATSWORD_TIER)));
    public static final Supplier<Item> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword", () -> new GreatswordItem(NGTiers.NETHERITE_GREATSWORD_TIER, getNonBurningSwordItemProperties(NGTiers.NETHERITE_GREATSWORD_TIER)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
