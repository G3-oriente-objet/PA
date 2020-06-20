/**
 * 
 */
package fr.emac.gipsi.gsi.eval;

import java.util.ArrayList;

import fr.emac.gipsi.gsi.ecran.ListScreen;
import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.voyage.Planete;
import fr.emac.gipsi.gsi.voyage.Voyage;
import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;
import fr.emac.gipsi.gsi.voyageur.VoyageurSimuler;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public abstract class AbstractLaunchEval {

	
	/**
	 * 
	 */
	public AbstractLaunchEval() {
	}
	
	public ArrayList<Screen> addScreens2ListOfScreen(){
		// ajouter vos ecrans
		ArrayList<Screen> listOfScreen = new ArrayList<>();
		listOfScreen.add(ListScreen.Eau());
		listOfScreen.add(ListScreen.Elec());
		listOfScreen.add(ListScreen.Feu());
		listOfScreen.add(ListScreen.Plante());
		listOfScreen.add(ListScreen.Psy());
		listOfScreen.add(ListScreen.Combat());
		listOfScreen.add(ListScreen.Tenebre());
		listOfScreen.add(ListScreen.SolElec());
		listOfScreen.add(ListScreen.Vol1());
		listOfScreen.add(ListScreen.Vol2());
		listOfScreen.add(ListScreen.PhotoFlash());
		listOfScreen.add(ListScreen.Photo());
		listOfScreen.add(ListScreen.Atterissage1());
		listOfScreen.add(ListScreen.Atterissage2());
		listOfScreen.add(ListScreen.Decoll());
		
		return listOfScreen;
	}

	public AbstractVoyageur createSimulatedVoyageur() {
		// ici MAJ en fonction du nom de votre class pour le voyageur simuler
		return new VoyageurSimuler();
	}
	
	public abstract ArrayList<Planete> createListPlanete();

	public void simulateVoyage(){
		ArrayList<Screen> listOfScreen = addScreens2ListOfScreen();
		ArrayList<Planete> listPlanete = createListPlanete();
		AbstractVoyageur simulatedVoyageur = createSimulatedVoyageur();
		
		int i=0;
		/*for(Planete p : listPlanete){
			p.setImage(listOfScreen.get(i%listOfScreen.size()));
			i++;
			if(p.getEchantillonRoche()!=null){
				p.setEchantillonRoche(listOfScreen.get(i%listOfScreen.size()));
				i++;
			}
			if(p.getEchantillonSol()!=null){
				p.setEchantillonSol(listOfScreen.get(i%listOfScreen.size()));
				i++;
			}			
		}*/
		simulatedVoyageur.getPosTete().setX(listPlanete.get(4).getPos().getX());
		simulatedVoyageur.getPosTete().setY(listPlanete.get(4).getPos().getY()+1);
		simulatedVoyageur.getPosBody().setX(listPlanete.get(4).getPos().getX());
		simulatedVoyageur.getPosBody().setY(listPlanete.get(4).getPos().getY());
		simulatedVoyageur.setDirection("E");
		
		Voyage voyage = new Voyage(listPlanete, simulatedVoyageur);

		voyage.lancementSimuler();
	}
}
