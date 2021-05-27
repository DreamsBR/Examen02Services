package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Empleado;

public class EmpleadoDaoImpl implements IEmpleadoDao{
	
	
	private EntityManager em;
	
	public EmpleadoDaoImpl() {
		this.em=JPAUtil.getEntityManagerFactory().createEntityManager();
	}
	
	@Override
	public Empleado registrar(Empleado e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		return null;
		
	}

	@Override
	public List<Empleado> listar() {
		List<Empleado> emple;
		Query query = em.createNamedQuery("form Empleado e");
		emple = query.getResultList();
		return emple;
	}

	@Override
	public Empleado buscarPorOficina(int id) {
		List<Empleado> emple;
		Query query = em.createNamedQuery("form Empleado e where p.id=?1");
		query.setParameter(1, id);
		emple = query.getResultList();
		return emple != null && !emple.isEmpty() ? listar().get(0):null;
		
	}

}
