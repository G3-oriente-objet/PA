package fr.emac.gipsi.gsi.animation;

import fr.emac.gipsi.gsi.screen.VisualRectangle;

public class AnimationPokeball extends AbstractAnimation {
 
		/**
		 * 
		 */
		public AnimationPokeball() {
			
		}

		@Override
		public void runAnimation() {
			ecranInt = copyScreen(ecranDeb);
			
			VisualRectangle R = new VisualRectangle();
			R.setNomCouleur("Red");
			
			VisualRectangle W = new VisualRectangle();
			W.setNomCouleur("White");
			
			VisualRectangle B = new VisualRectangle();
			B.setNomCouleur("Black");
			
			VisualRectangle Gold = new VisualRectangle();
			Gold.setNomCouleur("Gold");
			
			for (int lig = 0; lig <= (ecranInt.getLigMax()-4);lig++)  {
				for (int col = 0; col <= (ecranInt.getColMax()-4); col++) {
					
							ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
							ecranInt.updateColorByXY(lig+4, col, ecranFin.getColorByXY(lig+4,col));
							ecranInt.updateColorByXY(lig, col+1, R);
							ecranInt.updateColorByXY(lig, col+2, R);
							ecranInt.updateColorByXY(lig, col+3, R);
							ecranInt.updateColorByXY(lig+1, col, R);
							ecranInt.updateColorByXY(lig+1, col+1, R);
							ecranInt.updateColorByXY(lig+1, col+2, R);
							ecranInt.updateColorByXY(lig+1, col+3, R);
							ecranInt.updateColorByXY(lig+1, col+4, R);
							ecranInt.updateColorByXY(lig+2, col, B);
							ecranInt.updateColorByXY(lig+2, col+1, B);
							ecranInt.updateColorByXY(lig+2, col+2, Gold); /*bouton*/
							ecranInt.updateColorByXY(lig+2, col+3, B);
							ecranInt.updateColorByXY(lig+2, col+4, B);
							ecranInt.updateColorByXY(lig+3, col, W);
							ecranInt.updateColorByXY(lig+3, col+1, W);
							ecranInt.updateColorByXY(lig+3, col+2, W);
							ecranInt.updateColorByXY(lig+3, col+3, W);
							ecranInt.updateColorByXY(lig+3, col+4, W);
							ecranInt.updateColorByXY(lig+4, col+1, W);
							ecranInt.updateColorByXY(lig+4, col+2, W);
							ecranInt.updateColorByXY(lig+4, col+3, W);
							
							if(col>= 1) {
							ecranInt.updateColorByXY(lig+1, col-1, ecranFin.getColorByXY(lig+1,col-1));
							ecranInt.updateColorByXY(lig+2, col-1, ecranFin.getColorByXY(lig+2,col-1));
							ecranInt.updateColorByXY(lig+3, col-1, ecranFin.getColorByXY(lig+3,col-1));}
							
							this.showScreen(ecranInt);
							this.wait(25);
							
							if(col==ecranInt.getColMax()-4) {
								for (int f = 0; f <= 4; f++) {
									ecranInt.updateColorByXY(lig, col+f, ecranFin.getColorByXY(lig,col+f));
									ecranInt.updateColorByXY(lig+1, col+f, ecranFin.getColorByXY(lig+1,col+f));
									ecranInt.updateColorByXY(lig+2, col+f, ecranFin.getColorByXY(lig+2,col+f));
									ecranInt.updateColorByXY(lig+3, col+f, ecranFin.getColorByXY(lig+3,col+f));
									ecranInt.updateColorByXY(lig+4, col+f, ecranFin.getColorByXY(lig+4,col+f));
								this.showScreen(ecranInt);
								this.wait(25);}
							
				}}}			
				
								
							
						

				
				this.showScreen(ecranFin);
			}
		}


