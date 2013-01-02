package pixelmon.battles.attacks.specialAttacks;

import java.util.ArrayList;

import pixelmon.battles.attacks.Attack;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class Transform extends SpecialAttackBase {

	public Transform(SpecialAttackType type, ApplyStage a, boolean persists) {
		super(SpecialAttackType.Transform, ApplyStage.During, true);

	}

	@Override
	public boolean ApplyEffect(EntityPixelmon user, EntityPixelmon target,
			Attack a, ArrayList<String> attackList,
			ArrayList<String> targetAttackList) {

		user.stats.Attack = target.stats.Attack;
		user.model = target.model; // <--- that was a lot easier than i thought it was going to be!
		user.transformed = true;
		user.moveset = target.moveset;
		
		
		return true;
	}

}
