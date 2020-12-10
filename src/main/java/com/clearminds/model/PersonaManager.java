package com.clearminds.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager   {
	private ServicioPersona serv;
	
	public PersonaManager(){
		try {
			Class clase =Class.forName(this.leerPropiedad("path"));
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
	
	public static String leerPropiedad(String propiedad) throws FileNotFoundException, IOException {
		File f=new File("conexion.properties");
		System.out.println("ruta:"+f.getAbsoluteFile());
		Properties p = new Properties();
		p.load(new FileReader(
				"./config.properties"));
		if (p.getProperty(propiedad) != null) {
			return p.getProperty(propiedad);
		} else {
			return null;
		}
	}
	
}
