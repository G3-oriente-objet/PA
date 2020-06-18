/**
 * 
 */
package fr.emac.gipsi.gsi.launch;

import fr.emac.gipsi.gsi.animation.AbstractAnimation;
import fr.emac.gipsi.gsi.animation.AnimationAR;
import fr.emac.gipsi.gsi.animation.AnimationByColumn;

import fr.emac.gipsi.gsi.animation.AnimationCroiser;
import fr.emac.gipsi.gsi.animation.AnimationCroix;

import fr.emac.gipsi.gsi.animation.AnimationDiag;
import fr.emac.gipsi.gsi.animation.AnimationDirecte;
import fr.emac.gipsi.gsi.animation.AnimationFlash;
import fr.emac.gipsi.gsi.animation.AnimationLigne;
import fr.emac.gipsi.gsi.animation.AnimationPokeball;
import fr.emac.gipsi.gsi.animation.AnimationSpirale;
import fr.emac.gipsi.gsi.ecran.ListScreen;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class LaunchAnimation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		/*AbstractAnimation aa = new AnimationDirecte();
		aa.setEcranDeb(ListScreen.Sol());
		aa.setEcranFin(ListScreen.Decoll());
		
		aa.runAnimation();*/
		
		AbstractAnimation ab = new AnimationDirecte();
		ab.setEcranDeb(ListScreen.Decoll());
		ab.setEcranFin(ListScreen.Photo());
		
		ab.runAnimation();
		
		AbstractAnimation ac = new AnimationDirecte();
		ac.setEcranDeb(ListScreen.Photo());
		ac.setEcranFin(ListScreen.PhotoFlash());
		
		ac.runAnimation();
		
		AbstractAnimation ad = new AnimationDirecte();
		ad.setEcranDeb(ListScreen.PhotoFlash());
		ad.setEcranFin(ListScreen.Psy());
		
		ad.runAnimation();
		
		AbstractAnimation ae = new AnimationDirecte();
		ae.setEcranDeb(ListScreen.Psy());
		ae.setEcranFin(ListScreen.Vol1());
		
		ae.runAnimation();
		
		AbstractAnimation af = new AnimationDirecte();
		af.setEcranDeb(ListScreen.Vol1());
		af.setEcranFin(ListScreen.Vol2());
		
		af.runAnimation();
		
		AbstractAnimation ag = new AnimationDirecte();
		ag.setEcranDeb(ListScreen.Vol2());
		ag.setEcranFin(ListScreen.Photo());
		
		ag.runAnimation();
		
		AbstractAnimation ah = new AnimationDirecte();
		ah.setEcranDeb(ListScreen.Photo());
		ah.setEcranFin(ListScreen.PhotoFlash());
		
		ae.runAnimation();
		
		AbstractAnimation ai = new AnimationDirecte();
		ai.setEcranDeb(ListScreen.PhotoFlash());
		ai.setEcranFin(ListScreen.Combat());
		
		ai.runAnimation();
		
		AbstractAnimation aj = new AnimationDirecte();
		aj.setEcranDeb(ListScreen.Combat());
		aj.setEcranFin(ListScreen.Atterissage1());
		
		aj.runAnimation();
		
		AbstractAnimation ak = new AnimationDirecte();
		ak.setEcranDeb(ListScreen.Atterissage1());
		ak.setEcranFin(ListScreen.Atterissage2());
		
		ak.runAnimation();
		
		/*AbstractAnimation al = new AnimationDirecte();
		al.setEcranDeb(ListScreen.Atterissage2());
		al.setEcranFin(ListScreen.Roche());
		
		al.runAnimation();*/
		
		/*AbstractAnimation am = new AnimationDirecte();
		am.setEcranDeb(ListScreen.Roche());
		am.setEcranFin(ListScreen.Sol());
		
		am.runAnimation();*/
		
		/*AbstractAnimation an = new AnimationDirecte();
		an.setEcranDeb(ListScreen.Sol());
		an.setEcranFin(ListScreen.Decoll());
		
		an.runAnimation();*/
		
		AbstractAnimation ao = new AnimationDirecte();
		ao.setEcranDeb(ListScreen.Decoll());
		ao.setEcranFin(ListScreen.Vol1());
		
		ao.runAnimation();
		
		AbstractAnimation ap = new AnimationDirecte();
		ap.setEcranDeb(ListScreen.Vol1());
		ap.setEcranFin(ListScreen.Vol2());
		
		ap.runAnimation();
		
		AbstractAnimation aq = new AnimationDirecte();
		aq.setEcranDeb(ListScreen.Vol2());
		aq.setEcranFin(ListScreen.Photo());
		
		aq.runAnimation();
		
		AbstractAnimation ar = new AnimationDirecte();
		ar.setEcranDeb(ListScreen.Photo());
		ar.setEcranFin(ListScreen.PhotoFlash());
		
		ar.runAnimation();
		
		AbstractAnimation as = new AnimationDirecte();
		as.setEcranDeb(ListScreen.PhotoFlash());
		as.setEcranFin(ListScreen.Feu());
		
		as.runAnimation();
		
		AbstractAnimation at = new AnimationDirecte();
		at.setEcranDeb(ListScreen.Feu());
		at.setEcranFin(ListScreen.Atterissage1());
		
		at.runAnimation();
		
		AbstractAnimation au = new AnimationDirecte();
		au.setEcranDeb(ListScreen.Atterissage1());
		au.setEcranFin(ListScreen.Atterissage2());
		
		au.runAnimation();
		
		/*AbstractAnimation av = new AnimationDirecte();
		av.setEcranDeb(ListScreen.Atterissage2());
		av.setEcranFin(ListScreen.Roche());
		
		av.runAnimation();*/
		
		/*AbstractAnimation aw = new AnimationDirecte();
		aw.setEcranDeb(ListScreen.Roche());
		aw.setEcranFin(ListScreen.Sol());
		
		aw.runAnimation();*/
		
		/*AbstractAnimation ax = new AnimationDirecte();
		ax.setEcranDeb(ListScreen.Sol());
		ax.setEcranFin(ListScreen.Decoll());
		
		ax.runAnimation();*/
		
		
		AbstractAnimation ay = new AnimationDirecte();
		ay.setEcranDeb(ListScreen.Decoll());
		ay.setEcranFin(ListScreen.Photo());
		
		ay.runAnimation();

		AbstractAnimation az = new AnimationDirecte();
		az.setEcranDeb(ListScreen.Photo());
		az.setEcranFin(ListScreen.PhotoFlash());
		
		az.runAnimation();
		
		AbstractAnimation ba = new AnimationDirecte();
		ba.setEcranDeb(ListScreen.PhotoFlash());
		ba.setEcranFin(ListScreen.Eau());
		
		ba.runAnimation();
		
		AbstractAnimation bb = new AnimationDirecte();
		bb.setEcranDeb(ListScreen.Eau());
		bb.setEcranFin(ListScreen.Vol1());
		
		bb.runAnimation();
		
		AbstractAnimation bc = new AnimationDirecte();
		bc.setEcranDeb(ListScreen.Vol1());
		bc.setEcranFin(ListScreen.Vol2());
		
		bc.runAnimation();
		
		AbstractAnimation bd = new AnimationDirecte();
		bd.setEcranDeb(ListScreen.Vol2());
		bd.setEcranFin(ListScreen.Atterissage1());
		
		bd.runAnimation();
		
		AbstractAnimation be = new AnimationDirecte();
		be.setEcranDeb(ListScreen.Atterissage1());
		be.setEcranFin(ListScreen.Atterissage2());
		
		be.runAnimation();
		
		AbstractAnimation bf = new AnimationDirecte();
		bf.setEcranDeb(ListScreen.Atterissage2());
		bf.setEcranFin(ListScreen.Decoll());
		
		bf.runAnimation();
		
		AbstractAnimation bg = new AnimationDirecte();
		bg.setEcranDeb(ListScreen.Decoll());
		bg.setEcranFin(ListScreen.Vol1());
		
		bg.runAnimation();
		
		AbstractAnimation bh = new AnimationDirecte();
		bh.setEcranDeb(ListScreen.Vol1());
		bh.setEcranFin(ListScreen.Vol2());
		
		bh.runAnimation();
		
		AbstractAnimation bi = new AnimationDirecte();
		bi.setEcranDeb(ListScreen.Vol2());
		bi.setEcranFin(ListScreen.Atterissage1());
		
		bi.runAnimation();
		
		AbstractAnimation bj = new AnimationDirecte();
		bj.setEcranDeb(ListScreen.Atterissage1());
		bj.setEcranFin(ListScreen.Atterissage2());
		
		bj.runAnimation();
		
		/*AbstractAnimation bk = new AnimationDirecte();
		bk.setEcranDeb(ListScreen.Atterissage2());
		bk.setEcranFin(ListScreen.Roche());
		
		bk.runAnimation();*/
		
		/*AbstractAnimation bl = new AnimationDirecte();
		bl.setEcranDeb(ListScreen.Roche());
		bl.setEcranFin(ListScreen.Sol());
		
		bl.runAnimation();*/
		
		/*AbstractAnimation bm = new AnimationDirecte();
		bm.setEcranDeb(ListScreen.Sol());
		bm.setEcranFin(ListScreen.Decoll());
		
		bm.runAnimation();*/
		
		
		AbstractAnimation bn = new AnimationDirecte();
		bn.setEcranDeb(ListScreen.Decoll());
		bn.setEcranFin(ListScreen.Photo());
		
		bn.runAnimation();

		AbstractAnimation bo = new AnimationDirecte();
		bo.setEcranDeb(ListScreen.Photo());
		bo.setEcranFin(ListScreen.PhotoFlash());
		
		bo.runAnimation();
		
		AbstractAnimation bp = new AnimationDirecte();
		bp.setEcranDeb(ListScreen.PhotoFlash());
		bp.setEcranFin(ListScreen.Elec());
		
		bp.runAnimation();
		
		AbstractAnimation bq = new AnimationDirecte();
		bq.setEcranDeb(ListScreen.Elec());
		bq.setEcranFin(ListScreen.Vol1());
		
		bq.runAnimation();
		
		AbstractAnimation br = new AnimationDirecte();
		br.setEcranDeb(ListScreen.Vol1());
		br.setEcranFin(ListScreen.Vol2());
		
		br.runAnimation();
		
		AbstractAnimation bs = new AnimationDirecte();
		bs.setEcranDeb(ListScreen.Vol2());
		bs.setEcranFin(ListScreen.Photo());
		
		bs.runAnimation();
		
		AbstractAnimation bt = new AnimationDirecte();
		bt.setEcranDeb(ListScreen.Photo());
		bt.setEcranFin(ListScreen.PhotoFlash());
		
		bt.runAnimation();
		
		AbstractAnimation bu = new AnimationDirecte();
		bu.setEcranDeb(ListScreen.PhotoFlash());
		bu.setEcranFin(ListScreen.Plante());
		
		bu.runAnimation();
		
		AbstractAnimation bv = new AnimationDirecte();
		bv.setEcranDeb(ListScreen.Plante());
		bv.setEcranFin(ListScreen.Atterissage1());
		
		bv.runAnimation();
		
		AbstractAnimation bw = new AnimationDirecte();
		bw.setEcranDeb(ListScreen.Atterissage1());
		bw.setEcranFin(ListScreen.Atterissage2());
		
		bw.runAnimation();
		
		/*AbstractAnimation bx = new AnimationDirecte();
		bx.setEcranDeb(ListScreen.Atterissage2());
		bx.setEcranFin(ListScreen.Sol());
		
		bx.runAnimation();*/
		
		
		/*AbstractAnimation by = new AnimationDirecte();
		by.setEcranDeb(ListScreen.Sol());
		by.setEcranFin(ListScreen.Decoll());
		
		by.runAnimation();*/
		
		
		AbstractAnimation bz = new AnimationDirecte();
		bz.setEcranDeb(ListScreen.Decoll());
		bz.setEcranFin(ListScreen.Vol1());
		
		bz.runAnimation();
		
		AbstractAnimation ca = new AnimationDirecte();
		ca.setEcranDeb(ListScreen.Vol1());
		ca.setEcranFin(ListScreen.Vol2());
		
		ca.runAnimation();
		
		AbstractAnimation cb = new AnimationDirecte();
		cb.setEcranDeb(ListScreen.Vol2());
		cb.setEcranFin(ListScreen.Atterissage1());
		
		cb.runAnimation();
		
		AbstractAnimation cc = new AnimationDirecte();
		cc.setEcranDeb(ListScreen.Atterissage1());
		cc.setEcranFin(ListScreen.Atterissage2());
		
		cc.runAnimation();
		
		AbstractAnimation cd = new AnimationDirecte();
		cd.setEcranDeb(ListScreen.Atterissage2());
		cd.setEcranFin(ListScreen.Decoll());
		
		cd.runAnimation();
		
		AbstractAnimation ce = new AnimationDirecte();
		ce.setEcranDeb(ListScreen.Decoll());
		ce.setEcranFin(ListScreen.Vol1());
		
		ce.runAnimation();
		
		AbstractAnimation cf = new AnimationDirecte();
		cf.setEcranDeb(ListScreen.Vol1());
		cf.setEcranFin(ListScreen.Vol2());
		
		cf.runAnimation();
		
		AbstractAnimation cg = new AnimationDirecte();
		cg.setEcranDeb(ListScreen.Vol2());
		cg.setEcranFin(ListScreen.Atterissage1());
		
		cg.runAnimation();
		
		AbstractAnimation ch = new AnimationDirecte();
		ch.setEcranDeb(ListScreen.Atterissage1());
		ch.setEcranFin(ListScreen.Atterissage2());
		
		ch.runAnimation();
		
		/*AbstractAnimation ci = new AnimationDirecte();
		ci.setEcranDeb(ListScreen.Atterissage2());
		ci.setEcranFin(ListScreen.Sol());
		
		ci.runAnimation();*/
		
		/*AbstractAnimation cj = new AnimationDirecte();
		cj.setEcranDeb(ListScreen.Sol());
		cj.setEcranFin(ListScreen.SolElec());
		
		cj.runAnimation();*/
		
		/*
		AbstractAnimation vol1 = new AnimationDirecte();
		vol1.setEcranDeb(ListScreen.Vol1());
		vol1.setEcranFin(ListScreen.Vol2());
		
		AbstractAnimation vol2 = new AnimationDirecte();
		vol2.setEcranDeb(ListScreen.Vol2());
		vol2.setEcranFin(ListScreen.Vol1());
		
		for (int i = 0 ; i < 3 ; i++) {
			vol1.runAnimation();
			vol1.wait(700);
			vol2.runAnimation();
			vol2.wait(700);
		}
		
		
		AbstractAnimation photo = new AnimationAR();
		photo.setEcranDeb(ListScreen.Photo());
		photo.setEcranFin(ListScreen.PhotoFlash());
		
		
		photo.runAnimation();
		photo.wait(1000);
		
		
		AbstractAnimation ac = new AnimationFlash();
		ac.setEcranDeb(ListScreen.Photo());
		ac.setEcranFin(ListScreen.Plante());
		
		ac.runAnimation();
		ac.wait(1500);
		
		AbstractAnimation ab = new AnimationFlash();
		ab.setEcranDeb(ListScreen.Atterissage1());
		ab.setEcranFin(ListScreen.Atterissage2());
		
		ab.runAnimation();
		ab.wait(1000);
		*/

	}

}
