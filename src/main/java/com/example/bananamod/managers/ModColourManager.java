package com.example.bananamod.managers;

import com.example.bananamod.collections.BlocksList;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Registers {@link IBlockColor}/{@link IItemColor} handlers for this mod's blocks/items.
 *
 * @author Choonster
 */
@SideOnly(Side.CLIENT)
public class ModColourManager {
    private static final Minecraft minecraft = Minecraft.getMinecraft();

    /**
     * Register the colour handlers.
     */
    public static void registerColourHandlers() {
        final BlockColors blockColors = minecraft.getBlockColors();
        final ItemColors itemColors = minecraft.getItemColors();

        registerBlockColourHandlers(blockColors);
        registerItemColourHandlers(blockColors, itemColors);
    }

    /**
     * Register the {@link IBlockColor} handlers.
     *
     * @param blockColors The BlockColors instance
     */
    private static void registerBlockColourHandlers(final BlockColors blockColors) {
        // Use the grass colour of the biome or the default grass colour
        final IBlockColor grassColourHandler = (state, blockAccess, pos, tintIndex) -> {
            if (blockAccess != null && pos != null) {
                return BiomeColorHelper.getGrassColorAtPos(blockAccess, pos);
            }

            return ColorizerGrass.getGrassColor(0.5D, 1.0D);
        };

        blockColors.registerBlockColorHandler(grassColourHandler, BlocksList.LEAVES_BLOCKS.get(0));
    }

    /**
     * Register the {@link IItemColor} handlers
     *
     * @param blockColors The BlockColors instance
     * @param itemColors  The ItemColors instance
     */
    private static void registerItemColourHandlers(final BlockColors blockColors, final ItemColors itemColors) {
        // Use the Block's colour handler for an ItemBlockCustom
        final IItemColor itemBlockColourHandler = (stack, tintIndex) -> {
            IBlockState iblockstate = ((ItemBlock) stack.getItem()).getBlock().getStateFromMeta(stack.getMetadata());
            return blockColors.colorMultiplier(iblockstate, null, null, tintIndex);
        };
        for(Item item : ForgeRegistries.ITEMS){
            if(item.getRegistryName().toString().startsWith("bananamod:") &&
                    item.getRegistryName().toString().contains("leaves")){
                itemColors.registerItemColorHandler(itemBlockColourHandler, item);
            }
        }

    }

}