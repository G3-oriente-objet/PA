/**
 * 
 */
package fr.emac.gipsi.gsi.launch;

import fr.emac.gipsi.gsi.animation.AbstractAnimation;
import fr.emac.gipsi.gsi.animation.AnimationByColumn;
import fr.emac.gipsi.gsi.animation.AnimationDiag;
import fr.emac.gipsi.gsi.animation.AnimationFlash;
import fr.emac.gipsi.gsi.animation.AnimationLigne;
import fr.emac.gipsi.gsi.ecran.ListScreen;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class LaunchAnimation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractAnimation aa = new AnimationFlash();
		aa.setEcranDeb(ListScreen.Elec());
		aa.setEcranFin(ListScreen.Vol2());
		
		aa.runAnimation();
		
		aa.wait(700);
		
		AbstractAnimation vol = new AnimationLigne();
		vol.setEcranDeb(ListScreen.Vol1());
		vol.setEcranFin(ListScreen.Vol2());
		
		vol.runAnimation();

		vol.wait(2000);
		
		AbstractAnimation ab = new AnimationFlash();
		ab.setEcranDeb(ListScreen.Vol2());
		ab.setEcranFin(ListScreen.SolElec());
		
		AbstractAnimation ac = new AnimationFlash();
		ac.setEcranDeb(ListScreen.Psy());
		ac.setEcranFin(ListScreen.Tenebre());
		
		ac.runAnimation();

	}

}
