package pixelmon.config;

import java.lang.reflect.Field;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.Configuration;
import pixelmon.Pixelmon;
import pixelmon.enums.EnumEthers;
import pixelmon.enums.EnumEvolutionStone;
import pixelmon.enums.EnumPotions;
import pixelmon.enums.EnumStatusAilmentHealers;
import pixelmon.items.ItemBlock;
import pixelmon.items.ItemEther;
import pixelmon.items.ItemEvolutionStone;
import pixelmon.items.ItemHammer;
import pixelmon.items.ItemHeld;
import pixelmon.items.ItemPixelmonArmor;
import pixelmon.items.ItemPokedex;
import pixelmon.items.ItemPokemonFossil;
import pixelmon.items.ItemPotion;
import pixelmon.items.ItemStatusAilmentHealer;
import pixelmon.items.PixelmonItem;
import pixelmon.items.heldItems.ItemBerryLeppa;
import pixelmon.items.heldItems.ItemBerryOran;
import pixelmon.items.heldItems.ItemBerryRawst;
import pixelmon.items.heldItems.ItemExpShare;
import pixelmon.items.heldItems.ItemLuckyEgg;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.LanguageRegistry;
//import pixelmon.items.heldItems.ItemEverstone;

public class PixelmonItems {
	public static int itemID = 10000;
	public static int pokeDexID;

	public static int rareCandyID;
	public static int potionID;
	public static int superPotionID;
	public static int hyperPotionID;
	public static int maxPotionID;
	public static int etherID;
	public static int maxEtherID;
	public static int elixirID;
	public static int maxElixirID;
	public static int fullRestoreID;
	public static int antidoteID;
	public static int parlyzHealID;
	public static int awakeningID;
	public static int burnHealID;
	public static int iceHealID;
	public static int fullHealID;

	public static int pcItemID;
	public static int healerItemID;
	public static int anvilItemID;
	public static int tradeMachineItemID;

	public static int fireStoneID;
	public static int waterStoneID;
	public static int moonStoneID;
	public static int thunderStoneID;
	public static int leafStoneID;
	public static int thunderStoneShardID;
	public static int leafStoneShardID;
	public static int waterStoneShardID;
	public static int fireStoneShardID;
	public static int everStoneShardID;

	public static int luckyEggID;
	public static int expShareID;
	public static int everStoneID;

	public static int berryOranID;
	public static int berryRawstID;
	public static int berryLeppaID;

	public static int hammerWoodID;
	public static int hammerStoneID;
	public static int hammerIronID;
	public static int hammerGoldID;
	public static int hammerDiamondID;
	public static int hammerAluminumID;
	
	public static int swordAluminumID;
	public static int axeAluminumID;
	public static int shovelAluminumID;
	public static int pickaxeAluminumID;
	public static int hoeAluminumID;
	
	public static int helmetAluminumID;
	public static int torsoAluminumID;
	public static int leggingsAluminumID;
	public static int bootsAluminumID;

	public static int aluminumIngotID;
	public static int aluminumPlateID;
	
	@Mod.Item(name = "Pokedex", typeClass = "pixelmon.items.ItemPokedex")
	public static Item pokeDex;

	@Mod.Item(name = "Rare Candy", typeClass = "pixelmon.items.PixelmonItem")
	public static Item rareCandy;

