package com.clearminds.impl;

import com.clearminds.model.Persona;
import com.clearminds.model.PersonaManager;

public class TestManager {
	public static void main(String[] args) {
		PersonaManager pm = new PersonaManager();
		Persona p = new Persona();
		p.setNombre("Harold");
		p.setApellido("Flores");
		p.setCedula("1223346");
		pm.insertarPersona(p);
	}
}
