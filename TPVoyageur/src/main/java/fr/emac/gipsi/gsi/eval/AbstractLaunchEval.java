/**
 * 
 */
package fr.emac.gipsi.gsi.eval;

import java.util.ArrayList;

import fr.emac.gipsi.gsi.animation.AbstractAnimation;
import fr.emac.gipsi.gsi.animation.AnimationAR;
import fr.emac.gipsi.gsi.animation.AnimationByColumn;
import fr.emac.gipsi.gsi.animation.AnimationCroix;
import fr.emac.gipsi.gsi.animation.AnimationDiag;
import fr.emac.gipsi.gsi.animation.AnimationDirecte;
import fr.emac.gipsi.gsi.animation.AnimationFlash;
import fr.emac.gipsi.gsi.animation.AnimationLigne;
import fr.emac.gipsi.gsi.animation.AnimationPokeball;
import fr.emac.gipsi.gsi.animation.AnimationSpirale;
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
		listOfScreen.add(ListScreen.Sol());
		listOfScreen.add(ListScreen.Roche());
		
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
		for(Planete p : listPlanete){
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
		}
		simulatedVoyageur.getPosTete().setX(listPlanete.get(4).getPos().getX());
		simulatedVoyageur.getPosTete().setY(listPlanete.get(4).getPos().getY() + 1);
		simulatedVoyageur.getPosBody().setX(listPlanete.get(4).getPos().getX());
		simulatedVoyageur.getPosBody().setY(listPlanete.get(4).getPos().getY());
		simulatedVoyageur.setDirection("E");
		


		AbstractAnimation aa = new AnimationSpirale();
		aa.setEcranDeb(ListScreen.Sol());
		aa.setEcranFin(ListScreen.Decoll());
		
		aa.runAnimation();
		


		AbstractAnimation ab = new AnimationByColumn();

		ab.setEcranDeb(ListScreen.Decoll());
		ab.setEcranFin(ListScreen.Photo());
		
		ab.runAnimation();
		
		AbstractAnimation ac = new AnimationAR();
		ac.setEcranDeb(ListScreen.Photo());
		ac.setEcranFin(ListScreen.PhotoFlash());
		
		ac.runAnimation();
		
		AbstractAnimation ad = new AnimationPokeball();
		ad.setEcranDeb(ListScreen.PhotoFlash());
		ad.setEcranFin(ListScreen.Psy());
		
		ad.runAnimation();
		
		AbstractAnimation ae = new AnimationDiag();
		ae.setEcranDeb(ListScreen.Psy());
		ae.setEcranFin(ListScreen.Vol2());
		
		ae.runAnimation();
		
		AbstractAnimation af = new AnimationFlash();
		af.setEcranDeb(ListScreen.Vol2());
		af.setEcranFin(ListScreen.Vol1());
		
		af.runAnimation();
		
		AbstractAnimation ag = new AnimationByColumn();
		ag.setEcranDeb(ListScreen.Vol1());
		ag.setEcranFin(ListScreen.Photo());
		
		ag.runAnimation();
		
		AbstractAnimation ah = new AnimationAR();
		ah.setEcranDeb(ListScreen.Photo());
		ah.setEcranFin(ListScreen.PhotoFlash());
		
		ah.runAnimation();
		
		AbstractAnimation ai = new AnimationPokeball();
		ai.setEcranDeb(ListScreen.PhotoFlash());
		ai.setEcranFin(ListScreen.Combat());
		
		ai.runAnimation();
		
		AbstractAnimation aj = new AnimationCroix();
		aj.setEcranDeb(ListScreen.Combat());
		aj.setEcranFin(ListScreen.Atterissage1());
		
		aj.runAnimation();
		
		AbstractAnimation ak = new AnimationFlash();
		ak.setEcranDeb(ListScreen.Atterissage1());
		ak.setEcranFin(ListScreen.Atterissage2());
		
		ak.runAnimation();
		
		AbstractAnimation al = new AnimationSpirale();
		al.setEcranDeb(ListScreen.Atterissage2());
		al.setEcranFin(ListScreen.Roche());
		
		al.runAnimation();
		
		AbstractAnimation am = new AnimationDirecte();
		am.setEcranDeb(ListScreen.Roche());
		am.setEcranFin(ListScreen.Sol());
		
		am.runAnimation();
		
		AbstractAnimation an = new AnimationSpirale();
		an.setEcranDeb(ListScreen.Sol());
		an.setEcranFin(ListScreen.Decoll());
		
		an.runAnimation();
		
		AbstractAnimation ao = new AnimationDiag();
		ao.setEcranDeb(ListScreen.Decoll());
		ao.setEcranFin(ListScreen.Vol2());
		
		ao.runAnimation();
		
		AbstractAnimation ap = new AnimationFlash();
		ap.setEcranDeb(ListScreen.Vol2());
		ap.setEcranFin(ListScreen.Vol1());
		
		ap.runAnimation();
		
		AbstractAnimation aq = new AnimationByColumn();
		aq.setEcranDeb(ListScreen.Vol1());
		aq.setEcranFin(ListScreen.Photo());
		
		aq.runAnimation();
		
		AbstractAnimation ar = new AnimationAR();
		ar.setEcranDeb(ListScreen.Photo());
		ar.setEcranFin(ListScreen.PhotoFlash());
		
		ar.runAnimation();
		
		AbstractAnimation as = new AnimationPokeball();
		as.setEcranDeb(ListScreen.PhotoFlash());
		as.setEcranFin(ListScreen.Feu());
		
		as.runAnimation();
		
		AbstractAnimation at = new AnimationCroix();
		at.setEcranDeb(ListScreen.Feu());
		at.setEcranFin(ListScreen.Atterissage1());
		
		at.runAnimation();
		
		AbstractAnimation au = new AnimationFlash();
		au.setEcranDeb(ListScreen.Atterissage1());
		au.setEcranFin(ListScreen.Atterissage2());
		
		au.runAnimation();
		
		AbstractAnimation av = new AnimationSpirale();
		av.setEcranDeb(ListScreen.Atterissage2());
		av.setEcranFin(ListScreen.Roche());
		
		av.runAnimation();
		
		AbstractAnimation aw = new AnimationDirecte();
		aw.setEcranDeb(ListScreen.Roche());
		aw.setEcranFin(ListScreen.Sol());
		
		aw.runAnimation();
		
		AbstractAnimation ax = new AnimationSpirale();
		ax.setEcranDeb(ListScreen.Sol());
		ax.setEcranFin(ListScreen.Decoll());
		
		ax.runAnimation();
		
		
		AbstractAnimation ay = new AnimationByColumn();
		ay.setEcranDeb(ListScreen.Decoll());
		ay.setEcranFin(ListScreen.Photo());
		
		ay.runAnimation();

		AbstractAnimation az = new AnimationAR();
		az.setEcranDeb(ListScreen.Photo());
		az.setEcranFin(ListScreen.PhotoFlash());
		
		az.runAnimation();
		
		AbstractAnimation ba = new AnimationPokeball();
		ba.setEcranDeb(ListScreen.PhotoFlash());
		ba.setEcranFin(ListScreen.Eau());
		
		ba.runAnimation();
		
		AbstractAnimation bb = new AnimationDiag();
		bb.setEcranDeb(ListScreen.Eau());
		bb.setEcranFin(ListScreen.Vol2());
		
		bb.runAnimation();
		
		AbstractAnimation bc = new AnimationFlash();
		bc.setEcranDeb(ListScreen.Vol2());
		bc.setEcranFin(ListScreen.Vol1());
		
		bc.runAnimation();
		
		AbstractAnimation bd = new AnimationCroix();
		bd.setEcranDeb(ListScreen.Vol1());
		bd.setEcranFin(ListScreen.Atterissage1());
		
		bd.runAnimation();
		
		AbstractAnimation be = new AnimationFlash();
		be.setEcranDeb(ListScreen.Atterissage1());
		be.setEcranFin(ListScreen.Atterissage2());
		
		be.runAnimation();
		
		AbstractAnimation bf = new AnimationLigne();
		bf.setEcranDeb(ListScreen.Atterissage2());
		bf.setEcranFin(ListScreen.Decoll());
		
		bf.runAnimation();
		
		AbstractAnimation bg = new AnimationDiag();
		bg.setEcranDeb(ListScreen.Decoll());
		bg.setEcranFin(ListScreen.Vol2());
		
		bg.runAnimation();
		
		AbstractAnimation bh = new AnimationFlash();
		bh.setEcranDeb(ListScreen.Vol2());
		bh.setEcranFin(ListScreen.Vol1());
		
		bh.runAnimation();
		
		AbstractAnimation bi = new AnimationCroix();
		bi.setEcranDeb(ListScreen.Vol1());
		bi.setEcranFin(ListScreen.Atterissage1());
		
		bi.runAnimation();
		
		AbstractAnimation bj = new AnimationFlash();
		bj.setEcranDeb(ListScreen.Atterissage1());
		bj.setEcranFin(ListScreen.Atterissage2());
		
		bj.runAnimation();
		
		AbstractAnimation bk = new AnimationSpirale();
		bk.setEcranDeb(ListScreen.Atterissage2());
		bk.setEcranFin(ListScreen.Roche());
		
		bk.runAnimation();
		
		AbstractAnimation bl = new AnimationDirecte();
		bl.setEcranDeb(ListScreen.Roche());
		bl.setEcranFin(ListScreen.Sol());
		
		bl.runAnimation();
		
		AbstractAnimation bm = new AnimationSpirale();
		bm.setEcranDeb(ListScreen.Sol());
		bm.setEcranFin(ListScreen.Decoll());
		
		bm.runAnimation();
		
		
		AbstractAnimation bn = new AnimationByColumn();
		bn.setEcranDeb(ListScreen.Decoll());
		bn.setEcranFin(ListScreen.Photo());
		
		bn.runAnimation();

		AbstractAnimation bo = new AnimationAR();
		bo.setEcranDeb(ListScreen.Photo());
		bo.setEcranFin(ListScreen.PhotoFlash());
		
		bo.runAnimation();
		
		AbstractAnimation bp = new AnimationPokeball();
		bp.setEcranDeb(ListScreen.PhotoFlash());
		bp.setEcranFin(ListScreen.Elec());
		
		bp.runAnimation();
		
		AbstractAnimation bq = new AnimationDiag();
		bq.setEcranDeb(ListScreen.Elec());
		bq.setEcranFin(ListScreen.Vol2());
		
		bq.runAnimation();
		
		AbstractAnimation br = new AnimationFlash();
		br.setEcranDeb(ListScreen.Vol2());
		br.setEcranFin(ListScreen.Vol1());
		
		br.runAnimation();
		
		AbstractAnimation bs = new AnimationByColumn();
		bs.setEcranDeb(ListScreen.Vol1());
		bs.setEcranFin(ListScreen.Photo());
		
		bs.runAnimation();
		
		AbstractAnimation bt = new AnimationAR();
		bt.setEcranDeb(ListScreen.Photo());
		bt.setEcranFin(ListScreen.PhotoFlash());
		
		bt.runAnimation();
		
		AbstractAnimation bu = new AnimationPokeball();
		bu.setEcranDeb(ListScreen.PhotoFlash());
		bu.setEcranFin(ListScreen.Plante());
		
		bu.runAnimation();
		
		AbstractAnimation bv = new AnimationCroix();
		bv.setEcranDeb(ListScreen.Plante());
		bv.setEcranFin(ListScreen.Atterissage1());
		
		bv.runAnimation();
		
		AbstractAnimation bw = new AnimationFlash();
		bw.setEcranDeb(ListScreen.Atterissage1());
		bw.setEcranFin(ListScreen.Atterissage2());
		
		bw.runAnimation();
		
		AbstractAnimation bx = new AnimationSpirale();
		bx.setEcranDeb(ListScreen.Atterissage2());
		bx.setEcranFin(ListScreen.Sol());
		
		bx.runAnimation();
		
		
		AbstractAnimation by = new AnimationSpirale();
		by.setEcranDeb(ListScreen.Sol());
		by.setEcranFin(ListScreen.Decoll());
		
		by.runAnimation();
		
		
		AbstractAnimation bz = new AnimationDiag();
		bz.setEcranDeb(ListScreen.Decoll());
		bz.setEcranFin(ListScreen.Vol2());
		
		bz.runAnimation();
		
		AbstractAnimation ca = new AnimationFlash();
		ca.setEcranDeb(ListScreen.Vol2());
		ca.setEcranFin(ListScreen.Vol1());
		
		ca.runAnimation();
		
		AbstractAnimation cb = new AnimationCroix();
		cb.setEcranDeb(ListScreen.Vol1());
		cb.setEcranFin(ListScreen.Atterissage1());
		
		cb.runAnimation();
		
		AbstractAnimation cc = new AnimationFlash();
		cc.setEcranDeb(ListScreen.Atterissage1());
		cc.setEcranFin(ListScreen.Atterissage2());
		
		cc.runAnimation();
		
		AbstractAnimation cd = new AnimationLigne();
		cd.setEcranDeb(ListScreen.Atterissage2());
		cd.setEcranFin(ListScreen.Decoll());
		
		cd.runAnimation();
		
		AbstractAnimation ce = new AnimationByColumn();
		ce.setEcranDeb(ListScreen.Decoll());
		ce.setEcranFin(ListScreen.Vol2());
		
		ce.runAnimation();
		
		AbstractAnimation cf = new AnimationFlash();
		cf.setEcranDeb(ListScreen.Vol2());
		cf.setEcranFin(ListScreen.Vol1());
		
		cf.runAnimation();
		
		AbstractAnimation cg = new AnimationCroix();
		cg.setEcranDeb(ListScreen.Vol1());
		cg.setEcranFin(ListScreen.Atterissage1());
		
		cg.runAnimation();
		
		AbstractAnimation ch = new AnimationFlash();
		ch.setEcranDeb(ListScreen.Atterissage1());
		ch.setEcranFin(ListScreen.Atterissage2());
		
		ch.runAnimation(); 
		
		AbstractAnimation ci = new AnimationSpirale();
		ci.setEcranDeb(ListScreen.Atterissage2());
		ci.setEcranFin(ListScreen.Sol());
		
		ci.runAnimation();
		
		AbstractAnimation cj = new AnimationDirecte();
		cj.setEcranDeb(ListScreen.Sol());
		cj.setEcranFin(ListScreen.SolElec());
		
		cj.runAnimation();
		
		cj.wait(1000);
		
		
		Voyage voyage = new Voyage(listPlanete, simulatedVoyageur);

		voyage.lancementSimuler();
	}
}
