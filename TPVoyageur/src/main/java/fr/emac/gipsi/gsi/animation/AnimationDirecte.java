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
		wait(1000);
		showScreen(ecranFin);

}

}
