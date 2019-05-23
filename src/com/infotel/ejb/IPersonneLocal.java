package com.infotel.ejb;

import java.util.List;

import javax.ejb.Local;

import com.infotel.metier.Personne;
import com.infotel.metier.Voiture;

@Local
public interface IPersonneLocal {

	public void addPersonne(Personne p);
	public void removePersonne(long idPersonne);
	public Personne getPersonne(long idPersonne);
	public Personne editPersonne(Personne p);
	public List<Personne> getAllPersonnes();
	
	public void addVoiture(Voiture v, long idPersonne);
	public void removeVoiture(long idVoiture);
	public Voiture getVoiture(long idVoiture);
	public Voiture editVoiture(Voiture v);
	public List<Voiture> getAllVoitures();

	public List<Voiture> getVoituresParPersonne(long idPersonne);
}
