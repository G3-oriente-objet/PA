package fr.emac.gipsi.gsi.animation;

public class AnimationDirecte extends AbstractAnimation {

	/**
	 * 
	 */
	public AnimationDirecte() {
		
	}

	@Override
	public void runAnimation() {
	
		showScreen(ecranDeb);
		wait(500);
		showScreen(ecranFin);

}

}
