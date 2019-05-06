import java.util.List;

import jeux.compose.JeuCompose;
import jeux.contract.IJeu;
import jeux.devinettes.JeuDevinette;
import jeux.pendu.JeuPendu;
import jeux.suites.JeuSuite;
import regles.Regle;
import regles.RegleEssaisInfini;


public class AppliTest {
	public static void main(String[] args) {
		IJeu jeux1 = new JeuDevinette();
		IJeu jeux2 = new JeuDevinette();
		IJeu jeux3 = new JeuSuite();
		IJeu jeux4 = new JeuSuite();
		Regle regle = new RegleEssaisInfini();
		IJeu jeuxcompose1 = new JeuCompose(jeux1, jeux2,regle);
		IJeu jeuxcompose2 = new JeuCompose(jeux3, jeux4,regle);
		IJeu jeuxcomposecompose = new JeuCompose(jeuxcompose1, jeuxcompose2, regle);
		if(jeuxcomposecompose.play()) {
			System.out.println("vous avez gagné le jeu");
		}else {
			System.out.println("vous êtes nul(e)");
		}
	}
}