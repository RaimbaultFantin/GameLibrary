package jeux.pppg;

import java.util.Random;
import java.util.Scanner;

import jeux.contract.Jeu;
import jeux.contract.JeuAbs;

public class JeuPlusPetitPlusGrand extends JeuAbs{

	private final int MAX;
	private final long NB;
	public JeuPlusPetitPlusGrand(boolean hard) {
		if(hard) {
			MAX=1000;
		}else {
			MAX=100;
		}
		NB = Math.round(Math.log(MAX) / Math.log(2));
	}

	public JeuPlusPetitPlusGrand() {
		this(false);
	}

	@Override
	public boolean play() {
		System.out.println("Vous devez trouver une valeur comprise entre 1 et " + MAX + " en moins de " + NB + " tentatives");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int aTrouver = 1 + new Random().nextInt(MAX);
		System.out.println("Entrez une valeur");
		try {
			int valeur = sc.nextInt();
			int nb = 1;
			while (valeur != aTrouver && nb < NB) {
				if (valeur < aTrouver)
					System.out.println("c'est plus grand");
				else
					System.out.println("c'est plus petit");
				System.out.println("Entrez une valeur");
				valeur = sc.nextInt();
				++nb;
			}
			if (valeur == aTrouver) {
				System.out.println("Bravo");
				etat=1;
				return true;
			}

			else {
				System.out.println("Dommage");
				etat=-1;
				return false;
			}
		}
		catch(RuntimeException e) {
			e.printStackTrace();
			etat=-1;
			return false;
		}
	}
}
