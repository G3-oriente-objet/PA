/**
 * 
 */
package fr.emac.gipsi.gsi.launch;

import fr.emac.gipsi.gsi.animation.AbstractAnimation;
import fr.emac.gipsi.gsi.animation.AnimationAR;
import fr.emac.gipsi.gsi.animation.AnimationByColumn;
import fr.emac.gipsi.gsi.animation.AnimationCroiser;
import fr.emac.gipsi.gsi.animation.AnimationDiag;
import fr.emac.gipsi.gsi.animation.AnimationDirecte;
import fr.emac.gipsi.gsi.animation.AnimationFlash;
import fr.emac.gipsi.gsi.animation.AnimationLigne;
import fr.emac.gipsi.gsi.animation.AnimationPokeball;
import fr.emac.gipsi.gsi.animation.AnimationSpirale;
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

		
		AbstractAnimation aa = new AnimationPokeball();
		aa.setEcranDeb(ListScreen.Psy());
		aa.setEcranFin(ListScreen.Feu());
		
		aa.runAnimation();
				
	}

}
