/**
 *
 */
package fr.emac.gipsi.gsi.voyage;

import fr.emac.gipsi.gsi.animation.AbstractAnimation;
import fr.emac.gipsi.gsi.animation.AnimationFlash;
import fr.emac.gipsi.gsi.ecran.ListScreen;
import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;

import java.util.ArrayList;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class Voyage extends AbstractVoyage {
	
	int M, N,i,j;
	ArrayList<Planete> L;

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
    	 if (M==0) {
    		 M = calculDist(listPlanete.get(1).getPos(), P); 
    	 }
    	 N = 0;
    	for (i=1;i<listPlanete.size();i++) {
    		if ((calculDist(listPlanete.get(i).getPos(), P)<M)&&(calculDist(listPlanete.get(i).getPos(),P)!=0)) {
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
    public Planete where(ArrayList<Planete> listPlanete, Position P) {
    	N=0;
    	for (i=0;i<listPlanete.size();i++) {
    		if (calculDist(listPlanete.get(i).getPos(), P) == 0){
    			N=i;
    		}
    	}
    	return listPlanete.get(N);
    }
    
    public ArrayList<Planete> enleve(ArrayList<Planete> listAccessibilite, ArrayList<Planete> alreadyVisit){
    	L = new ArrayList<Planete>();
    	for (i=0;i<listAccessibilite.size();i++) {
    		for (j = 0;j<alreadyVisit.size();j++) {
    			if (listAccessibilite.get(i)==alreadyVisit.get(j)) {
    				L.add(listAccessibilite.get(i));
    			}
    		}
    	}
    	return L;
    }
    
    
    
    @Override
    public void lancementSimuler() {
        // TODO Auto-generated method stub
        afficheEcran();
        while getAlreadyVisit().size()!=nbplaneteavecsol
        if (enleve(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListAccessibilite(),getAlreadyVisit()) == []) {
        	if (where(listPlanete,getSimulatedvoyageur().getPosBody()).getListAccessibilite().size() != 1){ 
        		goTo(min(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListAccessibilite(),getSimulatedvoyageur().getPosBody()).getPos());
        	}
        	else {
        		goTo(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListAccessibilite(0));
        	}
        }
        else {
        	goTo(min(enleve(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListAccessibilite(),getAlreadyVisit()),getSimulatedvoyageur().getPosBody()).getPos()));
        }
    	goTo(min(listPlanete,getSimulatedvoyageur().getPosBody()).getPos());
    	goTo(min(listPlanete,getSimulatedvoyageur().getPosBody()).getPos());
        
    }
}
