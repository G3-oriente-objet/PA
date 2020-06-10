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
        // TODO Auto-generated constructor stub
    }

    /**
     * @param listPlanete
     * @param simulatedVoyageur
     * @param realVoyager
     */
    public Voyage(ArrayList<Planete> listPlanete, AbstractVoyageur simulatedVoyageur, AbstractVoyageur realVoyager) {
        super(listPlanete, simulatedVoyageur, realVoyager);
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyage.AbstractVoyage#showFromPlanete(fr.emac.gipsi.gsi.voyage.Planete)
     */
    @Override
    public int showFromPlanete(Planete p) {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyage.AbstractVoyage#showAll()
     */
    @Override
    public int showAll() {
        // TODO Auto-generated method stub
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
    public void goTo(Position P) {
    	if (getSimulatedvoyageur().getPosBody().getY()<P.getY()) {
    		if (getSimulatedvoyageur().getDirection()=="O") {
    			while (getSimulatedvoyageur().getPosBody().getY()!=P.getY()) {
    				getSimulatedvoyageur().goBackward();
    			}
    		}
    		if (getSimulatedvoyageur().getDirection()=="S") {
    			getSimulatedvoyageur().turnLeft();
    			while (getSimulatedvoyageur().getPosBody().getY()!=P.getY()) {
    				getSimulatedvoyageur().goForward();
    			}
    		}
    		if (getSimulatedvoyageur().getDirection()=="N") {
    			getSimulatedvoyageur().turnRight();
    			while (getSimulatedvoyageur().getPosBody().getY()!=P.getY()) {
    				getSimulatedvoyageur().goForward();
    			}
    		}
    		if (getSimulatedvoyageur().getDirection()=="E") {
    			while (getSimulatedvoyageur().getPosBody().getY()!=P.getY()) {
    				getSimulatedvoyageur().goForward();
    			}
    		}
    	}
    	if (getSimulatedvoyageur().getPosBody().getY()>P.getY()) {
    		if (getSimulatedvoyageur().getDirection()=="O") {
    			while (getSimulatedvoyageur().getPosBody().getY()!=P.getY()) {
    				getSimulatedvoyageur().goForward();
    			}
    		}
    		if (getSimulatedvoyageur().getDirection()=="S") {
    			getSimulatedvoyageur().turnRight();
    			while (getSimulatedvoyageur().getPosBody().getY()!=P.getY()) {
    				getSimulatedvoyageur().goForward();
    			}
    		}
    		if (getSimulatedvoyageur().getDirection()=="N") {
    			getSimulatedvoyageur().turnLeft();
    			while (getSimulatedvoyageur().getPosBody().getY()!=P.getY()) {
    				getSimulatedvoyageur().goForward();
    			}
    		}
    		if (getSimulatedvoyageur().getDirection()=="E") {
    			while (getSimulatedvoyageur().getPosBody().getY()!=P.getY()) {
    				getSimulatedvoyageur().goBackward();
    			}
    		}
    	}
    	if (getSimulatedvoyageur().getPosBody().getX()<P.getX()) {
    		if (getSimulatedvoyageur().getDirection()=="N") {
    			while (getSimulatedvoyageur().getPosBody().getX()!=P.getX()) {
    				getSimulatedvoyageur().goBackward();
    				afficheEcran();
    			}
    		}
    		if (getSimulatedvoyageur().getDirection()=="O") {
    			getSimulatedvoyageur().turnLeft();
    			while (getSimulatedvoyageur().getPosBody().getX()!=P.getX()) {
    				getSimulatedvoyageur().goForward();
    			}
    		}
    		if (getSimulatedvoyageur().getDirection()=="E") {
    			getSimulatedvoyageur().turnRight();
    			while (getSimulatedvoyageur().getPosBody().getX()!=P.getX()) {
    				getSimulatedvoyageur().goForward();
    			}
    			
    		}
    		if (getSimulatedvoyageur().getDirection()=="S") {
    			while (getSimulatedvoyageur().getPosBody().getX()!=P.getX()) {
    				getSimulatedvoyageur().goForward();
    			}
    		}
    	}
    	if (getSimulatedvoyageur().getPosBody().getX()>P.getX()) {
    		if (getSimulatedvoyageur().getDirection()=="N") {
    			while (getSimulatedvoyageur().getPosBody().getX()!=P.getX()) {
    				getSimulatedvoyageur().goForward();
    			}
    		}
    		if (getSimulatedvoyageur().getDirection()=="O") {
    			getSimulatedvoyageur().turnRight();
    			while (getSimulatedvoyageur().getPosBody().getX()!=P.getX()) {
    				getSimulatedvoyageur().goForward();
    			}
    		}
    		if (getSimulatedvoyageur().getDirection()=="E") {
    			getSimulatedvoyageur().turnLeft();
    			while (getSimulatedvoyageur().getPosBody().getX()!=P.getX()) {
    				getSimulatedvoyageur().goForward();
    			}
    		}
    		if (getSimulatedvoyageur().getDirection()=="S") {
    			while (getSimulatedvoyageur().getPosBody().getX()!=P.getX()) {
    				getSimulatedvoyageur().goBackward();
    			}
    		}
    	}
    	afficheEcran();
    }
    @Override
    public void lancementSimuler() {
        // TODO Auto-generated method stub
        afficheEcran();
        getSimulatedvoyageur();
    	goTo(listPlanete.get(2).getPos());
        
    }
}
