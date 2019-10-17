package phrille.minecraftboom.init;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Preconditions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import phrille.minecraftboom.MinecraftBoom;
import phrille.minecraftboom.block.BlockGunpowder;
import phrille.minecraftboom.block.BlockMagmaBricks;
import phrille.minecraftboom.block.BlockMagmaCream;
import phrille.minecraftboom.block.base.BlockBase;
import phrille.minecraftboom.block.base.BlockFallingBase;
import phrille.minecraftboom.block.base.BlockPillarBase;
import phrille.minecraftboom.lib.BlockValues;
import phrille.minecraftboom.lib.Names;

public class ModBlocks
{
    public static final List<Block> BLOCKS = new ArrayList<>();

    //Bricks
    public static final Block BLOCK_COBBLESTONE_BRICKS;
    public static final Block BLOCK_MOSSY_COBBLESTONE_BRICKS;
    public static final Block BLOCK_MAGMA_BRICKS;
    public static final Block BLOCK_OBSIDIAN_BRICKS;
    public static final Block BLOCK_TERRACOTTA_BRICKS;
    public static final Block BLOCK_WHITE_TERRACOTTA_BRICKS;
    public static final Block BLOCK_ORANGE_TERRACOTTA_BRICKS;
    public static final Block BLOCK_MAGENTA_TERRACOTTA_BRICKS;
    public static final Block BLOCK_LIGHT_BLUE_TERRACOTTA_BRICKS;
    public static final Block BLOCK_YELLOW_TERRACOTTA_BRICKS;
    public static final Block BLOCK_LIME_TERRACOTTA_BRICKS;
    public static final Block BLOCK_PINK_TERRACOTTA_BRICKS;
    public static final Block BLOCK_GRAY_TERRACOTTA_BRICKS;
    public static final Block BLOCK_LIGHT_GRAY_TERRACOTTA_BRICKS;
    public static final Block BLOCK_CYAN_TERRACOTTA_BRICKS;
    public static final Block BLOCK_PURPLE_TERRACOTTA_BRICKS;
    public static final Block BLOCK_BLUE_TERRACOTTA_BRICKS;
    public static final Block BLOCK_BROWN_TERRACOTTA_BRICKS;
    public static final Block BLOCK_GREEN_TERRACOTTA_BRICKS;
    public static final Block BLOCK_RED_TERRACOTTA_BRICKS;
    public static final Block BLOCK_BLACK_TERRACOTTA_BRICKS;

    //Gravel
    public static final Block BLOCK_FINE_GRAVEL;
    public static final Block BLOCK_GRAVEL_STONE;
    public static final Block BLOCK_FINE_GRAVEL_STONE;
    public static final Block BLOCK_GRAVEL_BRICKS;

    //Polished
    public static final Block BLOCK_POLISHED_PRISMARINE;
    public static final Block BLOCK_POLISHED_DARK_PRISMARINE;
    public static final Block BLOCK_POLISHED_END_STONE;
    public static final Block BLOCK_POLISHED_NETHERRACK;
    
    //Pillars
    public static final Block BLOCK_GRANITE_PILLAR;
    public static final Block BLOCK_DIORITE_PILLAR;
    public static final Block BLOCK_ANDESITE_PILLAR;
    public static final Block BLOCK_PRISMARINE_PILLAR;
    public static final Block BLOCK_DARK_PRISMARINE_PILLAR;
    public static final Block BLOCK_END_STONE_PILLAR;
    public static final Block BLOCK_NETHERRACK_PILLAR;
    
    //Storage
    public static final Block BLOCK_CHARCOAL;
    public static final Block BLOCK_SUGAR;
    public static final Block BLOCK_SUGAR_CANE;
    public static final Block BLOCK_GUNPOWDER;
    public static final Block BLOCK_BLAZE_POWDER;
    public static final Block BLOCK_MAGMA_CREAM;
    public static final Block BLOCK_PRISMARINE_CRYSTAL;
    public static final Block BLOCK_WITHER_BONE;

