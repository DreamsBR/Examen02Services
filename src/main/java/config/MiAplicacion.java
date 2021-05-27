package config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import controller.EmpleadoController;

@ApplicationPath("rest")
public class MiAplicacion extends Application {
	
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classes= new HashSet<Class<?>>();
		classes.add(EmpleadoController.class);
		return classes;
	}
}
