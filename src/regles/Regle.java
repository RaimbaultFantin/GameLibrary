package regles;

import jeux.contract.IJeu;
import technical.exceptions.GamesNullException;
import technical.exceptions.GamesNumbersException;

public abstract class Regle {
	public abstract boolean respecte(IJeu[] listeDeDeuxJeux) throws GamesNumbersException, GamesNullException;
}
