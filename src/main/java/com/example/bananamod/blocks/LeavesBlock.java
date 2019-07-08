package com.example.bananamod.blocks;

import com.example.bananamod.collections.BlocksList;
import com.example.bananamod.collections.ItemsList;
import com.sun.istack.internal.Nullable;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import java.util.Random;

public class LeavesBlock extends BlockLeaves implements IShearable {

    public LeavesBlock(String name) {
        BlocksList.LEAVES_BLOCKS.add(this);
        setUnlocalizedName(name);
        setRegistryName(name);
        setDefaultState(this.getBlockState().getBaseState().
                withProperty(CHECK_DECAY, Boolean.valueOf(true)).
                withProperty(DECAYABLE, Boolean.valueOf(true)));
        setLightOpacity(1);

    }



    @Override
    public void updateTick(World worldIn, @Nonnull BlockPos pos, @Nonnull IBlockState state, Random rand) {
        super.updateTick(worldIn, pos, state, rand);
    }

    @Override
    public boolean isLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
        return true;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return Blocks.LEAVES.getBlockLayer();
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return Blocks.LEAVES.isOpaqueCube(state);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks).
     *
     * @param itemIn the item in
     * @param items  the items
     * @return the sub blocks
     */
    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        items.add(new ItemStack(this));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, CHECK_DECAY, DECAYABLE);
    }

    @Override
    public BlockPlanks.EnumType getWoodType(int meta) {
        return null;
    }

    @Override
    public NonNullList<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        return NonNullList.withSize(1, new ItemStack(this));
    }

    /**
     * Convert the BlockState into the correct metadata value.
     *
     * @param state the state
     * @return the meta from state
     */
    @Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;

        if (!state.getValue(DECAYABLE).booleanValue()) {
            i |= 4;
        }

        if (state.getValue(CHECK_DECAY).booleanValue()) {
            i |= 8;
        }

        return i;
    }

    /* (non-Javadoc)
     * @see net.minecraft.block.Block#getSilkTouchDrop(net.minecraft.block.state.IBlockState)
     */
    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return new ItemStack(Item.getItemFromBlock(this));
    }

    @Override
    protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
        int finalChance = worldIn.rand.nextInt(chance);
        if (finalChance != 0 && finalChance != 1 && finalChance != 2 && finalChance != 3 && finalChance != 4 &&
                finalChance != 5 && finalChance != 6 && finalChance != 7 && finalChance != 8 && finalChance != 9) {
            spawnAsEntity(worldIn, pos, new ItemStack(ItemsList.BANANA));
        }
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     *
     * @param state the state
     * @return the int
     */
    @Override
    public int damageDropped(IBlockState state) {
        return 0;
    }

    /**
     * Spawns the block's drops in the world. By the time this is called the Block has possibly been set to air via
     * Block.removedByPlayer
     *
     * @param worldIn the world in
     * @param player  the player
     * @param pos     the pos
     * @param state   the state
     * @param te      the te
     * @param stack   the stack
     */
    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
        if (!worldIn.isRemote && stack.getItem() == Items.SHEARS) {
            player.addStat(StatList.getBlockStats(this));
        } else {
            super.harvestBlock(worldIn, player, pos, state, te, stack);
        }
    }

    @Override
    public boolean shouldSideBeRendered(@Nonnull IBlockState blockState, @Nonnull IBlockAccess blockAccess,
                                        @Nonnull BlockPos pos, @Nonnull EnumFacing side) {
        // isOpaqueCube returns !leavesFancy to us. We have to fix the variable before calling super
        this.leavesFancy = !Blocks.LEAVES.isOpaqueCube(blockState);

        return super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }
}
