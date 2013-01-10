package pixelmon;

import java.util.Random;

import net.minecraft.command.ServerCommandManager;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import pixelmon.battles.BattleTickHandler;
import pixelmon.blocks.apricornTrees.ApricornBonemealEvent;
import pixelmon.client.ClientPacketHandler;
import pixelmon.comm.ConnectionHandler;
import pixelmon.comm.PacketHandler;
import pixelmon.config.PixelmonConfig;
import pixelmon.config.PixelmonRecipes;
import pixelmon.database.DatabaseHelper;
import pixelmon.entities.pokeballs.EntityPokeBall;
import pixelmon.migration.Migration;
import pixelmon.pokedex.Pokedex;
import pixelmon.spawning.PixelmonSpawner;
import pixelmon.storage.PixelmonStorage;
import pixelmon.worldGeneration.WorldGenApricornTrees;
import pixelmon.worldGeneration.WorldGenBauxiteOre;
import pixelmon.worldGeneration.WorldGenFireStoneOre;
import pixelmon.worldGeneration.WorldGenFossils;
import pixelmon.worldGeneration.WorldGenLeafStoneOre;
import pixelmon.worldGeneration.WorldGenThunderStoneOre;
import pixelmon.worldGeneration.WorldGenWaterStoneOre;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "Pixelmon", name = "Pixelmon", version = "1.9.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, clientPacketHandlerSpec = @SidedPacketHandler(channels = { "Pixelmon" }, packetHandler = ClientPacketHandler.class), serverPacketHandlerSpec = @SidedPacketHandler(channels = { "Pixelmon" }, packetHandler = PacketHandler.class))
public class Pixelmon {

	public static EnumToolMaterial ALUMINUM = EnumHelper.addToolMaterial("ALUMINUM", 2, 200, 6.5F, 2, 14);
	public static EnumArmorMaterial ALUMINUMARMOR = EnumHelper.addArmorMaterial("ALUMINUM", 15, new int[] { 2, 6, 5, 2 }, 8);

	@Instance("Pixelmon")
	public static Pixelmon instance;
	public static Migration migration;

	@SidedProxy(clientSide = "pixelmon.client.ClientProxy", serverSide = "pixelmon.CommonProxy")
	public static CommonProxy proxy;

	public static boolean freeze = false;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		if (!DatabaseHelper.has()) {
			throw new RuntimeException("Can not start Pixelmon without SQLite jar or database!!! Please reinstall!!");
		}
		if (Loader.isModLoaded("Pokemobs"))
			System.exit(1);

		event.getModMetadata().version = "Pixelmon 1.9.0 for 1.4.6";

		MinecraftForge.EVENT_BUS.register(new ApricornBonemealEvent());

		PixelmonConfig.loadConfig(new Configuration(event.getSuggestedConfigurationFile()));
		Pokedex.init();
	}

	@Init
	public void load(FMLInitializationEvent event) {
		Random rand = new Random();

		NetworkRegistry.instance().registerGuiHandler(instance, proxy);
		proxy.registerKeyBindings();
		proxy.registerRenderers();
		proxy.preloadTextures();
		proxy.registerSounds();
		PixelmonRecipes.addRecipes();
		EntityRegistry.registerModEntity(EntityPokeBall.class, "Pokeball", PixelmonConfig.idPokeball, Pixelmon.instance, 80, 1, true);
		// EntityRegistry.registerModEntity(EntityCamera.class, "Camera",
		// PixelmonConfig.idCamera, Pixelmon.instance, 80, 1, true);

		NetworkRegistry.instance().registerConnectionHandler(new ConnectionHandler());

		GameRegistry.registerWorldGenerator(new WorldGenLeafStoneOre());
		GameRegistry.registerWorldGenerator(new WorldGenWaterStoneOre());
		GameRegistry.registerWorldGenerator(new WorldGenThunderStoneOre());
		GameRegistry.registerWorldGenerator(new WorldGenFireStoneOre());
		GameRegistry.registerWorldGenerator(new WorldGenApricornTrees());
		GameRegistry.registerWorldGenerator(new WorldGenBauxiteOre());
		GameRegistry.registerWorldGenerator(new WorldGenFossils());

		// GameRegistry.registerWorldGenerator(new WorldGenScatteredFeature());

		// MinecraftForge.EVENT_BUS.register(new MigrationLoader());
		MinecraftForge.EVENT_BUS.register(PixelmonStorage.PokeballManager);
		MinecraftForge.EVENT_BUS.register(PixelmonStorage.ComputerManager);

		TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
		TickRegistry.registerTickHandler(new SleepHandler(), Side.SERVER);
		TickRegistry.registerTickHandler(new TickHandler(), Side.SERVER);
		TickRegistry.registerTickHandler(new PixelmonSpawner(), Side.SERVER);
		TickRegistry.registerTickHandler(new BattleTickHandler(), Side.SERVER);
		proxy.registerTickHandlers();

		// SchematicImporter s = new
		// SchematicImporter("resources/pixelmon/structures/standAlone/Mansion.schematic");
		// s.readSchematic();
		// GameRegistry.registerWorldGenerator(new GeneralScattered(rand,
		// s.width, s.width, s));
	}

	@PostInit
	public void modsLoaded(FMLPostInitializationEvent event) {
		PixelmonConfig.removeSpawns();
	}

	@ServerStarting
	public void onServerStart(FMLServerStartingEvent event) {
		if (MinecraftServer.getServer().getCommandManager() instanceof ServerCommandManager) {
			((ServerCommandManager) MinecraftServer.getServer().getCommandManager()).registerCommand(new CommandSpawn());
			((ServerCommandManager) MinecraftServer.getServer().getCommandManager()).registerCommand(new CommandFreeze());
		}
	}

}
