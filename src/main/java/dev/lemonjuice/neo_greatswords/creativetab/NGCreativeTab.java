package dev.lemonjuice.neo_greatswords.creativetab;

import dev.lemonjuice.neo_greatswords.NeoGreatswords;
import dev.lemonjuice.neo_greatswords.item.NGItems;
import dev.lemonjuice.scalar_core.ScalarCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NGCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NeoGreatswords.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NG_ITEMS_TAB = CREATIVE_MODE_TABS.register("neo_greatswords_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.neo_greatswords.tab"))
            .icon(() -> new ItemStack(NGItems.NETHERITE_GREATSWORD.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == NG_ITEMS_TAB.get()) {
            event.accept(NGItems.WOODEN_GREATSWORD.get());
            event.accept(NGItems.STONE_GREATSWORD.get());
            event.accept(NGItems.IRON_GREATSWORD.get());
            event.accept(NGItems.DIAMOND_GREATSWORD.get());
            event.accept(NGItems.GOLDEN_GREATSWORD.get());
            event.accept(NGItems.NETHERITE_GREATSWORD.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
