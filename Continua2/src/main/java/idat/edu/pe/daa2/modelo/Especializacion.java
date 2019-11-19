package idat.edu.pe.daa2.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "especializacion")
public class Especializacion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ESPECIALIZACION")
	@Basic(optional = false)
	private Integer ID_ESPECIALIZACION;
	
	@Column(name = "COD_ESPECIALIZACION")
	private String 	COD_ESPECIALIZACION;
	
	@Column(name = "NOMBRE_ESPECIALIZACION")
	private String NOMBRE_ESPECIALIZACION;
	
	
	@JoinTable(name = "especializacion_curso", joinColumns = {
			@JoinColumn(name = "ID_ESPECIALIZACION", referencedColumnName = "ID_ESPECIALIZACION") }, inverseJoinColumns = {
					@JoinColumn(name = "ID_CURSO", referencedColumnName = "ID_CURSO") })
	@ManyToMany
	private List<Curso> cursoList;
	
	
	public Especializacion() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Especializacion(Integer iD_ESPECIALIZACION, String cOD_ESPECIALIZACION, String nOMBRE_ESPECIALIZACION) {
		ID_ESPECIALIZACION = iD_ESPECIALIZACION;
		COD_ESPECIALIZACION = cOD_ESPECIALIZACION;
		NOMBRE_ESPECIALIZACION = nOMBRE_ESPECIALIZACION;
	}


	public List<Curso> getCursoList() {
		return cursoList;
	}



	public void setCursoList(List<Curso> cursoList) {
		this.cursoList = cursoList;
	}



	public Integer getID_ESPECIALIZACION() {
		return ID_ESPECIALIZACION;
	}



	public void setID_ESPECIALIZACION(Integer iD_ESPECIALIZACION) {
		ID_ESPECIALIZACION = iD_ESPECIALIZACION;
	}



	public String getCOD_ESPECIALIZACION() {
		return COD_ESPECIALIZACION;
	}



	public void setCOD_ESPECIALIZACION(String cOD_ESPECIALIZACION) {
		COD_ESPECIALIZACION = cOD_ESPECIALIZACION;
	}



	public String getNOMBRE_ESPECIALIZACION() {
		return NOMBRE_ESPECIALIZACION;
	}



	public void setNOMBRE_ESPECIALIZACION(String nOMBRE_ESPECIALIZACION) {
		NOMBRE_ESPECIALIZACION = nOMBRE_ESPECIALIZACION;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((COD_ESPECIALIZACION == null) ? 0 : COD_ESPECIALIZACION.hashCode());
		result = prime * result + ((ID_ESPECIALIZACION == null) ? 0 : ID_ESPECIALIZACION.hashCode());
		result = prime * result + ((NOMBRE_ESPECIALIZACION == null) ? 0 : NOMBRE_ESPECIALIZACION.hashCode());
		result = prime * result + ((cursoList == null) ? 0 : cursoList.hashCode());
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
		Especializacion other = (Especializacion) obj;
		if (COD_ESPECIALIZACION == null) {
			if (other.COD_ESPECIALIZACION != null)
				return false;
		} else if (!COD_ESPECIALIZACION.equals(other.COD_ESPECIALIZACION))
			return false;
		if (ID_ESPECIALIZACION == null) {
			if (other.ID_ESPECIALIZACION != null)
				return false;
		} else if (!ID_ESPECIALIZACION.equals(other.ID_ESPECIALIZACION))
			return false;
		if (NOMBRE_ESPECIALIZACION == null) {
			if (other.NOMBRE_ESPECIALIZACION != null)
				return false;
		} else if (!NOMBRE_ESPECIALIZACION.equals(other.NOMBRE_ESPECIALIZACION))
			return false;
		if (cursoList == null) {
			if (other.cursoList != null)
				return false;
		} else if (!cursoList.equals(other.cursoList))
			return false;
		return true;
	}



	private static final long serialVersionUID = 1L;

}
