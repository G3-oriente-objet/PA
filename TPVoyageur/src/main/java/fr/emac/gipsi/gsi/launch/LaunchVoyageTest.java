package fr.emac.gipsi.gsi.launch;

import java.util.ArrayList;

import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.voyage.Planete;
import fr.emac.gipsi.gsi.voyage.Voyage;
import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;
import fr.emac.gipsi.gsi.voyageur.VoyageurSimuler;

public class LaunchVoyageTest {

	public static void main(String[] args) {
		ArrayList<Planete> listPlanete = new ArrayList<>();

		Planete p1 = new Planete();
		p1.setColorName("HotPink");
		p1.getPos().setX(2);
		p1.getPos().setY(2);
		p1.setEchantillonSol(new Screen());
		Planete p2 = new Planete();
		p2.setColorName("RoyalBlue");
		p2.getPos().setX(2);
		p2.getPos().setY(7);
		p2.setEchantillonRoche(new Screen());
		p2.setEchantillonSol(new Screen());
		Planete p3 = new Planete();
		p3.setColorName("HotPink");
		p3.getPos().setX(2);
		p3.getPos().setY(11);
		p3.setEchantillonRoche(new Screen());
		p3.setEchantillonSol(new Screen());
		Planete p4 = new Planete();
		p4.setColorName("HotPink");
		p4.getPos().setX(7);
		p4.getPos().setY(2);
		p4.setEchantillonSol(new Screen());
		Planete p5 = new Planete();
		p5.setColorName("HotPink");
		p5.getPos().setX(7);
		p5.getPos().setY(7);
		p5.setEchantillonSol(new Screen());
		Planete p6 = new Planete();
		p6.setColorName("HotPink");
		p6.getPos().setX(7);
		p6.getPos().setY(7);
		p6.setEchantillonSol(new Screen());
		p6.setEchantillonRoche(new Screen());

		listPlanete.add(p1);
		listPlanete.add(p2);
		listPlanete.add(p3);
		listPlanete.add(p4);
		listPlanete.add(p5);
		listPlanete.add(p6);

		for (Planete p : listPlanete) {
			p.setRayon(0);
		}

		while (listPlanete.size() > 7) {
			listPlanete.remove(listPlanete.size() - 1);
		}
		// position
		int i = 0 ;
		listPlanete.get(i).getPos().setX(4);
        listPlanete.get(i).getPos().setY(1);
        listPlanete.get(i).setColorName("Yellow");
        i++;
        listPlanete.get(i).getPos().setX(6);
        listPlanete.get(i).getPos().setY(11);
        listPlanete.get(i).setColorName("RoyalBlue");
        i++;
        listPlanete.get(i).getPos().setX(2);
        listPlanete.get(i).getPos().setY(13);
        listPlanete.get(i).setColorName("Red");
        i++;
        listPlanete.get(i).getPos().setX(8);
        listPlanete.get(i).getPos().setY(2);
        listPlanete.get(i).setColorName("Green");
        i++;
        listPlanete.get(i).getPos().setX(8);
        listPlanete.get(i).getPos().setY(10);
        listPlanete.get(i).setColorName("Purple");
        i++;
        listPlanete.get(i).getPos().setX(8);
        listPlanete.get(i).getPos().setY(13);
        listPlanete.get(i).setColorName("Brown");
		
		int j = 0;
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(4));
		listPlanete.get(j).getListVisibilite().add(listPlanete.get(1));
		listPlanete.get(j).getListVisibilite().add(listPlanete.get(3));
		j++;
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(3));
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(4));
		listPlanete.get(j).getListVisibilite().add(listPlanete.get(0));
		listPlanete.get(j).getListVisibilite().add(listPlanete.get(2));
		j++;
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(4));
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(5));
		listPlanete.get(j).getListVisibilite().add(listPlanete.get(1));
		j++;
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(1));
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(4));
		listPlanete.get(j).getListVisibilite().add(listPlanete.get(0));
		j++;
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(0));
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(1));
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(2));
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(3));
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(5));
		j++;
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(2));
		listPlanete.get(j).getListAccessibilite().add(listPlanete.get(4));


		

		AbstractVoyageur simulatedVoyageur = new VoyageurSimuler(); // voyageur qui va faire le parcours

		simulatedVoyageur.getPosTete().setX(listPlanete.get(4).getPos().getX());
		simulatedVoyageur.getPosTete().setY(listPlanete.get(4).getPos().getY()+1);
		simulatedVoyageur.getPosBody().setX(listPlanete.get(4).getPos().getX());
		simulatedVoyageur.getPosBody().setY(listPlanete.get(4).getPos().getY());
		simulatedVoyageur.setDirection("E");

		Voyage voyage = new Voyage(listPlanete, simulatedVoyageur);

		voyage.lancementSimuler();
	}

}
