/**
 *
 */
package fr.emac.gipsi.gsi.voyage;

import fr.emac.gipsi.gsi.animation.AbstractAnimation;
import fr.emac.gipsi.gsi.animation.AnimationFlash;
import fr.emac.gipsi.gsi.ecran.ListScreen;
import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;

import java.util.ArrayList;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class Voyage extends AbstractVoyage {
	

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
    public double calculDist(Position R, Position P) {
    	return Math.sqrt(Math.pow((R.getX()-P.getX()),2) + Math.pow(R.getY()-P.getY(), 2));
    }
    
    public Planete min(ArrayList<Planete> listPlanete,ArrayList<Planete> listPlaneteVisit, Position P) {
    	if (listPlanete.size()==1){
    		return listPlanete.get(0);
    	}
    	else {
    		double  M = calculDist(listPlanete.get(0).getPos(), P);
    		if ((M==0)||(listPlanete.get(0).equals(listPlaneteVisit.get(listPlaneteVisit.size()-1)))) {
    			M = calculDist(listPlanete.get(1).getPos(), P); 
    		}
    		int  N = 0;
    		for (int i=1;i<listPlanete.size();i++) {
    			if ((calculDist(listPlanete.get(i).getPos(), P)<M)&&(calculDist(listPlanete.get(i).getPos(),P)!=0)&&((!listPlanete.get(i).equals(listPlaneteVisit.get(listPlaneteVisit.size()-1))))) {
    				M = calculDist(listPlanete.get(i).getPos(), P);
    				N = i;
    			}
    		}
    		return listPlanete.get(N);
    	}
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
    	int N=0;
    	for (int i=1;i<listPlanete.size();i++) {
    		if (calculDist(listPlanete.get(i).getPos(), P) == 0){
    			N=i;
    		}
    	}
    	return listPlanete.get(N);
    }
    
    public int estDans(ArrayList<Planete> alreadyVisit, Planete P) {
    	if (alreadyVisit.isEmpty()){
    		return 0;
    	}
    	for (int i=0;i<alreadyVisit.size();i++) {
    		if (alreadyVisit.get(i).equals(P)) {
    			return 1;
    		}
    	}
    	return 0;
    }
    
    public int estDansListPhoto(ArrayList<Screen> listPhotographie, Planete P) {
    	if (listPhotographie.isEmpty()){
    		return 0;
    	}
    	for (int i=0;i<listPhotographie.size();i++) {
    		if (listPhotographie.get(i).equals(P.getImage())) {
    			return 1;
    		}
    	}
    	return 0;
    }
    
    public ArrayList<Planete> enleve(ArrayList<Planete> listAccessibilite, ArrayList<Planete> alreadyVisit){
    	ArrayList<Planete> L = new ArrayList<Planete>();
    	for (int i=0;i<listAccessibilite.size();i++) {
    			if (estDans(alreadyVisit,listAccessibilite.get(i))==0){
    				L.add(listAccessibilite.get(i));
    			}
    	}
    	return L;
    }
    
    public int nbPlanAcces(ArrayList<Planete> listPlanete) {
    	ArrayList<Planete> L = new ArrayList<Planete>();
    	for (int i=0;i<listPlanete.size();i++) {
    		for (int j=0;j<listPlanete.get(i).getListAccessibilite().size();j++) {
    			if (estDans(L,listPlanete.get(i).getListAccessibilite().get(j)) == 0) {
    				L.add(listPlanete.get(i).getListAccessibilite().get(j));
    			}
    		}
    	}
    	return L.size();
    }
    
    
    
    @Override
    public void lancementSimuler() {
        // TODO Auto-generated method stub
        afficheEcran();
        ArrayList<Planete> listPlaneteVisit = new ArrayList<Planete>();
        ArrayList<Screen> listPhotographie = new ArrayList<Screen>();
        ArrayList<Screen> listEchantillonRoche = new ArrayList<Screen>();
        ArrayList<Screen> listEchantillonSol = new ArrayList<Screen>();
        
        if (estDansListPhoto(listEchantillonRoche, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
			getSimulatedvoyageur().takeEchantillonRoche(where(listPlanete,getSimulatedvoyageur().getPosBody()));
		}
		
		if (estDansListPhoto(listEchantillonSol, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
			getSimulatedvoyageur().takeEchantillonSol(where(listPlanete,getSimulatedvoyageur().getPosBody()));
		}
		
		if (estDansListPhoto(listPhotographie, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
			getSimulatedvoyageur().takePicture(where(listPlanete,getSimulatedvoyageur().getPosBody()));
		}
		
		if (where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().size()!=0) {
			for (int i=0; i<where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().size(); i++) {
				if (estDansListPhoto(listPhotographie, where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().get(i)) == 0) {
					getSimulatedvoyageur().takePicture(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().get(i));
				}
			}
		}
		
		listPlaneteVisit.add(where(listPlanete,getSimulatedvoyageur().getPosBody()));
    	
        if (estDans(getSimulatedvoyageur().getAlreadyVisit(),where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0){
			
    		getSimulatedvoyageur().getAlreadyVisit().add(where(listPlanete,getSimulatedvoyageur().getPosBody()));
    	}
        
        while (getSimulatedvoyageur().getAlreadyVisit().size()!=nbPlanAcces(listPlanete)){
    
        	
        	if (enleve(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListAccessibilite(),getSimulatedvoyageur().getAlreadyVisit()).isEmpty()) {
        	
        		if (where(listPlanete,getSimulatedvoyageur().getPosBody()).getListAccessibilite().size() != 1){ 
        		
        			goTo(min(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListAccessibilite(),listPlaneteVisit, getSimulatedvoyageur().getPosBody()).getPos());
        			
        			if (estDansListPhoto(listEchantillonRoche, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
        				getSimulatedvoyageur().takeEchantillonRoche(where(listPlanete,getSimulatedvoyageur().getPosBody()));
        			}
        			
        			if (estDansListPhoto(listEchantillonSol, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
        				getSimulatedvoyageur().takeEchantillonSol(where(listPlanete,getSimulatedvoyageur().getPosBody()));
        			}
        			if (estDansListPhoto(listPhotographie, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
        				getSimulatedvoyageur().takePicture(where(listPlanete,getSimulatedvoyageur().getPosBody()));
        			}
        			if (where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().size()!=0) {
        				for (int i=0; i<where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().size(); i++) {
        					if (estDansListPhoto(listPhotographie, where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().get(i)) == 0) {
        						getSimulatedvoyageur().takePicture(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().get(i));
        					}
        				}
        			}
            	
        		
        		}
        		else {
        			goTo(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListAccessibilite().get(0).getPos());
        			
        			if (estDansListPhoto(listEchantillonRoche, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
        				getSimulatedvoyageur().takeEchantillonRoche(where(listPlanete,getSimulatedvoyageur().getPosBody()));
        			}
        			
        			if (estDansListPhoto(listEchantillonSol, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
        				getSimulatedvoyageur().takeEchantillonSol(where(listPlanete,getSimulatedvoyageur().getPosBody()));
        			}
        			if (estDansListPhoto(listPhotographie, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
        				getSimulatedvoyageur().takePicture(where(listPlanete,getSimulatedvoyageur().getPosBody()));
        			}
        			if (where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().size()!=0) {
        				for (int i=0; i<where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().size(); i++) {
        					if (estDansListPhoto(listPhotographie, where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().get(i)) == 0) {
        						getSimulatedvoyageur().takePicture(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().get(i));
        					}
        				}
        			}
            	
        		}
        	}
        
        	else {
        		goTo(min(enleve(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListAccessibilite(),getSimulatedvoyageur().getAlreadyVisit()),listPlaneteVisit, getSimulatedvoyageur().getPosBody()).getPos());
        	
        		if (estDansListPhoto(listEchantillonRoche, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
    				getSimulatedvoyageur().takeEchantillonRoche(where(listPlanete,getSimulatedvoyageur().getPosBody()));
    			}
    			
    			if (estDansListPhoto(listEchantillonSol, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
    				getSimulatedvoyageur().takeEchantillonSol(where(listPlanete,getSimulatedvoyageur().getPosBody()));
    			}
    			if (estDansListPhoto(listPhotographie, where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0) {
    				getSimulatedvoyageur().takePicture(where(listPlanete,getSimulatedvoyageur().getPosBody()));
    			}
    			if (where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().size()!=0) {
    				for (int i=0; i<where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().size(); i++) {
    					if (estDansListPhoto(listPhotographie, where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().get(i)) == 0) {
    						getSimulatedvoyageur().takePicture(where(listPlanete,getSimulatedvoyageur().getPosBody()).getListVisibilite().get(i));
    					}
    				}
    			}
        	}
        	
        	listPlaneteVisit.add(where(listPlanete,getSimulatedvoyageur().getPosBody()));
        	
            if (estDans(getSimulatedvoyageur().getAlreadyVisit(),where(listPlanete,getSimulatedvoyageur().getPosBody())) == 0){
    			
        		getSimulatedvoyageur().getAlreadyVisit().add(where(listPlanete,getSimulatedvoyageur().getPosBody()));
        	}
        }
    }
}
