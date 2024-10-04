package dev.lemonjuice.neo_greatswords.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.common.SimpleTier;

/**
 * Simple Tiers
 * new SimpleTier(TagKey<Block> incorrectBlockForDrops, int uses, float speed, int enchantmentValue, Supplier<Ingredient> repairIngredient)
 *
 * WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
 *  return Ingredient.of(ItemTags.PLANKS);
 * }),
 * STONE(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 4.0F, 1.0F, 5, () -> {
 *  return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);
 * }),
 * IRON(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6.0F, 2.0F, 14, () -> {
 *  return Ingredient.of(new ItemLike[]{Items.IRON_INGOT});
 * }),
 * DIAMOND(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 10, () -> {
 *  return Ingredient.of(new ItemLike[]{Items.DIAMOND});
 * }),
 * GOLD(BlockTags.INCORRECT_FOR_GOLD_TOOL, 32, 12.0F, 0.0F, 22, () -> {
 *  return Ingredient.of(new ItemLike[]{Items.GOLD_INGOT});
 * }),
 * NETHERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 9.0F, 4.0F, 15, () -> {
 *  return Ingredient.of(new ItemLike[]{Items.NETHERITE_INGOT});
 * });
 */
public class NGTiers {

    public static final Tier WOODEN_GREATSWORD_TIER = greatTier(Tiers.WOOD);
    public static final Tier STONE_GREATSWORD_TIER = greatTier(Tiers.STONE);
    public static final Tier IRON_GREATSWORD_TIER = greatTier(Tiers.IRON);
    public static final Tier DIAMOND_GREATSWORD_TIER = greatTier(Tiers.DIAMOND);
    public static final Tier GOLDEN_GREATSWORD_TIER = greatTier(Tiers.GOLD);
    public static final Tier NETHERITE_GREATSWORD_TIER = greatTier(Tiers.NETHERITE);

    /**
     * Increases a tier's damage by 3
     * Multiplies a tier's durability by 4
     * Decreases a tier's speed to 80% of its original value
     *
     * @param tier
     * @return
     */
    private static Tier greatTier(Tier tier) {
        return new SimpleTier(tier.getIncorrectBlocksForDrops(), tier.getUses() * 4, (tier.getSpeed()/5) * 4, tier.getAttackDamageBonus() + 3, tier.getEnchantmentValue(), () -> tier.getRepairIngredient());
    }
}
