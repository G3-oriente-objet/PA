package fr.emac.gipsi.gsi.animation;

public class AnimationAR extends AbstractAnimation {

	/**
	 * 
	 */
	public AnimationAR() {
		
	}

	@Override
	public void runAnimation() {
	
		showScreen(ecranDeb);
		wait(500);
		showScreen(ecranFin);
		wait(1000);
		showScreen(ecranDeb);
	}

}