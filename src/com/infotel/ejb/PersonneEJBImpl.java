package com.infotel.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.infotel.dao.IdaoRemote;
import com.infotel.metier.Personne;
import com.infotel.metier.Voiture;

@Stateless(name="ejbPersonne")
public class PersonneEJBImpl implements IPersonneLocal, IPersonneRemote {

	@EJB
	private IdaoRemote dao;

	public IdaoRemote getDao() {
		return dao;
	}

	public void setDao(IdaoRemote dao) {
		this.dao = dao;
	}

	public PersonneEJBImpl() {}

	@Override
	public void addPersonne(Personne p) {
		dao.addPersonne(p);
	}

	@Override
	public void addVoiture(Voiture v, long idPersonne) {
		dao.addVoiture(v, idPersonne);
	}

	@Override
	public List<Personne> getAllPersonnes() {
		return dao.getAllPersonnes();
	}

	@Override
	public List<Voiture> getAllVoitures() {
		return dao.getAllVoitures();
	}

	@Override
	public void removePersonne(long idPersonne) {
		dao.removePersonne(idPersonne);
	}

	@Override
	public Personne getPersonne(long idPersonne) {
		return dao.getPersonne(idPersonne);
	}

	@Override
	public Personne editPersonne(Personne p) {
		return dao.editPersonne(p);
	}

	@Override
	public void removeVoiture(long idVoiture) {
		dao.removeVoiture(idVoiture);
	}

	@Override
	public Voiture getVoiture(long idVoiture) {
		return dao.getVoiture(idVoiture);
	}

	@Override
	public Voiture editVoiture(Voiture v) {
		return dao.editVoiture(v);
	}

	@Override
	public List<Voiture> getVoituresParPersonne(long idPersonne) {
		return dao.getVoituresParPersonne(idPersonne);
	}

}
