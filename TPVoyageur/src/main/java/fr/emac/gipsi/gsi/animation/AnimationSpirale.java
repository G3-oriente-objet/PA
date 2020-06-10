package fr.emac.gipsi.gsi.animation;

public class AnimationSpirale extends AbstractAnimation {
	 

		/**
		 * 
		 */
		public AnimationSpirale() {
			
		}

	@Override
	public void runAnimation() {
			showScreen(ecranDeb);
			ecranInt=copyScreen(ecranDeb);
			int n = ecranInt.getLigMax();
			int m = ecranInt.getColMax();
			int a = 0;
				for(int a1=0;a1<(ecranInt.getLigMax()/2);a1++){
					System.out.println("startSend");
					this.showScreen(ecranInt);
					for(int col=a1;col<(m-a1-1);col++){	
						int lig = a1;
						ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
						this.wait(10);
					}
					for(int lig=a1;lig<(n-a1-1);lig++){
						int col = m-a1-1;
						ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
						this.wait(10);
					}
					for(int col=(m-a1-1);col>=a1;col--){
						int lig = n-a1-1;
						ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
						this.wait(10);
					}
					for(int lig=(n-a1-1);lig>=a1;lig--){
						int col = a1;
						ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
						this.wait(10);
					}
				}
				}
						
	}
