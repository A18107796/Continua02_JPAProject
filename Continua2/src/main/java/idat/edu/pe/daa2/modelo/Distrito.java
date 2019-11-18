package idat.edu.pe.daa2.modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "distrito")
public class Distrito implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DISTRITO")
	private Integer ID_DISTRITO;
	
	@Column(name="CODPOSTAL")
	private String CODPOSTAL;
	
	@Column(name = "NOMBRE_DISTRITO")
	private String NOMBRE_DISTRITO;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "distrito")
	private Alumno alumno;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "distrito")
	private Empleado empleado;
	
	public Distrito() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Distrito(Integer iD_DISTRITO, String cODPOSTAL, String nOMBRE_DISTRITO, Alumno alumno, Empleado empleado) {
		ID_DISTRITO = iD_DISTRITO;
		CODPOSTAL = cODPOSTAL;
		NOMBRE_DISTRITO = nOMBRE_DISTRITO;
		this.alumno = alumno;
		this.empleado = empleado;
	}



	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Integer getID_DISTRITO() {
		return ID_DISTRITO;
	}

	public void setID_DISTRITO(Integer iD_DISTRITO) {
		ID_DISTRITO = iD_DISTRITO;
	}

	public String getCODPOSTAL() {
		return CODPOSTAL;
	}

	public void setCODPOSTAL(String cODPOSTAL) {
		CODPOSTAL = cODPOSTAL;
	}

	public String getNOMBRE_DISTRITO() {
		return NOMBRE_DISTRITO;
	}

	public void setNOMBRE_DISTRITO(String nOMBRE_DISTRITO) {
		NOMBRE_DISTRITO = nOMBRE_DISTRITO;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CODPOSTAL == null) ? 0 : CODPOSTAL.hashCode());
		result = prime * result + ((ID_DISTRITO == null) ? 0 : ID_DISTRITO.hashCode());
		result = prime * result + ((NOMBRE_DISTRITO == null) ? 0 : NOMBRE_DISTRITO.hashCode());
		result = prime * result + ((alumno == null) ? 0 : alumno.hashCode());
		result = prime * result + ((empleado == null) ? 0 : empleado.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Distrito other = (Distrito) obj;
		if (CODPOSTAL == null) {
			if (other.CODPOSTAL != null)
				return false;
		} else if (!CODPOSTAL.equals(other.CODPOSTAL))
			return false;
		if (ID_DISTRITO == null) {
			if (other.ID_DISTRITO != null)
				return false;
		} else if (!ID_DISTRITO.equals(other.ID_DISTRITO))
			return false;
		if (NOMBRE_DISTRITO == null) {
			if (other.NOMBRE_DISTRITO != null)
				return false;
		} else if (!NOMBRE_DISTRITO.equals(other.NOMBRE_DISTRITO))
			return false;
		if (alumno == null) {
			if (other.alumno != null)
				return false;
		} else if (!alumno.equals(other.alumno))
			return false;
		if (empleado == null) {
			if (other.empleado != null)
				return false;
		} else if (!empleado.equals(other.empleado))
			return false;
		return true;
	}


	private static final long serialVersionUID = 1L;

}
