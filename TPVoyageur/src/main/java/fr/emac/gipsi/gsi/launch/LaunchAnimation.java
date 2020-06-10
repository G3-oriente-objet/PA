/**
 * 
 */
package fr.emac.gipsi.gsi.launch;

import fr.emac.gipsi.gsi.animation.AbstractAnimation;
import fr.emac.gipsi.gsi.animation.AnimationAR;
import fr.emac.gipsi.gsi.animation.AnimationByColumn;
import fr.emac.gipsi.gsi.animation.AnimationDiag;
import fr.emac.gipsi.gsi.animation.AnimationDirecte;
import fr.emac.gipsi.gsi.animation.AnimationFlash;
import fr.emac.gipsi.gsi.animation.AnimationLigne;
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
		
<<<<<<< HEAD
		AbstractAnimation aa = new AnimationSpirale();
		aa.setEcranDeb(ListScreen.Elec());
		aa.setEcranFin(ListScreen.Vol1());
=======
		
		AbstractAnimation aa = new AnimationFlash();
		aa.setEcranDeb(ListScreen.Atterissage2());
		aa.setEcranFin(ListScreen.Decoll());
>>>>>>> f719ef95bb6775d55080c8306bf4ed1c876cc1b6
		
		aa.runAnimation();
		aa.wait(1000);
		
		
		AbstractAnimation vol1 = new AnimationDirecte();
		vol1.setEcranDeb(ListScreen.Vol1());
		vol1.setEcranFin(ListScreen.Vol2());
		
		AbstractAnimation vol2 = new AnimationDirecte();
		vol2.setEcranDeb(ListScreen.Vol2());
		vol2.setEcranFin(ListScreen.Vol1());
		
		for (int i = 0 ; i < 3 ; i++) {
			vol1.runAnimation();
			vol1.wait(700);
			vol2.runAnimation();
			vol2.wait(700);
		}
		
		
		AbstractAnimation photo = new AnimationAR();
		photo.setEcranDeb(ListScreen.Photo());
		photo.setEcranFin(ListScreen.PhotoFlash());
		
		
		photo.runAnimation();
		photo.wait(1000);
		
<<<<<<< HEAD
		AbstractAnimation ac = new AnimationDirecte();
		ac.setEcranDeb(ListScreen.Vol1());
		ac.setEcranFin(ListScreen.Vol1());
=======
		AbstractAnimation ac = new AnimationFlash();
		ac.setEcranDeb(ListScreen.Photo());
		ac.setEcranFin(ListScreen.Plante());
>>>>>>> f719ef95bb6775d55080c8306bf4ed1c876cc1b6
		
		ac.runAnimation();
		ac.wait(1500);
		
		AbstractAnimation ab = new AnimationFlash();
		ab.setEcranDeb(ListScreen.Atterissage1());
		ab.setEcranFin(ListScreen.Atterissage2());
		
		ab.runAnimation();
		ab.wait(1000);
		
	}

}
