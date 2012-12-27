package pixelmon.enums;

public enum EnumTrainers {
	Youngster, 
	Fisherman,
	BugCatcher,
	Ornithologist,
	MaleChildSwimmer;
	

	public static boolean has(String creatureName) {
		for (EnumTrainers trainer : values())
			if (trainer.toString().equalsIgnoreCase(creatureName))
				return true;
		return false;
	}
}
