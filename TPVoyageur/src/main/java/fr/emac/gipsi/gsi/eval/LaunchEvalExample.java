/**
 * 
 */
package fr.emac.gipsi.gsi.eval;

import java.util.ArrayList;

import fr.emac.gipsi.gsi.ecran.ListScreen;
import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.voyage.Planete;
import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class LaunchEvalExample extends AbstractLaunchEval {

	/**
	 * 
	 */
	public LaunchEvalExample() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see fr.emac.gipsi.gsi.launch.AbstractLaunchEval#createListPlanete()
	 */
	@Override
	public ArrayList<Planete> createListPlanete() {
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
        listPlanete.get(i).setImage(ListScreen.Elec());
        i++;
        listPlanete.get(i).getPos().setX(4);
        listPlanete.get(i).getPos().setY(11);
        listPlanete.get(i).setColorName("RoyalBlue");
        listPlanete.get(i).setImage(ListScreen.Eau());
        i++;
        listPlanete.get(i).getPos().setX(2);
        listPlanete.get(i).getPos().setY(13);
        listPlanete.get(i).setColorName("Red");
        listPlanete.get(i).setImage(ListScreen.Feu());
        i++;
        listPlanete.get(i).getPos().setX(8);
        listPlanete.get(i).getPos().setY(2);
        listPlanete.get(i).setColorName("Green");
        listPlanete.get(i).setImage(ListScreen.Plante());
        i++;
        listPlanete.get(i).getPos().setX(8);
        listPlanete.get(i).getPos().setY(10);
        listPlanete.get(i).setColorName("Purple");
        listPlanete.get(i).setImage(ListScreen.Psy());
        i++;
        listPlanete.get(i).getPos().setX(8);
        listPlanete.get(i).getPos().setY(13);
        listPlanete.get(i).setColorName("Brown");
        listPlanete.get(i).setImage(ListScreen.Combat());
		
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
		
		return listPlanete;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LaunchEvalExample lee = new LaunchEvalExample();
		lee.simulateVoyage();
	}
}