	@Mod.Item(name = "Potion", typeClass = "pixelmon.items.ItemPotion")
	public static Item potion;
	@Mod.Item(name = "Super Potion", typeClass = "pixelmon.items.ItemPotion")
	public static Item superPotion;
	@Mod.Item(name = "Hyper Potion", typeClass = "pixelmon.items.ItemPotion")
	public static Item hyperPotion;
	@Mod.Item(name = "Max Potion", typeClass = "pixelmon.items.ItemPotion")
	public static Item maxPotion;
	@Mod.Item(name = "Ether", typeClass = "pixelmon.items.ItemEther")
	public static Item ether;
	@Mod.Item(name = "Max Ether", typeClass = "pixelmon.items.ItemEther")
	public static Item maxEther;
	@Mod.Item(name = "Elixir", typeClass = "pixelmon.items.ItemEther")
	public static Item elixir;
	@Mod.Item(name = "Max Elixir", typeClass = "pixelmon.items.ItemEther")
	public static Item maxElixir;
	@Mod.Item(name = "Full Restore", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item fullRestore;
	@Mod.Item(name = "Antidote", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item antidote;
	@Mod.Item(name = "Parlyz Heal", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item parlyzHeal;
	@Mod.Item(name = "Awakening", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item awakening;
	@Mod.Item(name = "Burn Heal", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item burnHeal;
	@Mod.Item(name = "Ice Heal", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item iceHeal;
	@Mod.Item(name = "Full Heal", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item fullHeal;

	@Mod.Item(name = "Fire Stone", typeClass = "pixelmon.items.ItemEvolutionStone")
	public static Item fireStone;
	@Mod.Item(name = "Water Stone", typeClass = "pixelmon.items.ItemEvolutionStone")
	public static Item waterStone;
	@Mod.Item(name = "Moon Stone", typeClass = "pixelmon.items.ItemEvolutionStone")
	public static Item moonStone;
	@Mod.Item(name = "Thunder Stone", typeClass = "pixelmon.items.ItemEvolutionStone")
	public static Item thunderStone;
	@Mod.Item(name = "Leaf Stone", typeClass = "pixelmon.items.ItemEvolutionStone")
	public static Item leafStone;
	// @Mod.Item(name = "Everstone", typeClass =
	// "pixelmon.items.ItemEvolutionStone")
	// public static Item Everstone;

	@Mod.Item(name = "PC", typeClass = "pixelmon.items.ItemBlock")
	public static Item pcItem;
	@Mod.Item(name = "Healer", typeClass = "pixelmon.items.ItemBlock")
	public static Item healerItem;
	@Mod.Item(name = "Anvil", typeClass = "pixelmon.items.ItemBlock")
	public static Item anvilItem;
	@Mod.Item(name = "Trade Machine", typeClass = "pixelmon.items.ItemBlock")
	public static Item tradeMachineItem;

	@Mod.Item(name = "Thunder Stone Shard", typeClass = "pixelmon.items.PixelmonItem")
	public static Item thunderStoneShard;
	@Mod.Item(name = "Leaf Stone Shard", typeClass = "pixelmon.items.PixelmonItem")
	public static Item leafStoneShard;
	@Mod.Item(name = "Water Stone Shard", typeClass = "pixelmon.items.PixelmonItem")
	public static Item waterStoneShard;
	@Mod.Item(name = "Fire Stone Shard", typeClass = "pixelmon.items.PixelmonItem")
	public static Item fireStoneShard;
	// @Mod.Item(name = "Ever Stone Shard", typeClass =
	// "pixelmon.items.PixelmonItem")
	// public static Item everStoneShard;

	@Mod.Item(name = "Lucky Egg", typeClass = "pixelmon.items.heldItems.ItemLuckyEgg")
	public static Item luckyEgg;
	@Mod.Item(name = "EXP Share", typeClass = "pixelmon.items.heldItems.ItemExpShare")
	public static Item expShare;

	@Mod.Item(name = "Oran Berry", typeClass = "pixelmon.items.heldItems.ItemBerryOran")
	public static Item berryOran;
	@Mod.Item(name = "Rawst Berry", typeClass = "pixelmon.items.heldItems.ItemBerryRawst")
	public static Item berryRawst;
	@Mod.Item(name = "Leppa Berry", typeClass = "pixelmon.items.heldItems.ItemBerryLeppa")
	public static Item berryLeppa;

	@Mod.Item(name = "Wood Hammer", typeClass = "pixelmon.items.ItemHammer")
	public static Item hammerWood;
	@Mod.Item(name = "Stone Hammer", typeClass = "pixelmon.items.ItemTool")
	public static Item hammerStone;
	@Mod.Item(name = "Iron Hammer", typeClass = "pixelmon.items.ItemTool")
	public static Item hammerIron;
	@Mod.Item(name = "Gold Hammer", typeClass = "pixelmon.items.ItemTool")
	public static Item hammerGold;
	@Mod.Item(name = "Diamond Hammer", typeClass = "pixelmon.items.ItemTool")
	public static Item hammerDiamond;
	@Mod.Item(name = "Aluminum Hammer", typeClass = "pixelmon.items.ItemTool")
	public static Item hammerAluminum;
	
	
	@Mod.Item(name = "Aluminum Ingot", typeClass = "pixelmon.items.PixelmonItem")
	public static Item aluminumIngot;
	@Mod.Item(name = "Aluminum Plate", typeClass = "pixelmon.items.PixelmonItem")
	public static Item aluminumPlate;
	
	@Mod.Item(name = "Aluminum Sword", typeClass = "pixelmon.items.ItemTool")
	public static Item swordAluminum;
	@Mod.Item(name = "Aluminum Axe", typeClass = "pixelmon.items.ItemTool")
	public static Item axeAluminum;
	@Mod.Item(name = "Aluminum Spade", typeClass = "pixelmon.items.ItemTool")
	public static Item spadeAluminum;
	@Mod.Item(name = "Aluminum Pickaxe", typeClass = "pixelmon.items.ItemTool")
	public static Item pickaxeAluminum;
	@Mod.Item(name = "Aluminum Hoe", typeClass = "pixelmon.items.ItemTool")
	public static Item hoeAluminum;

	@Mod.Item(name = "Aluminum Helmet", typeClass = "pixelmon.items.ItemPixelmonArmor")
	public static Item helmetAluminum;
	@Mod.Item(name = "Aluminum Chestplate", typeClass = "pixelmon.items.ItemPixelmonArmor")
	public static Item torsoAluminum;
	@Mod.Item(name = "Aluminum Leggings", typeClass = "pixelmon.items.ItemPixelmonArmor")
	public static Item leggingsAluminum;
	@Mod.Item(name = "Aluminum Boots", typeClass = "pixelmon.items.ItemPixelmonArmor")
	public static Item bootsAluminum;


	public static void load(Configuration cfg) {
		PixelmonItemsPokeballs.load(cfg);
		PixelmonItemsApricorns.load(cfg);
		PixelmonItemsBadges.load(cfg);
		PixelmonItemsTMs.load(cfg);
		PixelmonItemsFossils.load(cfg);

		pokeDexID = cfg.get("item", "PokeDex", 10027).getInt();
		rareCandyID = cfg.get("item", "RareCandy", 10005).getInt();
		potionID = cfg.get("item", "Potion", 10006).getInt();
		superPotionID = cfg.get("item", "SuperPotion", 10050).getInt();
		hyperPotionID = cfg.get("item", "HyperPotion", 10051).getInt();
		maxPotionID = cfg.get("item", "MaxPotion", 10052).getInt();
		etherID = cfg.get("item", "Ether", 10053).getInt();
		maxEtherID = cfg.get("item", "MaxEther", 10054).getInt();
		elixirID = cfg.get("item", "Elixir", 10055).getInt();
		maxElixirID = cfg.get("item", "MaxElixir", 10056).getInt();
		fullRestoreID = cfg.get("item", "FullRestore", 10057).getInt();
		antidoteID = cfg.get("item", "Antidote", 10058).getInt();
		parlyzHealID = cfg.get("item", "ParlyzHeal", 10059).getInt();
		awakeningID = cfg.get("item", "Awakening", 10060).getInt();
		burnHealID = cfg.get("item", "BurnHeal", 10061).getInt();
		iceHealID = cfg.get("item", "IceHeal", 10062).getInt();
		fullHealID = cfg.get("item", "FullHeal", 10063).getInt();
		pcItemID = cfg.get("item", "PCItem", 10013).getInt();
		healerItemID = cfg.get("item", "HealerItem", 10014).getInt();
		anvilItemID = cfg.get("item", "AnvilItem", 10015).getInt();
		tradeMachineItemID = cfg.get("item", "TradeMachineItem", 10016).getInt();

		fireStoneID = cfg.get("evolutionStone", "FireStone", 10008).getInt();
		waterStoneID = cfg.get("evolutionStone", "WaterStone", 10009).getInt();
		moonStoneID = cfg.get("evolutionStone", "MoonStone", 10010).getInt();
		thunderStoneID = cfg.get("evolutionStone", "ThunderStone", 10011).getInt();
		everStoneID = cfg.get("evolutionStone", "EverStone", 100126).getInt();
		leafStoneID = cfg.get("evolutionStone", "LeafStone", 10012).getInt();
		thunderStoneShardID = cfg.get("evolutionStone", "ThunderStoneShard", 10021).getInt();
		leafStoneShardID = cfg.get("evolutionStone", "LeafStoneShard", 10022).getInt();
		waterStoneShardID = cfg.get("evolutionStone", "WaterStoneShard", 10023).getInt();
		fireStoneShardID = cfg.get("evolutionStone", "FireStoneShard", 10024).getInt();
		// everStoneShardID = cfg.get("EverStoneShard", "item", 10025).getInt();

		luckyEggID = cfg.get("heldItem", "LuckyEgg", 10035).getInt();
		expShareID = cfg.get("heldItem", "EXPShare", 10036).getInt();

		berryOranID = cfg.get("berry", "OranBerry", 10040).getInt();
		berryRawstID = cfg.get("berry", "RawstBerry", 10041).getInt();
		berryLeppaID = cfg.get("berry", "LeppaBerry", 10042).getInt();

		hammerWoodID = cfg.get("item", "Wood Hammer", 10107).getInt();
		hammerStoneID = cfg.get("item", "Stone Hammer", 10108).getInt();
		hammerIronID = cfg.get("item", "Iron Hammer", 10109).getInt();
		hammerGoldID = cfg.get("item", "Gold Hammer", 10110).getInt();
		hammerDiamondID = cfg.get("item", "Diamond Hammer", 10111).getInt();
		hammerAluminumID = cfg.get("item", "Aluminum Hammer", 10122).getInt();
		
		aluminumIngotID = cfg.get("item", "AluminumIngot", 10120).getInt();
		aluminumPlateID = cfg.get("item", "AluminumPlate", 10121).getInt();
		
		swordAluminumID = cfg.get("item", "Aluminum Sword", 10123).getInt();
		axeAluminumID = cfg.get("item", "Aluminum Axe", 10124).getInt();
		shovelAluminumID = cfg.get("item", "Aluminum Shovel", 10125).getInt();
		pickaxeAluminumID = cfg.get("item", "Aluminum Pickaxe", 10126).getInt();
		hoeAluminumID = cfg.get("item", "Aluminum Hoe", 10127).getInt();
		
		helmetAluminumID = cfg.get("item", "Aluminum Helmet", 10128).getInt();
		torsoAluminumID = cfg.get("item", "Aluminum Chestplate", 10129).getInt();
		leggingsAluminumID = cfg.get("item", "Aluminum Leggings", 10130).getInt();
		bootsAluminumID = cfg.get("item", "Aluminum Boots", 10131).getInt();

		pokeDex = new ItemPokedex(pokeDexID).setItemName("Pokedex").setIconIndex(18).setMaxStackSize(1);
		rareCandy = new PixelmonItem(rareCandyID).setItemName("Rare Candy").setIconIndex(6).setCreativeTab(PixelmonCreativeTabs.restoration);
		potion = new ItemPotion(potionID, EnumPotions.Potion).setItemName("Potion");
		superPotion = new ItemPotion(superPotionID, EnumPotions.SuperPotion).setItemName("Super Potion");
		hyperPotion = new ItemPotion(hyperPotionID, EnumPotions.HyperPotion).setItemName("Hyper Potion");
		maxPotion = new ItemPotion(maxPotionID, EnumPotions.MaxPotion).setItemName("Max Potion");
		ether = new ItemEther(etherID, EnumEthers.Ether).setItemName("Ether");
		maxEther = new ItemEther(maxEtherID, EnumEthers.MaxEther).setItemName("Max Ether");
		elixir = new ItemEther(elixirID, EnumEthers.Elixir).setItemName("Elixir");
		maxElixir = new ItemEther(maxElixirID, EnumEthers.MaxElixir).setItemName("Max Elixir");
		fullRestore = new ItemStatusAilmentHealer(fullRestoreID, EnumStatusAilmentHealers.FullRestore).setItemName("Full Restore");
		antidote = new ItemStatusAilmentHealer(antidoteID, EnumStatusAilmentHealers.Antidote).setItemName("Antidonte");
		parlyzHeal = new ItemStatusAilmentHealer(parlyzHealID, EnumStatusAilmentHealers.ParlyzHeal).setItemName("Parlyz Heal");
		awakening = new ItemStatusAilmentHealer(awakeningID, EnumStatusAilmentHealers.Awakening).setItemName("Awakening");
		burnHeal = new ItemStatusAilmentHealer(burnHealID, EnumStatusAilmentHealers.BurnHeal).setItemName("Burn Heal");
		iceHeal = new ItemStatusAilmentHealer(iceHealID, EnumStatusAilmentHealers.IceHeal).setItemName("Ice Heal");
		fullHeal = new ItemStatusAilmentHealer(fullHealID, EnumStatusAilmentHealers.FullHeal).setItemName("Full Heal");
		fireStone = new ItemEvolutionStone(fireStoneID, EnumEvolutionStone.Firestone, 3).setItemName("FireStone").setCreativeTab(PixelmonCreativeTabs.natural);
		waterStone = new ItemEvolutionStone(waterStoneID, EnumEvolutionStone.Waterstone, 1).setItemName("WaterStone").setCreativeTab(
				PixelmonCreativeTabs.natural);
		moonStone = new ItemEvolutionStone(moonStoneID, EnumEvolutionStone.Moonstone, 4).setItemName("MoonStone").setCreativeTab(PixelmonCreativeTabs.natural);
		thunderStone = new ItemEvolutionStone(thunderStoneID, EnumEvolutionStone.Thunderstone, 0).setItemName("ThunderStone").setCreativeTab(
				PixelmonCreativeTabs.natural);
		leafStone = new ItemEvolutionStone(leafStoneID, EnumEvolutionStone.Leafstone, 2).setItemName("LeafStone").setCreativeTab(PixelmonCreativeTabs.natural);
		pcItem = new ItemBlock(pcItemID, PixelmonBlocks.pc, 34).setItemName("PC");
		healerItem = new ItemBlock(healerItemID, PixelmonBlocks.healer, 50).setItemName("Healer");
		anvilItem = new ItemBlock(anvilItemID, PixelmonBlocks.anvil, 66).setItemName("Anvil");
		tradeMachineItem = new ItemBlock(tradeMachineItemID, PixelmonBlocks.tradeMachine, 146).setItemName("Trade Machine");

		thunderStoneShard = new PixelmonItem(thunderStoneShardID).setItemName("ThunderStoneShard").setIconIndex(3).setCreativeTab(PixelmonCreativeTabs.natural);
		leafStoneShard = new PixelmonItem(leafStoneShardID).setItemName("LeafStoneShard").setIconIndex(35).setCreativeTab(PixelmonCreativeTabs.natural);
		waterStoneShard = new PixelmonItem(waterStoneShardID).setItemName("WaterStoneShard").setIconIndex(19).setCreativeTab(PixelmonCreativeTabs.natural);
		fireStoneShard = new PixelmonItem(fireStoneShardID).setItemName("FireStoneShard").setIconIndex(51).setCreativeTab(PixelmonCreativeTabs.natural);
		luckyEgg = new ItemLuckyEgg(luckyEggID).setItemName("LuckyEgg").setIconIndex(7);
		expShare = new ItemExpShare(expShareID).setItemName("ExpShare").setIconIndex(23);
		// everStoneShard = new
		// PixelmonItem(everStoneShardID).setItemName("EverstoneShard").setIconIndex(60);
		
		berryOran = new ItemBerryOran(berryOranID).setItemName("OranBerry").setIconIndex(5);
		berryLeppa = new ItemBerryLeppa(berryLeppaID).setItemName("LeppaBerry").setIconIndex(21);
		berryRawst = new ItemBerryRawst(berryRawstID).setItemName("RawstBerry").setIconIndex(37);
		
		aluminumIngot = new PixelmonItem(aluminumIngotID).setItemName("AluminumIngot").setIconIndex(233).setCreativeTab(CreativeTabs.tabMaterials);
		aluminumPlate = new PixelmonItem(aluminumPlateID).setItemName("AluminumPlate").setIconIndex(249).setCreativeTab(CreativeTabs.tabMaterials);
		
		hammerWood = new ItemHammer(hammerWoodID, EnumToolMaterial.WOOD, 251).setItemName("Wood Hammer");
		hammerStone = new ItemHammer(hammerStoneID, EnumToolMaterial.STONE, 252).setItemName("Stone Hammer");
		hammerIron = new ItemHammer(hammerIronID, EnumToolMaterial.IRON, 253).setItemName("Iron Hammer");
		hammerGold = new ItemHammer(hammerGoldID, EnumToolMaterial.GOLD, 255).setItemName("Gold Hammer");
		hammerDiamond = new ItemHammer(hammerDiamondID, EnumToolMaterial.EMERALD, 254).setItemName("Diamond Hammer");
		hammerAluminum = new ItemHammer(hammerAluminumID, Pixelmon.ALUMINUM, 250).setItemName("Aluminum Hammer");
		
		swordAluminum = new ItemSword(swordAluminumID, Pixelmon.ALUMINUM).setIconIndex(219).setItemName("Aluminum Sword").setTextureFile("/pixelmon/image/pitems.png");
		axeAluminum = new ItemAxe(axeAluminumID, Pixelmon.ALUMINUM).setIconIndex(222).setItemName("Aluminum Axe").setTextureFile("/pixelmon/image/pitems.png");
		spadeAluminum = new ItemSpade(shovelAluminumID, Pixelmon.ALUMINUM).setIconIndex(220).setItemName("Aluminum Shovel").setTextureFile("/pixelmon/image/pitems.png");
		pickaxeAluminum = new ItemPickaxe(pickaxeAluminumID, Pixelmon.ALUMINUM).setIconIndex(221).setItemName("Aluminum Pickaxe").setTextureFile("/pixelmon/image/pitems.png");
		hoeAluminum = new ItemHoe(hoeAluminumID, Pixelmon.ALUMINUM).setIconIndex(223).setItemName("Aluminum Hoe").setTextureFile("/pixelmon/image/pitems.png");

		helmetAluminum = new ItemPixelmonArmor(helmetAluminumID, 14, Pixelmon.ALUMINUMARMOR, 0, 0).setIconIndex(204).setItemName("Aluminum Helmet").setTextureFile("/pixelmon/image/pitems.png");
		torsoAluminum = new ItemPixelmonArmor(torsoAluminumID, 8, Pixelmon.ALUMINUMARMOR, 0, 1).setIconIndex(205).setItemName("Aluminum Chestplate").setTextureFile("/pixelmon/image/pitems.png");
		leggingsAluminum = new ItemPixelmonArmor(leggingsAluminumID, 9, Pixelmon.ALUMINUMARMOR, 0, 2).setIconIndex(206).setItemName("Aluminum Leggings").setTextureFile("/pixelmon/image/pitems.png");
		bootsAluminum = new ItemPixelmonArmor(bootsAluminumID, 7, Pixelmon.ALUMINUMARMOR, 0, 3).setIconIndex(207).setItemName("Aluminum Boots").setTextureFile("/pixelmon/image/pitems.png");
	

	}

	public static void addNames() {
		PixelmonItemsPokeballs.addNames();
		PixelmonItemsApricorns.addNames();
		PixelmonItemsBadges.addNames();
		PixelmonItemsTMs.addNames();
		PixelmonItemsFossils.addNames();
		try {
			for (Field field : PixelmonItems.class.getFields()) {
				if (field.isAnnotationPresent(Mod.Item.class)) {
					Item item = (Item) field.get(null);
					LanguageRegistry.addName(item, field.getAnnotation(Mod.Item.class).name());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Item getFossilItem(int id) {
		try {
			for (Field field : PixelmonItems.class.getFields()) {
				if (field.isAnnotationPresent(Mod.Item.class)) {
					Item item = (Item) field.get(null);
					if (item instanceof ItemPokemonFossil)
						if (item.shiftedIndex == id)
							return item;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Item getHeldItem(int id) {
		try {
			for (Field field : PixelmonItems.class.getFields()) {
				if (field.isAnnotationPresent(Mod.Item.class)) {
					Item item = (Item) field.get(null);
					if (item instanceof ItemHeld)
						if (item.shiftedIndex == id)
							return item;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Item getItem(int id) {
		try {
			for (Field field : PixelmonItems.class.getFields()) {
				if (field.isAnnotationPresent(Mod.Item.class)) {
					Item item = (Item) field.get(null);
					if (item.shiftedIndex == id)
						return item;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
