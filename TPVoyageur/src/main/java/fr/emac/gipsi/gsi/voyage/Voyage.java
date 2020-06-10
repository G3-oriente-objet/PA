/**
 *
 */
package fr.emac.gipsi.gsi.voyage;

import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;

import java.util.ArrayList;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class Voyage extends AbstractVoyage {
	
	int M, N,i;

    /**
     * @param listPlanete
     * @param simulatedVoyageur
     */
    public Voyage(ArrayList<Planete> listPlanete, AbstractVoyageur simulatedVoyageur) {
        super(listPlanete, simulatedVoyageur);
        // TODO optimisation du parcours
      
    }

    /**
     * @param listPlanete
     * @param simulatedVoyageur
     * @param realVoyager
     */
    public Voyage(ArrayList<Planete> listPlanete, AbstractVoyageur simulatedVoyageur, AbstractVoyageur realVoyager) {
        super(listPlanete, simulatedVoyageur, realVoyager);
        // TODO affecter le trajet au robot
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyage.AbstractVoyage#showFromPlanete(fr.emac.gipsi.gsi.voyage.Planete)
     */
    @Override
    public int showFromPlanete(Planete p) {
        // TODO afficher la photo de la planète
        return 0;
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyage.AbstractVoyage#showAll()
     */
    @Override
    public int showAll() {
        // TODO Map des planètes avec le vaisseau
        return 0;
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyage.AbstractVoyage#pilotage()
     */
    @Override
    public void lancement() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyage.AbstractVoyage#pilotageSimuler()
     */
    public int calculDist(Position R, Position P) {
    	return ((R.getX()-P.getX())^2 + (R.getY()-P.getY())^2)^(1/2);
    }
    
    public Planete min(ArrayList<Planete> listPlanete, Position P) {
    	 M = calculDist(listPlanete.get(0).getPos(), P);
    	 N = 0;
    	for (i=1;i<listPlanete.size();i++) {
    		if (calculDist(listPlanete.get(i).getPos(), P)<M) {
    			M = calculDist(listPlanete.get(i).getPos(), P);
    			N = i;
    		}
    	}
    	return listPlanete.get(N);
    }
    @Override
    public void lancementSimuler() {
        // TODO Auto-generated method stub
        afficheEcran();
        
    }
}
