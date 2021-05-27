package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Empleado;
import service.EmpleadoServiceImpl;
import service.IEmpleadoService;

@Path("/Empleados")
public class EmpleadoController {

	
	private IEmpleadoService service;
	
	public EmpleadoController () {
		service=new EmpleadoServiceImpl();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Empleado>listar(){
		List<Empleado> empleado = new ArrayList<Empleado>();
		try {			
			empleado = service.listar();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return empleado;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Empleado Buscar(@PathParam("id") int id) {
		Empleado emple = new Empleado();
		try {
			emple=service.buscarPorOficina(id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return emple;
	}
	
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Empleado registrar(@PathParam("id") int id) {
		Empleado emple = new Empleado();
		try {			
			emple=service.registrar(emple);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return emple;
	}
	
	
	
	
}
