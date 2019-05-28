package jeux.assemblage;

import jeux.contract.Assemblage;
import jeux.contract.Jeu;
import technical.exceptions.GamesNullException;

/**
 * 
 * Assemblage d'un seul jeu � essais infini
 * @author Raimbault Fantin, Maziarz Oliwier
 * 
 */

public class AssemblageEssaisInfini extends Assemblage {

	public AssemblageEssaisInfini(Jeu jeu1) {
		super(jeu1);
	}
	/**
	 * Joue au jeu avec essais infini
	 * @return boolean
	 */
	@Override
	public boolean play() throws GamesNullException {
		if(jeu1==null)
			throw new GamesNullException("Exception lev�e, "+ getClass().getSimpleName() +
					" l'assemblage contient un jeu non initialis�");
		while(!jeu1.play());
		etat=1;
		return true;
	}
	
	/**
	 * Affiche l'etat des jeux (gagn�,perdu,non jou�)
	 */
	@Override
	public void resultat() {
		super.resultat();
		jeu1.resultat();
	}
}
