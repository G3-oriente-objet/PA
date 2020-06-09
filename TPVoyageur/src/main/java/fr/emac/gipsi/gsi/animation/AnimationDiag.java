package fr.emac.gipsi.gsi.animation;

public class AnimationDiag extends AbstractAnimation {
	 
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
				for(int col=0;col<ecranInt.getColMax();col++){
					col=col+1;
					ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
				}
				this.wait(100);
			}
				
			for(int lig1=ecranInt.getLigMax();lig1>=0;lig1--){
				System.out.println("startSend");
				this.showScreen(ecranInt);
				for(int col=1;col<ecranInt.getColMax()-1;col++){
					col=col+1;
					ecranInt.updateColorByXY(lig1, col, ecranFin.getColorByXY(lig1,col));
				}
				this.wait(100);
				
			}
			this.showScreen(ecranInt);
		// TODO Auto-generated method stub
		
	}
}