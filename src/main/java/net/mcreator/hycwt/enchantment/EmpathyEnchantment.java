
package net.mcreator.hycwt.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.hycwt.HycwtModElements;

@HycwtModElements.ModElement.Tag
public class EmpathyEnchantment extends HycwtModElements.ModElement {
	@ObjectHolder("hycwt:empathy")
	public static final Enchantment enchantment = null;

	public EmpathyEnchantment(HycwtModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("empathy"));
	}

	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == Items.WOODEN_SWORD)
				return true;
			if (stack.getItem() == Items.STONE_SWORD)
				return true;
			if (stack.getItem() == Items.IRON_SWORD)
				return true;
			if (stack.getItem() == Items.GOLDEN_SWORD)
				return true;
			if (stack.getItem() == Items.DIAMOND_SWORD)
				return true;
			if (stack.getItem() == Items.NETHERITE_SWORD)
				return true;
			if (stack.getItem() == Items.BOW)
				return true;
			if (stack.getItem() == Items.CROSSBOW)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
