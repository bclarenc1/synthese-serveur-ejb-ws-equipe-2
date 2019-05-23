package com.infotel.wssoap;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.infotel.dao.DaoImpl;
import com.infotel.metier.Client;
import com.infotel.metier.Personne;
import com.infotel.metier.Prestataire;
import com.infotel.metier.Voiture;

@Stateless
@WebService
public class PersonneSOAPService {
	
	@EJB
	private DaoImpl dao;  // pas Idao, car les WS ne supportent pas les interfaces
 
//	no getter/setter needed

	@WebMethod
	public void ajouterClient(
			@WebParam(name="nom") String nom,
			@WebParam(name="prenom") String prenom,
			@WebParam(name="age") int age,
			@WebParam(name="num") int numAdherent) {
		
		Client c = new Client();
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setAge(age);
		c.setNumAdherent(numAdherent);
		
		dao.addPersonne(c);
	}
	
	@WebMethod
	public void ajouterPrestataire(
			@WebParam(name="nom") String nom,
			@WebParam(name="prenom") String prenom,
			@WebParam(name="age") int age,
			@WebParam(name="adresse") String adresse) {
		
		Prestataire p = new Prestataire();
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setAge(age);
		p.setAdresse(adresse);
		
		dao.addPersonne(p);
	}

	@WebMethod
	public void supprimerPersonne(@WebParam(name="idPersonne") long idPersonne) {
		dao.removePersonne(idPersonne);
	}

	@WebMethod
	public Personne getPersonne(@WebParam(name="idPersonne") long idPersonne) {
		return dao.getPersonne(idPersonne);
	}

	@WebMethod
	public Client modifierClient(
			@WebParam(name="idPersonne") long idPersonne,
			@WebParam(name="nom") String nom,
			@WebParam(name="prenom") String prenom,
			@WebParam(name="age") int age,
			@WebParam(name="numAdherent") int numAdherent) {
	
		Client c = (Client) dao.getPersonne(idPersonne);
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setAge(age);
		c.setNumAdherent(numAdherent);
		
		dao.editPersonne(c);
		return c;
	}

	@WebMethod
	public Prestataire modifierPrestataire(
			@WebParam(name="idPersonne") long idPersonne,
			@WebParam(name="nom") String nom,
			@WebParam(name="prenom") String prenom,
			@WebParam(name="age") int age,
			@WebParam(name="adresse") String adresse) {
	
		Prestataire p = (Prestataire) dao.getPersonne(idPersonne);
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setAge(age);
		p.setAdresse(adresse);
		
		dao.editPersonne(p);
		return p;
	}

	@WebMethod
	public List<Personne> getAllPersonnes() {
		return dao.getAllPersonnes();
	}
	
	//------------------------------------------------------------------------
	
	@WebMethod
	public void ajouterVoiture(
			@WebParam(name="marque") String marque,
			@WebParam(name="idPersonne") long idPersonne) {
		
		Voiture v = new Voiture();
		v.setMarque(marque);
		
		dao.addVoiture(v, idPersonne);
	}
	
	@WebMethod
	public void supprimerVoiture(@WebParam(name="idVoiture") long idVoiture) {
		dao.removeVoiture(idVoiture);
	}

	@WebMethod
	public Voiture getVoiture(@WebParam(name="idVoiture") long idVoiture) {
		return dao.getVoiture(idVoiture);
	}
	
	@WebMethod
	public Voiture modifierVoiture(
			@WebParam(name="idVoiture") long idVoiture,
			@WebParam(name="marque") String marque,
			@WebParam(name="idPersonne") long idPersonne) {
	
		Voiture v = dao.getVoiture(idVoiture);
		Personne p = dao.getPersonne(idPersonne);
		v.setMarque(marque);
		v.setPersonne(p);
		dao.editVoiture(v);
		
		return v;
	}
	
	@WebMethod
	public List<Voiture> getAllVoitures() {
		return dao.getAllVoitures();
	}
	
	@WebMethod
	public List<Voiture> getVoituresParPersonne(long idPersonne) {
		return dao.getVoituresParPersonne(idPersonne);
	}

}