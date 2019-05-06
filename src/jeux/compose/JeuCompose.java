package jeux.compose;

import jeux.contract.IJeu;
import regles.Regle;
import technical.exceptions.GamesNullException;
import technical.exceptions.GamesNumbersException;

public class JeuCompose implements IJeu{

	private final int TAILLEMAX = 2;
	private IJeu[] listeDeDeuxJeux;
	private Regle regle;

	public JeuCompose(IJeu jeu1,IJeu jeu2,Regle regle) {
		listeDeDeuxJeux = new IJeu[TAILLEMAX];
		listeDeDeuxJeux[0] = jeu1;
		listeDeDeuxJeux[1] = jeu2;
		this.regle=regle;
	}

	@Override
	public boolean play(){
		try {
			if(!regle.respecte(listeDeDeuxJeux)) {
				//essaye de retourner faux, sinon catch
				return false;
			}
		} catch (GamesNumbersException e) {
			System.out.println(e.getMessage());
		} catch (GamesNullException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}
}
