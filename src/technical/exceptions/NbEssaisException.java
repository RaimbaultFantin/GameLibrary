package technical.exceptions;

/**
 * 
 * Exception NbEssais : nbessais inferieur ou égal à zéro
 * @author Raimbault Fantin, Maziarz Oliwier
 *
 */
public class NbEssaisException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public NbEssaisException(String message) {
		super(message);
	}
}
