/**
 *test antoine
 */
package fr.emac.gipsi.gsi.voyageur;

import fr.emac.gipsi.gsi.voyage.Position;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class VoyageurSimuler extends AbstractVoyageur {

    /**
     *
     */
    public VoyageurSimuler() {
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#forward()
     */
    @Override
    protected void forward() {
    	if (getDirection()=="N") {
    		setPosTete(new Position(getPosTete().getX() - 1, getPosTete().getY()));
    		setPosBody(new Position(getPosBody().getX() - 1, getPosBody().getY()));
    	}	
    	if (getDirection()=="O") {
    		setPosTete(new Position(getPosTete().getX(), getPosTete().getY() - 1));
    		setPosBody(new Position(getPosBody().getX(), getPosBody().getY() - 1));
    	}
    	if (getDirection()=="S") {
    		setPosTete(new Position(getPosTete().getX() + 1, getPosTete().getY()));
    		setPosBody(new Position(getPosBody().getX() + 1, getPosBody().getY()));
    	}
    	if (getDirection()=="E") {
    		setPosTete(new Position(getPosTete().getX(), getPosTete().getY() + 1));
    		setPosBody(new Position(getPosBody().getX(), getPosBody().getY() + 1));
    	}
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#backward()
     */
    @Override
    protected void backward() {
    	if (getDirection()=="N") {
    		setPosTete(new Position(getPosTete().getX() + 1, getPosTete().getY()));
    		setPosBody(new Position(getPosBody().getX() + 1, getPosBody().getY()));
    	}	
    	if (getDirection()=="O") {
    		setPosTete(new Position(getPosTete().getX(), getPosTete().getY() + 1));
    		setPosBody(new Position(getPosBody().getX(), getPosBody().getY() + 1));
    	}
    	if (getDirection()=="S") {
    		setPosTete(new Position(getPosTete().getX() - 1, getPosTete().getY()));
    		setPosBody(new Position(getPosBody().getX() - 1, getPosBody().getY()));
    	}
    	if (getDirection()=="E") {
    		setPosTete(new Position(getPosTete().getX(), getPosTete().getY() - 1));
    		setPosBody(new Position(getPosBody().getX(), getPosBody().getY() - 1));
    	}
    		
        // TODO Auto-generated method stub
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#left()
     */
    @Override
    protected void left() {
    	if (getDirection()=="N") {
    		setPosTete(new Position(getPosTete().getX() + 1, getPosTete().getY() - 1));
    		setDirection("O");
    	}	
    	else if (getDirection()=="O") {
    		setPosTete(new Position(getPosTete().getX() + 1, getPosTete().getY() + 1));
    		setDirection("S");
    	}
    	else if (getDirection()=="S") {
    		setPosTete(new Position(getPosTete().getX() - 1, getPosTete().getY() + 1));
    		setDirection("E");
    	}
    	else if (getDirection()=="E") {
    		setPosTete(new Position(getPosTete().getX() - 1, getPosTete().getY() - 1));
    		setDirection("N");
    	}
        // TODO Auto-generated method stub
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#right()
     */
    @Override
    protected void right() {
    	if (getDirection()=="N") {
    		setPosTete(new Position(getPosTete().getX() + 1, getPosTete().getY() + 1));
    		setDirection("E");
    	}	
    	else if (getDirection()=="O") {
    		setPosTete(new Position(getPosTete().getX() - 1, getPosTete().getY() + 1));
    		setDirection("N");
    	}
    	else if (getDirection()=="S") {
    		setPosTete(new Position(getPosTete().getX() - 1, getPosTete().getY() - 1));
    		setDirection("O");
    	}
    	else if (getDirection()=="E") {
    		setPosTete(new Position(getPosTete().getX() + 1, getPosTete().getY() - 1));
    		setDirection("S");
    	}
        // TODO Auto-generated method stub
    }
}
