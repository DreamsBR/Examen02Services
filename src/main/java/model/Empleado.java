package model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nroempleado;
	@Column(nullable = false)
	private int idoficina;
	@Column(nullable = false)
	private String estado;
	@Column(nullable = true)
	private String comentario;
	
	public Empleado() {}

	public Empleado(int nroempleado, int idoficina, String estado, String comentario) {
		super();
		this.nroempleado = nroempleado;
		this.idoficina = idoficina;
		this.estado = estado;
		this.comentario = comentario;
	}

	public int getNroempleado() {
		return nroempleado;
	}

	public void setNroempleado(int nroempleado) {
		this.nroempleado = nroempleado;
	}

	public int getIdoficina() {
		return idoficina;
	}

	public void setIdoficina(int idoficina) {
		this.idoficina = idoficina;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	

	
}
