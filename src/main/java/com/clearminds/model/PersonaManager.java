package com.clearminds.model;

import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {
	private ServicioPersona serv;
	
	public PersonaManager(){
		this.serv = new ServicioPersonaBDD();
	}
	
	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
}
