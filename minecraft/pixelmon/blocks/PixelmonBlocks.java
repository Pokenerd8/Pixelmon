package pixelmon.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.forge.Configuration;

public class PixelmonBlocks {
	public static int pokemonHealerIdleId;
	public static int pokemonHealerActiveId;
	public static int thunderStoneOreId;
	public static int leafStoneOreId;
	public static int waterStoneOreId;
	public static int pcId;

	public static Block healerIdle;
	public static Block healerActive;
	public static Block thunderStoneOre;
	public static Block leafStoneOre;
	public static Block waterStoneOre;
	public static Block pc;

	public static void load(Configuration configuration) {
		pokemonHealerActiveId = Integer.parseInt(configuration.getOrCreateBlockIdProperty("PokemonHealerActive", 201).value);
		pokemonHealerIdleId = Integer.parseInt(configuration.getOrCreateBlockIdProperty("PokemonHealerIdle", 202).value);
		thunderStoneOreId = Integer.parseInt(configuration.getOrCreateBlockIdProperty("ThunderStoneOre", 203).value);
		leafStoneOreId = Integer.parseInt(configuration.getOrCreateBlockIdProperty("LeafStoneOre", 204).value);
		pcId = Integer.parseInt(configuration.getOrCreateBlockIdProperty("PC", 205).value);
		waterStoneOreId = Integer.parseInt(configuration.getOrCreateBlockIdProperty("WaterStoneOre", 206).value);
		healerIdle = (new BlockHealer(pokemonHealerIdleId, false)).setBlockName("PokeHealer");
		healerActive = (new BlockHealer(pokemonHealerActiveId, true)).setBlockName("healer");
		thunderStoneOre = new BlockEvolutionStoneOre(thunderStoneOreId, 0, 3.0f).setBlockName("ThunderStoneOre");
		leafStoneOre = new BlockEvolutionStoneOre(leafStoneOreId, 1, 3.0f).setBlockName("LeafStoneOre");
		waterStoneOre = new BlockEvolutionStoneOre(waterStoneOreId, 2, 3.0f).setBlockName("WaterStoneOre");
		pc = new BlockPC(pcId, 0, TileEntityPC.class).setBlockName("pc");
	}

	public static void registerBlocks() {
		ModLoader.registerBlock(healerIdle);
		ModLoader.registerBlock(healerActive);
		ModLoader.registerBlock(thunderStoneOre);
		ModLoader.registerBlock(leafStoneOre);
		ModLoader.registerBlock(waterStoneOre);
		ModLoader.registerBlock(pc);
	}

	public static void addNames() {
		ModLoader.addName(healerIdle, "Healer");
		ModLoader.addName(healerActive, "Healer");
		ModLoader.addName(thunderStoneOre, "Thunder Stone Ore");
		ModLoader.addName(leafStoneOre, "Leaf Stone Ore");
		ModLoader.addName(waterStoneOre, "Water Stone Ore");
		ModLoader.addName(pc, "PC");
	}

	public static void setTextureIds() {
		thunderStoneOre.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/pixelmon/block/Thunderstone.png");
		leafStoneOre.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/pixelmon/block/Leafstone.png");
		waterStoneOre.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/pixelmon/block/Waterstone.png");
		pc.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/pixelmon/block/Pcside.png");
	}
}