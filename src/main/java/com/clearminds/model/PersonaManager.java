package com.clearminds.model;

import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager   {
	private ServicioPersona serv;
	
	public PersonaManager(){
		try {
			Class clase =Class.forName("com.clearminds.model.ServicioPersonaBDD");
			serv=(ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}

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
