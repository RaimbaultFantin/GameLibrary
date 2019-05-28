package jeux.assemblage;

import jeux.contract.Assemblage;
import jeux.contract.Jeu;
import technical.exceptions.GamesNullException;
import technical.exceptions.NbEssaisException;
/**
 * 
 * Assemblage d'un jeu à N essais
 * @author Raimbault Fantin, Maziarz Oliwier
 *
 */
public class AssemblageNEssais extends AssemblageEssaisInfini {

	private int nbessais;

	public AssemblageNEssais(Jeu jeu1,int nbessais) throws NbEssaisException {
		super(jeu1);
		if(nbessais<=0)
			throw new NbEssaisException("Exception levée "+ getClass().getSimpleName()+
					" le nombre d'essais est invalide");
		this.nbessais=nbessais;
	}
	
	/**
	 * Joue au jeu n fois
	 * @return boolean
	 */
	@Override
	public boolean play() throws GamesNullException {
		if(jeu1==null)
			throw new GamesNullException("Exception levée, "+ getClass().getSimpleName() +
					" l'assemblage contient un jeu non initialisé");
		for (int i = 0; i < nbessais; i++) {
			if(jeu1.play()) {
				etat=1;
				return true;
			}
		}
		etat=-1;
		return false;
	}

}