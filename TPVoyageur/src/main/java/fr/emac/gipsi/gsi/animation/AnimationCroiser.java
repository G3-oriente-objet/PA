package fr.emac.gipsi.gsi.animation;

import fr.emac.gipsi.gsi.screen.VisualRectangle;

public class AnimationCroiser extends AbstractAnimation {
 
		/**
		 * 
		 */
		public AnimationCroiser() {
			
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
			for (int lig = 0; lig <= (ecranInt.getLigMax());lig++) {
				for (int col = 0; col <= ecranInt.getColMax(); col++) {
					if ( (lig%5)==0 ) {
							ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
							
							ecranInt.updateColorByXY(lig, col+1, R);
							ecranInt.updateColorByXY(lig, col+2, ecranFin.getColorByXY(lig,col+2));
							ecranInt.updateColorByXY(lig+1, col, R);
							ecranInt.updateColorByXY(lig+1, col+1, B);
							ecranInt.updateColorByXY(lig+1, col+2, R);
							ecranInt.updateColorByXY(lig+2, col, W);
							ecranInt.updateColorByXY(lig+2, col+1, W);
							ecranInt.updateColorByXY(lig+2, col+2, W);
							ecranInt.updateColorByXY(lig+3, col, ecranFin.getColorByXY(lig+3,col));
							ecranInt.updateColorByXY(lig+3, col+1, W);
							ecranInt.updateColorByXY(lig+3, col+2, ecranFin.getColorByXY(lig+3,col+2));

							this.wait(100);
							this.showScreen(ecranInt);
							ecranInt.updateColorByXY(lig+1, col, ecranFin.getColorByXY(lig+1,col));
							ecranInt.updateColorByXY(lig+2, col, ecranFin.getColorByXY(lig+2,col));
							ecranInt.updateColorByXY(lig+3, col, ecranFin.getColorByXY(lig+3,col));
					} else {
							ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
							ecranInt.updateColorByXY(lig, col+1, ecranFin.getColorByXY(lig,col+1));
							ecranInt.updateColorByXY(lig, col+2, ecranFin.getColorByXY(lig,col+2));
						}}
								
							}
						

				this.wait(100);
				this.showScreen(ecranFin);
			}
		}

	