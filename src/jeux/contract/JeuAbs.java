package jeux.contract;
/**
 * 
 * Classe Abstraite JeuAbs
 * @author Raimbault Fantin, Maziarz Oliwier
 *
 */
public abstract class JeuAbs implements Jeu{
	// état du jeu par défaut
	protected int etat = 0;
	
	public void resultat() {
		if(etat<0)
			System.out.println(getClass().getSimpleName()+ " : perdu");
		else if(etat>0)
			System.out.println(getClass().getSimpleName()+ " : gagné");
		else
			System.out.println(getClass().getSimpleName()+ " : non joué");
	}
}