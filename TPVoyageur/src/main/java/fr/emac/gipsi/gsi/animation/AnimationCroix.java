
package fr.emac.gipsi.gsi.animation;

public class AnimationCroix extends AbstractAnimation {

		/**
	 	*
	 	**/
	
		public AnimationCroix() {
		}
	@Override
	public void runAnimation() {
		showScreen(ecranDeb);
		ecranInt=copyScreen(ecranDeb);
		int n = ecranInt.getLigMax();
		int m = ecranInt.getColMax();
		for (int i = 0 ; i <= n  ; i++) {
			showScreen(ecranInt);
			ecranInt.updateColorByXY(i,i,ecranFin.getColorByXY(i, i));
			ecranInt.updateColorByXY(i,n - i,ecranFin.getColorByXY(i, n - i));
			wait(50);
		}
		
		for (int j = 0 ; j < n/2 ; j++ ) {
			for (int a = 0 ; a < n-2*j; a++) {
				ecranInt.updateColorByXY(j ,j + a ,ecranFin.getColorByXY(j, j + a));
				ecranInt.updateColorByXY(n - j , j + a ,ecranFin.getColorByXY(n - j, j + a));
				ecranInt.updateColorByXY(j + a ,j ,ecranFin.getColorByXY(j +  a , j));
				ecranInt.updateColorByXY(j + a , n - j ,ecranFin.getColorByXY(j + a , n - j));
				showScreen(ecranInt);
				wait(50);
			}
		}
	}
}
