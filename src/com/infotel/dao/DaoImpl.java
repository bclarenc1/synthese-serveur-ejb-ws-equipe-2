package com.infotel.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.infotel.metier.Magasin;
import com.infotel.metier.Personne;
import com.infotel.metier.Produit;
import com.infotel.metier.Voiture;

@Singleton
@LocalBean
public class DaoImpl implements IdaoRemote {

	@PersistenceContext(unitName="EJBWS_PU")
	EntityManager em;
	
	public DaoImpl() {}

	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}

	@Override
	public void removeProduit(long idProduit) {
		// TODO Auto-generated method stub
		em.createQuery("delete from Produit p where p.id = :x").setParameter("x", idProduit).executeUpdate();
	}

	@Override
	public Produit getProduit(long idProduit) {
		// TODO Auto-generated method stub
		return em.find(Produit.class, idProduit);
	}

	@Override
	public Produit editProduit(Produit p) {
		// TODO Auto-generated method stub
		em.persist(p);
		return p;
	}

	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return em.createQuery("select p from Produit p").getResultList();
	}

	@Override
	public void addMagasin(Magasin m) {
		// TODO Auto-generated method stub
		em.persist(m);
	}

	@Override
	public void removeMagasin(long idMagasin) {
		// TODO Auto-generated method stub
		em.createQuery("delete from Magasin m where m.id = :x").setParameter("x", idMagasin).executeUpdate();
	}
	

	@Override
	public Magasin getMagasin(long idMagasin) {
		// TODO Auto-generated method stub
		return em.find(Magasin.class, idMagasin);
	}

	@Override
	public Magasin editMagasin(Magasin m) {
		// TODO Auto-generated method stub
		em.persist(m);
		return m;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Voiture> getAllMagasins() {
		// TODO Auto-generated method stub
		return em.createQuery("select m from Magasin m").getResultList();
	}



}

