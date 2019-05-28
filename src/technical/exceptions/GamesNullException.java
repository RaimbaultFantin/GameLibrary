package technical.exceptions;
/**
 * 
 * Exception GamesNull : jeu non initialisť
 * @author Raimbault Fantin, Maziarz Oliwier
 *
 */
public class GamesNullException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public GamesNullException(String message) {
		super(message);
	}
}
