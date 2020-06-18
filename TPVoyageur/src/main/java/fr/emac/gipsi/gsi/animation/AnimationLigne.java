package fr.emac.gipsi.gsi.animation;

public class AnimationLigne extends AbstractAnimation {
	 
		/**
		 * 
		 */
		public AnimationLigne() {
			
		}

	@Override
	public void runAnimation() {
			showScreen(ecranDeb);
			ecranInt=copyScreen(ecranDeb);
			for(int lig=0;lig<ecranInt.getLigMax()+1;lig++){
				System.out.println("startSend");
				this.showScreen(ecranInt);
				for(int col=0;col<ecranInt.getColMax()+1;col++){
					ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
				}
				this.wait(200);
				
			}
			this.showScreen(ecranInt);
		// TODO Auto-generated method stub
		
	}

}
