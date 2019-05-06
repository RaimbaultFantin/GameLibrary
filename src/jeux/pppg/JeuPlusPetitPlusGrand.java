package jeux.pppg;

import java.util.Random;
import java.util.Scanner;

import jeux.contract.IJeu;

public class JeuPlusPetitPlusGrand implements IJeu{

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

	@Override
	public boolean play() {
		System.out.println("Vous devez trouver une valeur comprise entre 1 et " + MAX + " en moins de " + NB + " tentatives");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int aTrouver = 1 + new Random().nextInt(MAX);
		System.out.println("Entrez une valeur");
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
			return true;
		}

		else {
			System.out.println("Dommage");
			return false;
		}
	}
}
