package jeux.contract;
/**
 * 
 * Classe Abstraite d'Assemblage de Jeu
 * @author Raimbault Fantin, Maziarz Oliwier
 *
 */
public abstract class Assemblage extends JeuAbs {
	protected Jeu jeu1;
	
	public Assemblage(Jeu jeu1) {
		this.jeu1=jeu1;
	}
}
