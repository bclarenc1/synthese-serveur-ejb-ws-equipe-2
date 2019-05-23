package com.infotel.wsrest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.infotel.dao.DaoImpl;
import com.infotel.metier.Client;
import com.infotel.metier.Personne;
import com.infotel.metier.Prestataire;
import com.infotel.metier.Voiture;

@Stateless
@Path(value="/personnes")
public class PersonneRESTService {

	@EJB
	private DaoImpl dao;
	 
	//	pas de getter/setter (pas besoin, methodes exposees)

	@GET
	@Path("addClient/{nom}/{prenom}/{age}/{num}")
	@Produces(MediaType.APPLICATION_JSON)
	public void ajouterClient(
			@PathParam(value="nom") String nom,
			@PathParam(value="prenom") String prenom,
			@PathParam(value="age") int age,
			@PathParam(value="num") int numAdherent) {
		
		Client c = new Client();
		c.setAge(age);
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setNumAdherent(numAdherent);
		
		dao.addPersonne(c);
	}
	
	@GET
	@Path("addPrestataire/{nom}/{prenom}/{age}/{adresse}")
	@Produces(MediaType.APPLICATION_JSON)
	public void ajouterClient(
			@PathParam(value="nom") String nom,
			@PathParam(value="prenom") String prenom,
			@PathParam(value="age") int age,
			@PathParam(value="adresse") String adresse) {
		
		Prestataire p = new Prestataire();
		p.setAge(age);
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setAdresse(adresse);
		
		dao.addPersonne(p);
	}
	
	@GET
	@Path("removePersonne/{idPersonne}")
	@Produces(MediaType.APPLICATION_JSON)
	public void supprimerPersonne(@PathParam(value="idPersonne") long idPersonne) {
		dao.removePersonne(idPersonne);
	}

	@GET
	@Path("getPersonne/{idPersonne}")
	@Produces(MediaType.APPLICATION_JSON)
	public Personne getPersonne(@PathParam(value="idPersonne") long idPersonne) {
		return dao.getPersonne(idPersonne);
	}
	
	@GET
	@Path("editClient/{idPersonne}/{nom}/{prenom}/{age}/{numAdherent}")
	@Produces(MediaType.APPLICATION_JSON)
	public Client modifierClient(
			@PathParam(value="idPersonne") long idPersonne,
			@PathParam(value="nom") String nom,
			@PathParam(value="prenom") String prenom,
			@PathParam(value="age") int age,
			@PathParam(value="numAdherent") int numAdherent) {
	
		Client c = (Client) dao.getPersonne(idPersonne);
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setAge(age);
		c.setNumAdherent(numAdherent);
		
		dao.editPersonne(c);
		return c;
	}

	@GET
	@Path("editPrestataire/{idPersonne}/{nom}/{prenom}/{age}/{adresse}")
	@Produces(MediaType.APPLICATION_JSON)
	public Prestataire modifierPrestataire(
			@PathParam(value="idPersonne") long idPersonne,
			@PathParam(value="nom") String nom,
			@PathParam(value="prenom") String prenom,
			@PathParam(value="age") int age,
			@PathParam(value="adresse") String adresse) {
	
		Prestataire p = (Prestataire) dao.getPersonne(idPersonne);
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setAge(age);
		p.setAdresse(adresse);
		
		dao.editPersonne(p);
		return p;
	}
	
	@GET
	@Path("listPersonnes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Personne> getAllPersonnes() {
		return dao.getAllPersonnes();
	}
	
	// -----------------------------------------------------------------------
	
	@GET
	@Path("addVoiture/{marque}/{idPersonne}")
	@Produces(MediaType.APPLICATION_JSON)
	public void ajouterVoiture(
			@PathParam(value="marque") String marque,
			@PathParam(value="idPersonne") long idPersonne) {
		
		Voiture v = new Voiture();
		v.setMarque(marque);
		
		dao.addVoiture(v, idPersonne);
	}

	@GET
	@Path("removeVoiture/{idVoiture}")
	@Produces(MediaType.APPLICATION_JSON)
	public void supprimerVoiture(@PathParam(value="idVoiture") long idVoiture) {
		dao.removeVoiture(idVoiture);
	}

	@GET
	@Path("getVoiture/{idVoiture}")
	@Produces(MediaType.APPLICATION_JSON)
	public Voiture getVoiture(@PathParam(value="idVoiture") long idVoiture) {
		return dao.getVoiture(idVoiture);
	}

	
	@GET
	@Path("editVoiture/{idVoiture}/{marque}/{idPersonne}")
	@Produces(MediaType.APPLICATION_JSON)
	public Voiture modifierVoiture(
			@PathParam(value="idVoiture") long idVoiture,
			@PathParam(value="marque") String marque,
			@PathParam(value="idPersonne") long idPersonne) {
	
		Voiture v = dao.getVoiture(idVoiture);
		Personne p = dao.getPersonne(idPersonne);
		v.setMarque(marque);
		v.setPersonne(p);
		dao.editVoiture(v);
		
		return v;
	}
	
	@GET
	@Path("listVoitures")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Voiture> getAllVoitures() {
		return dao.getAllVoitures();
	}

	
}