    static
    {
        BLOCK_COBBLESTONE_BRICKS = registerBlock(new BlockBase(Names.BLOCK_COBBLESTONE_BRICKS, MaterialColor.STONE, BlockValues.COBBLESTONE_HARDNESS, BlockValues.COBBLESTONE_RESISTANCE));
        BLOCK_MOSSY_COBBLESTONE_BRICKS = registerBlock(new BlockBase(Names.BLOCK_MOSSY_COBBLESTONE_BRICKS, MaterialColor.STONE, BlockValues.COBBLESTONE_HARDNESS, BlockValues.COBBLESTONE_RESISTANCE));
        BLOCK_MAGMA_BRICKS = registerBlock(new BlockMagmaBricks());
        BLOCK_OBSIDIAN_BRICKS = registerBlock(new BlockBase(Names.BLOCK_OBSIDIAN_BRICKS, Material.ROCK, MaterialColor.OBSIDIAN, BlockValues.OBSIDIAN_HARDNESS, BlockValues.OBSIDIAN_RESISTANCE, SoundType.STONE));
        BLOCK_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.ADOBE, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_WHITE_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_WHITE_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.WHITE_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_ORANGE_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_ORANGE_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.ORANGE_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_MAGENTA_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_MAGENTA_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.MAGENTA_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_LIGHT_BLUE_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_YELLOW_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_YELLOW_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.YELLOW_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_LIME_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_LIME_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.LIME_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_PINK_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_PINK_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.PINK_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_GRAY_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_GRAY_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.GRAY_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_LIGHT_GRAY_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.LIGHT_GRAY_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_CYAN_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_CYAN_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.CYAN_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_PURPLE_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_PURPLE_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.PURPLE_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_BLUE_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_BLUE_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.BLUE_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_BROWN_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_BROWN_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.BROWN_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_GREEN_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_GREEN_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.GREEN_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_RED_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_RED_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.RED_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));
        BLOCK_BLACK_TERRACOTTA_BRICKS = registerBlock(new BlockBase(Names.BLOCK_BLACK_TERRACOTTA_BRICKS, Material.ROCK, MaterialColor.BLACK_TERRACOTTA, BlockValues.TERRACOTTA_HARDNESS, BlockValues.TERRACOTTA_RESISTANCE, SoundType.STONE));

        BLOCK_FINE_GRAVEL = registerBlock(new BlockFallingBase(Names.BLOCK_FINE_GRAVEL, MaterialColor.STONE, SoundType.GROUND));
        BLOCK_GRAVEL_STONE = registerBlock(new BlockBase(Names.BLOCK_GRAVEL_STONE));
        BLOCK_FINE_GRAVEL_STONE = registerBlock(new BlockBase(Names.BLOCK_FINE_GRAVEL_STONE));
        BLOCK_GRAVEL_BRICKS = registerBlock(new BlockBase(Names.BLOCK_GRAVEL_BRICKS));

        BLOCK_POLISHED_PRISMARINE = registerBlock(new BlockBase(Names.BLOCK_POLISHED_PRISMARINE, MaterialColor.CYAN));
        BLOCK_POLISHED_DARK_PRISMARINE = registerBlock(new BlockBase(Names.BLOCK_POLISHED_DARK_PRISMARINE, MaterialColor.DIAMOND));
        BLOCK_POLISHED_END_STONE = registerBlock(new BlockBase(Names.BLOCK_POLISHED_END_STONE, MaterialColor.SAND));
        BLOCK_POLISHED_NETHERRACK = registerBlock(new BlockBase(Names.BLOCK_POLISHED_NETHERRACK, MaterialColor.NETHERRACK));
        
        BLOCK_GRANITE_PILLAR = registerBlock(new BlockPillarBase(Names.BLOCK_GRANITE_PILLAR, Material.ROCK, MaterialColor.DIRT, BlockValues.STONE_HARDNESS, BlockValues.STONE_RESISTANCE, SoundType.STONE));
        BLOCK_DIORITE_PILLAR = registerBlock(new BlockPillarBase(Names.BLOCK_DIORITE_PILLAR, Material.ROCK, MaterialColor.QUARTZ, BlockValues.STONE_HARDNESS, BlockValues.STONE_RESISTANCE, SoundType.STONE));
        BLOCK_ANDESITE_PILLAR = registerBlock(new BlockPillarBase(Names.BLOCK_ANDESITE_PILLAR, Material.ROCK, MaterialColor.STONE, BlockValues.STONE_HARDNESS, BlockValues.STONE_RESISTANCE, SoundType.STONE));
        BLOCK_PRISMARINE_PILLAR = registerBlock(new BlockPillarBase(Names.BLOCK_PRISMARINE_PILLAR, Material.ROCK, MaterialColor.CYAN, BlockValues.STONE_HARDNESS, BlockValues.STONE_RESISTANCE, SoundType.STONE));
        BLOCK_DARK_PRISMARINE_PILLAR = registerBlock(new BlockPillarBase(Names.BLOCK_DARK_PRISMARINE_PILLAR, Material.ROCK, MaterialColor.DIAMOND, BlockValues.STONE_HARDNESS, BlockValues.STONE_RESISTANCE, SoundType.STONE));
        BLOCK_END_STONE_PILLAR = registerBlock(new BlockPillarBase(Names.BLOCK_END_STONE_PILLAR, Material.ROCK, MaterialColor.SAND, BlockValues.END_STONE_HARDNESS, BlockValues.END_STONE_RESISTANCE, SoundType.STONE));
        BLOCK_NETHERRACK_PILLAR = registerBlock(new BlockPillarBase(Names.BLOCK_NETHERRACK_PILLAR, Material.ROCK, MaterialColor.NETHERRACK, BlockValues.NETHER_BRICKS_HARDNESS, BlockValues.NETHERRACK_RESISTANCE, SoundType.STONE));
        
        BLOCK_CHARCOAL = registerBlock(new BlockBase(Names.BLOCK_CHARCOAL, Material.ROCK, MaterialColor.BLACK, BlockValues.COAL_BLOCK_HARDNESS, BlockValues.COAL_BLOCK_RESISTANCE, SoundType.STONE));
        BLOCK_SUGAR = registerBlock(new BlockFallingBase(Names.BLOCK_SUGAR, MaterialColor.SNOW, SoundType.SAND));
        BLOCK_SUGAR_CANE = registerBlock(new BlockPillarBase( Names.BLOCK_SUGAR_CANE, Material.LEAVES, MaterialColor.GRASS, BlockValues.PLANKS_HARDNESS, BlockValues.PLANT_BLOCK_RESISTANCE, SoundType.PLANT));
        BLOCK_GUNPOWDER = registerBlock(new BlockGunpowder());
        BLOCK_BLAZE_POWDER = registerBlock(new BlockFallingBase(Names.BLOCK_BLAZE_POWDER, MaterialColor.RED, SoundType.SNOW));
        BLOCK_MAGMA_CREAM = registerBlock(new BlockMagmaCream());
        BLOCK_PRISMARINE_CRYSTAL = registerBlock(new BlockBase(Names.BLOCK_PRISMARINE_CRYSTAL, Block.Properties.create(Material.GLASS, MaterialColor.CYAN).hardnessAndResistance(BlockValues.GLASS_HARDNESS, BlockValues.GLASS_RESISTANCE).sound(SoundType.GLASS).lightValue(5)));
        BLOCK_WITHER_BONE = registerBlock(new BlockPillarBase(Names.BLOCK_WITHER_BONE, Material.ROCK, MaterialColor.BLACK, BlockValues.BONE_BLOCK_HARDNESS, BlockValues.BONE_BLOCK_RESISTANCE, SoundType.STONE));
    }

    private static Block registerBlock(Block block)
    {
        BLOCKS.add(block);
        return block;
    }

    @Mod.EventBusSubscriber(modid = MinecraftBoom.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register
    {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event)
        {
            for (Block block : BLOCKS)
            {
                event.getRegistry().register(block);
            }
        }

        @SubscribeEvent
        public static void registerItemBlocks(RegistryEvent.Register<Item> event)
        {
            for (Block block : BLOCKS)
            {
                ItemBlock itemBlock = new ItemBlock(block, new Properties().group(CreativeTabs.MINECRAFTBOOM_TAB));
                ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has a null registry name", block);
                event.getRegistry().register(itemBlock.setRegistryName(registryName));
                CreativeTabs.tabList.add(itemBlock);
            }

            registerTileEntities();
        }

        public static void registerTileEntities()
        {
        }
    }
}