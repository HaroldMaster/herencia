package com.clearminds.model;

import com.clearminds.interfaces.ServicioPersona;

public class ServicioPersonaBDD implements ServicioPersona {
	public boolean insertar(Persona persona){
		System.out.println("Insertando persona en la bdd: "+persona);
		return true;
	}
	public boolean actualizar(Persona persona){
		System.out.println("Actualizando persona en la bdd: "+persona);
		return true;
	}
	public boolean eliminar(Persona persona){
		System.out.println("Eliminando persona en la bdd: "+persona);
		return true;
	}
}
