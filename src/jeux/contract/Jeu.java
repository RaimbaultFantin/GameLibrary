package jeux.contract;

import technical.exceptions.GamesNullException;
/**
 * 
 * Interface Jeu
 * @author Raimbault Fantin, Maziarz Oliwier
 *
 */
public interface Jeu {
	/**
	 * Joue au jeu
	 * @return boolean
	 */
	boolean play() throws GamesNullException;
	
	/**
	 * Affiche le resultat du jeu (gagn�,perdu,non jou�)
	 */
	void resultat();
}