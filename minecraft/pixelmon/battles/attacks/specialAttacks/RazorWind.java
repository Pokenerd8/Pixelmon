package pixelmon.battles.attacks.specialAttacks;

import java.util.ArrayList;

import pixelmon.battles.attacks.Attack;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;
public class RazorWind extends MultiTurnSpecialAttackBase {

	public RazorWind() {
		super(MultiTurnSpecialAttackType.RazorWind, 2);
	}

	@Override
	public boolean ApplyEffect(EntityPixelmon user, EntityPixelmon target, Attack a, ArrayList<String> attackList, ArrayList<String> targetAttackList) {
		if (!persists){
			persists = true;
			turnCounter=0;
		}
		turnCounter++;
		if (turnCounter == 1){
			ChatHandler.sendBattleMessage(user.getOwner(), target.getOwner(), user.getName() + " whips up a strong wind!");
			return true;
		}else{
			persists = false;
			return false;
		}

	}

	@Override
	public boolean cantMiss() {
		if (turnCounter ==0) return true;
		return false;
	}

}
