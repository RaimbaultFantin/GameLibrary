package jeux.assemblage;

import jeux.contract.Assemblage;
import jeux.contract.Jeu;
import technical.exceptions.GamesNullException;

/**
 * 
 * Assemblage de deux jeux
 * @author Raimbault Fantin, Maziarz Oliwier
 *
 */
public class AssemblageEt extends Assemblage{

	protected Jeu jeu2;

	public AssemblageEt(Jeu jeu1, Jeu jeu2) {
		super(jeu1);
		this.jeu2=jeu2;
	}

	/**
	 * Joue au premier jeu, si il est gagné, joue au second
	 * @return boolean
	 */
	@Override
	public boolean play() throws GamesNullException{
		if(jeu1==null || jeu2==null)
			throw new GamesNullException("Exception levée, "+ getClass().getSimpleName() +
					" l'assemblage contient un jeu non initialisé");
		if(!jeu1.play() || !jeu2.play()) {
			etat=-1;
			return false;
		}
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
		jeu2.resultat();
	}
}
