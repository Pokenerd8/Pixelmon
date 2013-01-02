package pixelmon.battles.attacks.specialAttacks;

import java.util.ArrayList;
import java.util.Random;

import pixelmon.battles.attacks.Attack;
import pixelmon.battles.attacks.statusEffects.Poison;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class Twineedle extends SpecialAttackBase {

	public Twineedle() {
		super(SpecialAttackType.Twineedle, ApplyStage.During, false);
		
	}

	@Override
	public boolean ApplyEffect(EntityPixelmon user, EntityPixelmon target,
			Attack a, ArrayList<String> attackList,
			ArrayList<String> targetAttackList) {
		
		Random rand = new Random();
		if((rand.nextInt(10)+1) <=4){
			target.status.add(new Poison());
			ChatHandler.sendBattleMessage(user.getOwner(),  target.getOwner(), target.getNickname() + " was poisoned!");
		}
		else{}
		ChatHandler.sendBattleMessage(user.getOwner(),  target.getOwner(), user.getNickname() + " was hit two times!");
		return false;
	}

}
