package com.infotel.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.infotel.metier.Personne;
import com.infotel.metier.Voiture;

@Singleton
@LocalBean
public class DaoImpl implements IdaoRemote {

	@PersistenceContext(unitName="EJBWS_PU")
	EntityManager em;
	
	public DaoImpl() {}

	@Override
	public void addPersonne(Personne p) {
		em.persist(p);
	}
	
	@Override
	public void removePersonne(long idPersonne) {
		em.createQuery("delete from Personne p where p.id = :x").setParameter("x", idPersonne).executeUpdate();
	}
	
	@Override
	public Personne getPersonne(long idPersonne) {
		return em.find(Personne.class, idPersonne);
	}
	
	@Override
	public Personne editPersonne(Personne p) {
		em.persist(p);
		return p;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> getAllPersonnes() {
		return em.createQuery("select p from Personne p").getResultList();
	}
	
	//------------------------------------------------------------------------

	@Override
	public void addVoiture(Voiture v, long idPersonne) {
		Personne p = em.find(Personne.class, idPersonne);
		v.setPersonne(p);
		em.persist(v);
	}

	@Override
	public void removeVoiture(long idVoiture) {
		em.createQuery("delete from Voiture v where v.idVoiture = :x").setParameter("x", idVoiture).executeUpdate();
	}

	@Override
	public Voiture getVoiture(long idVoiture) {
		return em.find(Voiture.class, idVoiture);
	}

	@Override
	public Voiture editVoiture(Voiture v) {
		em.persist(v);
		return v;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Voiture> getAllVoitures() {
		return em.createQuery("select v from Voiture v").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Voiture> getVoituresParPersonne(long idPersonne) {
		return em.createQuery("select v from Voiture v where v.personne.id = :x").setParameter("x", idPersonne).getResultList();
	}

}

