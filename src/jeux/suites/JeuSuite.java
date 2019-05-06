package jeux.suites;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import jeux.contract.IJeu;

public class JeuSuite implements IJeu{
	private final int NB;

	public JeuSuite(boolean hard) {
		if(hard) {
			NB=3;
		}else {
			NB=4;
		}
	}

	public JeuSuite() {
		this(false);
	}

	@Override
	public boolean play(){
		List<Suite> suites = Arrays.asList(
				new SuiteMystère()
				, new SuiteArithmétique(1, 10)
				, new SuiteArithmétique(7, 25)
				, new SuiteGéométrique(1, 10)
				, new SuiteGéométrique(7, 25)
				);
		Random r = new Random();
		Suite suite = suites.get(r.nextInt(suites.size()));
		List<BigInteger> termes = suite.premiersTermes(NB + 1);
		BigInteger aTrouver = termes.remove(NB);
		System.out.println("Trouvez l'entier qui suit logiquement la suite suivante : " + termes);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try {
			BigInteger valeur = new BigInteger(sc.next());
			if (valeur.equals(aTrouver)) {
				System.out.println("Bravo");
				return true;
			}
			else {
				System.out.println("Dommage");
				return false;
			}
		} catch (NumberFormatException e){
			System.out.println("Dommage");
			System.out.println(e.getMessage());
		}
		return false;
	}

//	public boolean estUnEntier(String sc) {
//		try {
//			Integer.parseInt(sc);
//			return true;
//		} catch (NumberFormatException e){
//			System.out.println(e.getMessage());
//		}
//		return false;
//	}
}
