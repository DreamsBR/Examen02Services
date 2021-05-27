package service;

import java.util.List;

import dao.EmpleadoDaoImpl;
import dao.IEmpleadoDao;
import model.Empleado;

public class EmpleadoServiceImpl implements IEmpleadoService{

	private IEmpleadoDao dao;
	public EmpleadoServiceImpl() {
		dao=new EmpleadoDaoImpl();
	}
	
	
	@Override
	public Empleado registrar(Empleado e) throws Exception {
		
		return dao.registrar(e);
	}

	@Override
	public List<Empleado> listar() throws Exception {
		return dao.listar();
	}

	@Override
	public Empleado buscarPorOficina(int id) throws Exception {
		return dao.buscarPorOficina(id);
	}

}
