package com.taotie.theworlddisintegratespickaxe;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class RandomBlocks {
	public static Block getRandomBlocks() {
		Random random = new Random();
		switch (random.nextInt(254)) {
		case 0:
			return Blocks.AIR;
		case 1:
			return Blocks.STONE;
		case 2:
			return Blocks.GRASS;
		case 3:
			return Blocks.DIRT;
		case 4:
			return Blocks.COBBLESTONE;
		case 5:
			return Blocks.PLANKS;
		case 6:
			return Blocks.SAPLING;
		case 7:
			return Blocks.BEDROCK;
		case 8:
			return Blocks.FLOWING_WATER;
		case 9:
			return Blocks.WATER;
		case 10:
			return Blocks.FLOWING_LAVA;
		case 11:
			return Blocks.LAVA;
		case 12:
			return Blocks.SAND;
		case 13:
			return Blocks.GRAVEL;
		case 14:
			return Blocks.GOLD_ORE;
		case 15:
			return Blocks.IRON_ORE;
		case 16:
			return Blocks.COAL_ORE;
		case 17:
			return Blocks.LOG;
		case 18:
			return Blocks.LOG2;
		case 19:
			return Blocks.LEAVES;
		case 20:
			return Blocks.LEAVES2;
		case 21:
			return Blocks.SPONGE;
		case 22:
			return Blocks.GLASS;
		case 23:
			return Blocks.LAPIS_ORE;
		case 24:
			return Blocks.LAPIS_BLOCK;
		case 25:
			return Blocks.DISPENSER;
		case 26:
			return Blocks.SANDSTONE;
		case 27:
			return Blocks.NOTEBLOCK;
		case 28:
			return Blocks.BED;
		case 29:
			return Blocks.GOLDEN_RAIL;
		case 30:
			return Blocks.DETECTOR_RAIL;
		case 31:
			return Blocks.STICKY_PISTON;
		case 32:
			return Blocks.WEB;
		case 33:
			return Blocks.TALLGRASS;
		case 34:
			return Blocks.DEADBUSH;
		case 35:
			return Blocks.PISTON;
		case 36:
			return Blocks.PISTON_HEAD;
		case 37:
			return Blocks.WOOL;
		case 38:
			return Blocks.PISTON_EXTENSION;
		case 39:
			return Blocks.YELLOW_FLOWER;
		case 40:
			return Blocks.RED_FLOWER;
		case 41:
			return Blocks.BROWN_MUSHROOM;
		case 42:
			return Blocks.RED_MUSHROOM;
		case 43:
			return Blocks.GOLD_BLOCK;
		case 44:
			return Blocks.IRON_BLOCK;
		case 45:
			return Blocks.DOUBLE_STONE_SLAB;
		case 46:
			return Blocks.STONE_SLAB;
		case 47:
			return Blocks.BRICK_BLOCK;
		case 48:
			return Blocks.TNT;
		case 49:
			return Blocks.BOOKSHELF;
		case 50:
			return Blocks.MOSSY_COBBLESTONE;
		case 51:
			return Blocks.OBSIDIAN;
		case 52:
			return Blocks.TORCH;
		case 53:
			return Blocks.FIRE;
		case 54:
			return Blocks.MOB_SPAWNER;
		case 55:
			return Blocks.OAK_STAIRS;
		case 56:
			return Blocks.CHEST;
		case 57:
			return Blocks.REDSTONE_WIRE;
		case 58:
			return Blocks.DIAMOND_ORE;
		case 59:
			return Blocks.DIAMOND_BLOCK;
		case 60:
			return Blocks.CRAFTING_TABLE;
		case 61:
			return Blocks.WHEAT;
		case 62:
			return Blocks.FARMLAND;
		case 63:
			return Blocks.FURNACE;
		case 64:
			return Blocks.LIT_FURNACE;
		case 65:
			return Blocks.STANDING_SIGN;
		case 66:
			return Blocks.OAK_DOOR;
		case 67:
			return Blocks.SPRUCE_DOOR;
		case 68:
			return Blocks.BIRCH_DOOR;
		case 69:
			return Blocks.JUNGLE_DOOR;
		case 70:
			return Blocks.ACACIA_DOOR;
		case 71:
			return Blocks.DARK_OAK_DOOR;
		case 72:
			return Blocks.LADDER;
		case 73:
			return Blocks.RAIL;
		case 74:
			return Blocks.STONE_STAIRS;
		case 75:
			return Blocks.WALL_SIGN;
		case 76:
			return Blocks.LEVER;
		case 77:
			return Blocks.STONE_PRESSURE_PLATE;
		case 78:
			return Blocks.IRON_DOOR;
		case 79:
			return Blocks.WOODEN_PRESSURE_PLATE;
		case 80:
			return Blocks.REDSTONE_ORE;
		case 81:
			return Blocks.LIT_REDSTONE_ORE;
		case 82:
			return Blocks.UNLIT_REDSTONE_TORCH;
		case 83:
			return Blocks.REDSTONE_TORCH;
		case 84:
			return Blocks.STONE_BUTTON;
		case 85:
			return Blocks.SNOW_LAYER;
		case 86:
			return Blocks.ICE;
		case 87:
			return Blocks.SNOW;
		case 88:
			return Blocks.CACTUS;
		case 89:
			return Blocks.CLAY;
		case 90:
			return Blocks.REEDS;
		case 91:
			return Blocks.JUKEBOX;
		case 92:
			return Blocks.OAK_FENCE;
		case 93:
			return Blocks.SPRUCE_FENCE;
		case 94:
			return Blocks.BIRCH_FENCE;
		case 95:
			return Blocks.JUNGLE_FENCE;
		case 96:
			return Blocks.DARK_OAK_FENCE;
		case 97:
			return Blocks.ACACIA_FENCE;
		case 98:
			return Blocks.PUMPKIN;
		case 99:
			return Blocks.NETHERRACK;
		case 100:
			return Blocks.SOUL_SAND;
		case 101:
			return Blocks.GLOWSTONE;
		case 102:
			return Blocks.PORTAL;
		case 103:
			return Blocks.LIT_PUMPKIN;
		case 104:
			return Blocks.CAKE;
		case 105:
			return Blocks.UNPOWERED_REPEATER;
		case 106:
			return Blocks.POWERED_REPEATER;
		case 107:
			return Blocks.TRAPDOOR;
		case 108:
			return Blocks.MONSTER_EGG;
		case 109:
			return Blocks.STONEBRICK;
		case 110:
			return Blocks.BROWN_MUSHROOM_BLOCK;
		case 111:
			return Blocks.RED_MUSHROOM_BLOCK;
		case 112:
			return Blocks.IRON_BARS;
		case 113:
			return Blocks.GLASS_PANE;
		case 114:
			return Blocks.MELON_BLOCK;
		case 115:
			return Blocks.PUMPKIN_STEM;
		case 116:
			return Blocks.MELON_STEM;
		case 117:
			return Blocks.VINE;
		case 118:
			return Blocks.OAK_FENCE_GATE;
		case 119:
			return Blocks.SPRUCE_FENCE_GATE;
		case 120:
			return Blocks.BIRCH_FENCE_GATE;
		case 121:
			return Blocks.JUNGLE_FENCE_GATE;
		case 122:
			return Blocks.DARK_OAK_FENCE_GATE;
		case 123:
			return Blocks.ACACIA_FENCE_GATE;
		case 124:
			return Blocks.BRICK_STAIRS;
		case 125:
			return Blocks.STONE_BRICK_STAIRS;
		case 126:
			return Blocks.MYCELIUM;
		case 127:
			return Blocks.WATERLILY;
		case 128:
			return Blocks.NETHER_BRICK;
		case 129:
			return Blocks.NETHER_BRICK_FENCE;
		case 130:
			return Blocks.NETHER_BRICK_STAIRS;
		case 131:
			return Blocks.NETHER_WART;
		case 132:
			return Blocks.ENCHANTING_TABLE;
		case 133:
			return Blocks.BREWING_STAND;
		case 134:
			return Blocks.CAULDRON;
		case 135:
			return Blocks.END_PORTAL;
		case 136:
			return Blocks.END_PORTAL_FRAME;
		case 137:
			return Blocks.END_STONE;
		case 138:
			return Blocks.DRAGON_EGG;
		case 139:
			return Blocks.REDSTONE_LAMP;
		case 140:
			return Blocks.LIT_REDSTONE_LAMP;
		case 141:
			return Blocks.DOUBLE_WOODEN_SLAB;
		case 142:
			return Blocks.WOODEN_SLAB;
		case 143:
			return Blocks.COCOA;
		case 144:
			return Blocks.SANDSTONE_STAIRS;
		case 145:
			return Blocks.EMERALD_ORE;
		case 146:
			return Blocks.ENDER_CHEST;
		case 147:
			return Blocks.TRIPWIRE_HOOK;
		case 148:
			return Blocks.TRIPWIRE;
		case 149:
			return Blocks.EMERALD_BLOCK;
		case 150:
			return Blocks.SPRUCE_STAIRS;
		case 151:
			return Blocks.BIRCH_STAIRS;
		case 152:
			return Blocks.JUNGLE_STAIRS;
		case 153:
			return Blocks.COMMAND_BLOCK;
		case 154:
			return Blocks.BEACON;
		case 155:
			return Blocks.COBBLESTONE_WALL;
		case 156:
			return Blocks.FLOWER_POT;
		case 157:
			return Blocks.CARROTS;
		case 158:
			return Blocks.POTATOES;
		case 159:
			return Blocks.WOODEN_BUTTON;
		case 160:
			return Blocks.SKULL;
		case 161:
			return Blocks.ANVIL;
		case 162:
			return Blocks.TRAPPED_CHEST;
		case 163:
			return Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE;
		case 164:
			return Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE;
		case 165:
			return Blocks.UNPOWERED_COMPARATOR;
		case 166:
			return Blocks.POWERED_COMPARATOR;
		case 167:
			return Blocks.DAYLIGHT_DETECTOR;
		case 168:
			return Blocks.DAYLIGHT_DETECTOR_INVERTED;
		case 169:
			return Blocks.REDSTONE_BLOCK;
		case 170:
			return Blocks.QUARTZ_ORE;
		case 171:
			return Blocks.HOPPER;
		case 172:
			return Blocks.QUARTZ_BLOCK;
		case 173:
			return Blocks.QUARTZ_STAIRS;
		case 174:
			return Blocks.ACTIVATOR_RAIL;
		case 175:
			return Blocks.DROPPER;
		case 176:
			return Blocks.STAINED_HARDENED_CLAY;
		case 177:
			return Blocks.BARRIER;
		case 178:
			return Blocks.IRON_TRAPDOOR;
		case 179:
			return Blocks.HAY_BLOCK;
		case 180:
			return Blocks.CARPET;
		case 181:
			return Blocks.HARDENED_CLAY;
		case 182:
			return Blocks.COAL_BLOCK;
		case 183:
			return Blocks.PACKED_ICE;
		case 184:
			return Blocks.ACACIA_STAIRS;
		case 185:
			return Blocks.DARK_OAK_STAIRS;
		case 186:
			return Blocks.SLIME_BLOCK;
		case 187:
			return Blocks.DOUBLE_PLANT;
		case 188:
			return Blocks.STAINED_GLASS;
		case 189:
			return Blocks.STAINED_GLASS_PANE;
		case 190:
			return Blocks.PRISMARINE;
		case 191:
			return Blocks.SEA_LANTERN;
		case 192:
			return Blocks.STANDING_BANNER;
		case 193:
			return Blocks.WALL_BANNER;
		case 194:
			return Blocks.RED_SANDSTONE;
		case 195:
			return Blocks.RED_SANDSTONE_STAIRS;
		case 196:
			return Blocks.DOUBLE_STONE_SLAB2;
		case 197:
			return Blocks.STONE_SLAB2;
		case 198:
			return Blocks.END_ROD;
		case 199:
			return Blocks.CHORUS_PLANT;
		case 200:
			return Blocks.CHORUS_FLOWER;
		case 201:
			return Blocks.PURPUR_BLOCK;
		case 202:
			return Blocks.PURPUR_PILLAR;
		case 203:
			return Blocks.PURPUR_STAIRS;
		case 204:
			return Blocks.PURPUR_DOUBLE_SLAB;
		case 205:
			return Blocks.PURPUR_SLAB;
		case 206:
			return Blocks.END_BRICKS;
		case 207:
			return Blocks.BEETROOTS;
		case 208:
			return Blocks.GRASS_PATH;
		case 209:
			return Blocks.END_GATEWAY;
		case 210:
			return Blocks.REPEATING_COMMAND_BLOCK;
		case 211:
			return Blocks.CHAIN_COMMAND_BLOCK;
		case 212:
			return Blocks.FROSTED_ICE;
		case 213:
			return Blocks.MAGMA;
		case 214:
			return Blocks.NETHER_WART_BLOCK;
		case 215:
			return Blocks.RED_NETHER_BRICK;
		case 216:
			return Blocks.BONE_BLOCK;
		case 217:
			return Blocks.STRUCTURE_VOID;
		case 218:
			return Blocks.OBSERVER;
		case 219:
			return Blocks.WHITE_SHULKER_BOX;
		case 220:
			return Blocks.ORANGE_SHULKER_BOX;
		case 221:
			return Blocks.MAGENTA_SHULKER_BOX;
		case 222:
			return Blocks.LIGHT_BLUE_SHULKER_BOX;
		case 223:
			return Blocks.YELLOW_SHULKER_BOX;
		case 224:
			return Blocks.LIME_SHULKER_BOX;
		case 225:
			return Blocks.PINK_SHULKER_BOX;
		case 226:
			return Blocks.GRAY_SHULKER_BOX;
		case 227:
			return Blocks.SILVER_SHULKER_BOX;
		case 228:
			return Blocks.CYAN_SHULKER_BOX;
		case 229:
			return Blocks.PURPLE_SHULKER_BOX;
		case 230:
			return Blocks.BLUE_SHULKER_BOX;
		case 231:
			return Blocks.BROWN_SHULKER_BOX;
		case 232:
			return Blocks.GREEN_SHULKER_BOX;
		case 233:
			return Blocks.RED_SHULKER_BOX;
		case 234:
			return Blocks.BLACK_SHULKER_BOX;
		case 235:
			return Blocks.WHITE_GLAZED_TERRACOTTA;
		case 236:
			return Blocks.ORANGE_GLAZED_TERRACOTTA;
		case 237:
			return Blocks.MAGENTA_GLAZED_TERRACOTTA;
		case 238:
			return Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA;
		case 239:
			return Blocks.YELLOW_GLAZED_TERRACOTTA;
		case 240:
			return Blocks.LIME_GLAZED_TERRACOTTA;
		case 241:
			return Blocks.PINK_GLAZED_TERRACOTTA;
		case 242:
			return Blocks.GRAY_GLAZED_TERRACOTTA;
		case 243:
			return Blocks.SILVER_GLAZED_TERRACOTTA;
		case 244:
			return Blocks.CYAN_GLAZED_TERRACOTTA;
		case 245:
			return Blocks.PURPLE_GLAZED_TERRACOTTA;
		case 246:
			return Blocks.BLUE_GLAZED_TERRACOTTA;
		case 247:
			return Blocks.BROWN_GLAZED_TERRACOTTA;
		case 248:
			return Blocks.GREEN_GLAZED_TERRACOTTA;
		case 249:
			return Blocks.RED_GLAZED_TERRACOTTA;
		case 250:
			return Blocks.BLACK_GLAZED_TERRACOTTA;
		case 251:
			return Blocks.CONCRETE;
		case 252:
			return Blocks.CONCRETE_POWDER;
		case 253:
			return Blocks.STRUCTURE_BLOCK;
		default:
			return null;
		}
	}
}
