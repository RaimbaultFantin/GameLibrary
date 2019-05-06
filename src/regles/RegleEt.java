package regles;

import jeux.contract.IJeu;
import technical.exceptions.GamesNullException;
import technical.exceptions.GamesNumbersException;

public class RegleEt extends Regle {

	@Override
	public boolean respecte(IJeu[] listeDeDeuxJeux) throws GamesNumbersException, GamesNullException {
		if(listeDeDeuxJeux.length!=2)
			throw new GamesNumbersException("Exception lev�e, "+ getClass() +
					 " la liste ne contient pas uniquement deux jeux");
		if(listeDeDeuxJeux[0]==null || listeDeDeuxJeux[1]==null)
			throw new GamesNullException("Exception lev�e, "+ getClass() +
					 " la liste contient un jeu non initialis�");
		for (IJeu iJeu : listeDeDeuxJeux) {
			if(!iJeu.play())
				return false;
		}
		return true;
	}
}
