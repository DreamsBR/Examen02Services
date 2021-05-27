package service;

import java.util.List;

import model.Empleado;

public interface IEmpleadoService {
	
	Empleado registrar(Empleado e) throws Exception;
	
	List<Empleado> listar() throws Exception;
	
	Empleado buscarPorOficina(int id) throws Exception;
}
