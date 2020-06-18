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
				for(int a1=0;a1<(ecranInt.getLigMax());a1++){ /*enroulement de l'ext vers l'int*/
					
					this.showScreen(ecranInt);
					for(int col=a1;col<=(m-a1-1);col++){	/*lig sup*/
						int lig = a1;
						ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
						this.wait(10);
					}
					for(int lig=a1;lig<=(n-a1-1);lig++){ /*col drt*/
						int col = m-a1;
						ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
						this.wait(10);
					}
					for(int col=(m-a1);col>=a1;col--){ /*lig inf*/
						int lig = n-a1;
						ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
						this.wait(10);
					}
					for(int lig=(n-a1);lig>=a1;lig--){ /*col gche*/
						int col = a1;
						ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
						this.wait(10);
					}
				}
				}
						
	}
