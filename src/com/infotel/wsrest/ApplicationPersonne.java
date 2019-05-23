package com.infotel.wsrest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")  // WS REST disponible apres le /
public class ApplicationPersonne extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		addRestRessources(resources);
		return resources;
	}

	/**
	 * permet d'ajouter des ressources dans le WS REST
	 * 
	 * @param resources
	 */

	private void addRestRessources(Set<Class<?>> resources) {

		// ajout de la resources
		resources.add(com.infotel.wsrest.PersonneRESTService.class);

	}
}