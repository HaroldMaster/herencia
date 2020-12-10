package com.clearminds.model;

import com.clearminds.interfaces.ServicioPersona;

public class ServicioPersonaArchivos implements ServicioPersona {
	public boolean insertar(Persona persona){
		System.out.println("Insertando persona en un archivo: "+persona);
		return true;
	}
	public boolean actualizar(Persona persona){
		System.out.println("Actualizando persona en un archivo: "+persona);
		return true;
	}
	public boolean eliminar(Persona persona){
		System.out.println("Eliminando persona del archivo: "+persona);
		return true;
	}
}
