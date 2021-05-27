package dao;

import java.util.List;

import model.Empleado;

public interface IEmpleadoDao {
	Empleado registrar(Empleado e) ;
	
	List<Empleado> listar() ;
	
	Empleado buscarPorOficina(int id);
}
