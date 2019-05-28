import jeux.assemblage.AssemblageEt;
import jeux.assemblage.AssemblageNEssais;
import jeux.assemblage.AssemblageOu;
import jeux.contract.Jeu;
import jeux.crazy.JeuCrazy;
import jeux.devinettes.JeuDevinette;
import jeux.intrus.JeuIntru;
import jeux.pendu.JeuPendu;
import jeux.pfc.JeuPierreFeuilleCiseaux;
import jeux.pppg.JeuPlusPetitPlusGrand;
import jeux.suites.JeuSuite;
import jeux.tictactoe.JeuTicTacToe;
import technical.exceptions.GamesNullException;
import technical.exceptions.NbEssaisException;


public class AppliTest {
	public static void main(String[] args) {
		Jeu jeux1 = new JeuTicTacToe();
		Jeu jeux2 = new JeuDevinette();
		Jeu jeux3 = new JeuSuite();
		Jeu jeux4 = new JeuSuite();
		Jeu assemblage = null;
		try {
			assemblage = new AssemblageNEssais(jeux1, -4);
		} catch (NbEssaisException e1) {
			e1.printStackTrace();
		}
		Jeu assemblage2 = new AssemblageEt(assemblage,jeux3);
		try {
			assemblage2.play();
		} catch (GamesNullException e) {
			e.printStackTrace();
		}
		assemblage2.resultat();
	}
}