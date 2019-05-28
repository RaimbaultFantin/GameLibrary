package jeux.assemblage;

import jeux.contract.Jeu;
import technical.exceptions.GamesNullException;

/**
 * 
 * Assemblage de deux jeux
 * @author Raimbault Fantin, Maziarz Oliwier
 *
 */
public class AssemblageOu extends AssemblageEt {

	public AssemblageOu(Jeu jeu1, Jeu jeu2) {
		super(jeu1, jeu2);
	}
	
	/**
	 * Joue au premier jeu, si il est gagn�, le second n'est pas lanc�
	 * @return boolean
	 */
	@Override
	public boolean play() throws GamesNullException{
		if(jeu1==null || jeu2==null)
			throw new GamesNullException("Exception lev�e, "+ getClass().getSimpleName() +
					" l'assemblage contient un jeu non initialis�");
		if(!jeu1.play() && !jeu2.play()) {
			etat=-1;
			return false;
		}
		etat=1;
		return true;
	}
}
