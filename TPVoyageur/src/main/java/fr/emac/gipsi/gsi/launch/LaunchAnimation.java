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
		
		/*AbstractAnimation bx = new AnimationDirecte();
		bx.setEcranDeb(ListScreen.Atterissage2());
		bx.setEcranFin(ListScreen.Sol());
		
		bx.runAnimation();*/
		
		
		/*AbstractAnimation by = new AnimationDirecte();
		by.setEcranDeb(ListScreen.Sol());
		by.setEcranFin(ListScreen.Decoll());
		
		by.runAnimation();*/
		
		
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
		
		/*AbstractAnimation ci = new AnimationDirecte();
		ci.setEcranDeb(ListScreen.Atterissage2());
		ci.setEcranFin(ListScreen.Sol());
		
		ci.runAnimation();*/
		
		/*AbstractAnimation cj = new AnimationDirecte();
		cj.setEcranDeb(ListScreen.Sol());
		cj.setEcranFin(ListScreen.SolElec());
		
		cj.runAnimation();*/
		
		
		
		/*AbstractAnimation vol1 = new AnimationAR();
		vol1.setEcranDeb(ListScreen.Vol1());
		vol1.setEcranFin(ListScreen.Vol2());
		
		AbstractAnimation vol2 = new AnimationAR();
		vol2.setEcranDeb(ListScreen.Vol2());
		vol2.setEcranFin(ListScreen.Vol1());
		
		/*for (int i = 0 ; i < 3 ; i++) {
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
