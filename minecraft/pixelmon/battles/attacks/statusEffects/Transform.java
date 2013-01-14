package pixelmon.battles.attacks.statusEffects;

import java.util.ArrayList;

import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.entities.pixelmon.stats.Moveset;

public class Transform extends StatusEffectBase {
	public String oldName= null;
	public Moveset oldMoveset = null;
	public Transform() {
		super(StatusEffectType.Transform, false, false, true);
		
	}


	@Override
	public void ApplyEffect(EntityPixelmon user, EntityPixelmon target,
			ArrayList<String> attackList) {
		for ( int i = 0 ; i < user.status.size() ; i++ ){
			StatusEffectBase e = user.status.get(i);
			if(e == this){
				break;
			}
			
				else{
					if(oldName == null){
					String oldName = user.getName();
					Moveset oldMoveset = user.moveset;
				}
			}
		}
						
			
		
		
	/*	user.stats.Attack = target.stats.Attack;
		user.stats.Defence = target.stats.Defence;
		user.stats.SpecialAttack = target.stats.SpecialAttack;
		user.stats.SpecialDefence = target.stats.SpecialDefence;
		user.stats.Speed = target.stats.Speed;
	*/
		ChatHandler.sendBattleMessage(user.getOwner(),  target.getOwner(), user.getNickname() + " transformed!");
			String oldNickname = user.getNickname();
			user.init(target.getName());
			user.setNickname(oldNickname);
			user.moveset = target.moveset;
			user.moveset.get(1).pp = 5; // <--- Same with that
			if(user.moveset.get(2) != null)
			user.moveset.get(2).pp = 5;
			if(user.moveset.get(3) != null)
			user.moveset.get(3).pp = 5;
			if(user.moveset.get(4) != null)
			user.moveset.get(4).pp = 5;
			user.status.add(this);
			
	
	
		
		
	}

}
