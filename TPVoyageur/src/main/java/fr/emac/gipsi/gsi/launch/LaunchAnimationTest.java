/**
 * 
 */
package fr.emac.gipsi.gsi.launch;

import fr.emac.gipsi.gsi.animation.AbstractAnimation;
import fr.emac.gipsi.gsi.animation.AnimationAR;
import fr.emac.gipsi.gsi.animation.AnimationByColumn;

import fr.emac.gipsi.gsi.animation.AnimationCroiser;
import fr.emac.gipsi.gsi.animation.AnimationCroix;

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
public class LaunchAnimationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		AbstractAnimation aa = new AnimationSpirale();
		aa.setEcranDeb(ListScreen.Atterissage2());
		aa.setEcranFin(ListScreen.Decoll());
		
		aa.runAnimation();
		
		AbstractAnimation ab = new AnimationSpirale();
		ab.setEcranDeb(ListScreen.Decoll());
		ab.setEcranFin(ListScreen.Photo());
		
		ab.runAnimation();
	}
}