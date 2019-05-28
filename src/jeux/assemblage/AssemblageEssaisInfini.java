package jeux.assemblage;

import jeux.contract.Assemblage;
import jeux.contract.Jeu;
import technical.exceptions.GamesNullException;

/**
 * 
 * Assemblage d'un seul jeu à essais infini
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
			throw new GamesNullException("Exception levée, "+ getClass().getSimpleName() +
					" l'assemblage contient un jeu non initialisé");
		while(!jeu1.play());
		etat=1;
		return true;
	}
	
	/**
	 * Affiche l'etat des jeux (gagné,perdu,non joué)
	 */
	@Override
	public void resultat() {
		super.resultat();
		jeu1.resultat();
	}
}
