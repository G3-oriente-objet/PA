package fr.emac.gipsi.gsi.animation;

public class AnimationDiag {
	 
		/**
		 * 
		 */
		public AnimationDiag() {
			
		}

	@Override
	public void runAnimation() {
			showScreen(ecranDeb);
			ecranInt=copyScreen(ecranDeb);
			for(int lig=0;lig<ecranInt.getLigMax()+1;lig++){
				System.out.println("startSend");
				this.showScreen(ecranInt);
				for(int col=0;col<ecranInt.getColMax()+1;col++){
					col=col+1;
					ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
					col=col-1;
				}
				this.wait(400);
				
			}
			this.showScreen(ecranInt);
		// TODO Auto-generated method stub
		
	}

}
