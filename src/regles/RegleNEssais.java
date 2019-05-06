package regles;

import jeux.contract.IJeu;
import technical.exceptions.GamesNullException;
import technical.exceptions.GamesNumbersException;

public class RegleNEssais extends Regle{

	private int nbessais;

	public RegleNEssais(int nbessais){
		this.nbessais=nbessais;
	}

	@Override
	public boolean respecte(IJeu[] listeDeDeuxJeux) throws GamesNumbersException, GamesNullException {
		if(listeDeDeuxJeux.length!=2)
			throw new GamesNumbersException("Exception lev�e, "+ getClass() +
					" la liste ne contient pas uniquement deux jeux");
		if(listeDeDeuxJeux[0]==null || listeDeDeuxJeux[1]==null)
			throw new GamesNullException("Exception lev�e, "+ getClass() +
					" la liste contient un jeu non initialis�");
		int n = 0;
		while(n < nbessais && !listeDeDeuxJeux[0].play()) {
			n++;
		}
		if(n<nbessais && listeDeDeuxJeux[1].play()) 
			return true;
		return false;
	}
}
