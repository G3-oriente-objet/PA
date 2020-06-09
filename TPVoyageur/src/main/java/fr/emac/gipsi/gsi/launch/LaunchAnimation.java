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
		aa.setEcranDeb(ListScreen.Eau());
		aa.setEcranFin(ListScreen.Elec());
		
		aa.runAnimation();

		aa.wait(1000);
		
		AbstractAnimation ab = new AnimationDiag();
		ab.setEcranDeb(ListScreen.Elec());
		ab.setEcranFin(ListScreen.Eau());
		
		ab.runAnimation();

	}

}
