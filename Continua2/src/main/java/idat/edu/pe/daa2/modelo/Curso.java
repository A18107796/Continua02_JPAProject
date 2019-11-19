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
@Table(name = "curso")
public class Curso implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CURSO")
	@Basic(optional = false)
	private Integer ID_CURSO;

	@Column(name = "COD_CURSO")
	private String COD_CURSO;

	@Column(name = "NOMBRE_CURSO")
	private String NOMBRE_CURSO;
	
	private static final long serialVersionUID = 1L;

	@ManyToMany(mappedBy = "cursoList")
	private List<Especializacion> especializacionList;

	public Curso() {
		// TODO Auto-generated constructor stub
	}

	public Curso(String cOD_CURSO, String nOMBRE_CURSO) {

		COD_CURSO = cOD_CURSO;
		NOMBRE_CURSO = nOMBRE_CURSO;
	}

	public List<Especializacion> getEspecializacionList() {
		return especializacionList;
	}

	public void setEspecializacionList(List<Especializacion> especializacionList) {
		this.especializacionList = especializacionList;
	}

	public Integer getID_CURSO() {
		return ID_CURSO;
	}

	public void setID_CURSO(Integer iD_CURSO) {
		ID_CURSO = iD_CURSO;
	}

	public String getCOD_CURSO() {
		return COD_CURSO;
	}

	public void setCOD_CURSO(String cOD_CURSO) {
		COD_CURSO = cOD_CURSO;
	}

	public String getNOMBRE_CURSO() {
		return NOMBRE_CURSO;
	}

	public void setNOMBRE_CURSO(String nOMBRE_CURSO) {
		NOMBRE_CURSO = nOMBRE_CURSO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((COD_CURSO == null) ? 0 : COD_CURSO.hashCode());
		result = prime * result + ((ID_CURSO == null) ? 0 : ID_CURSO.hashCode());
		result = prime * result + ((NOMBRE_CURSO == null) ? 0 : NOMBRE_CURSO.hashCode());
		result = prime * result + ((especializacionList == null) ? 0 : especializacionList.hashCode());
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
		Curso other = (Curso) obj;
		if (COD_CURSO == null) {
			if (other.COD_CURSO != null)
				return false;
		} else if (!COD_CURSO.equals(other.COD_CURSO))
			return false;
		if (ID_CURSO == null) {
			if (other.ID_CURSO != null)
				return false;
		} else if (!ID_CURSO.equals(other.ID_CURSO))
			return false;
		if (NOMBRE_CURSO == null) {
			if (other.NOMBRE_CURSO != null)
				return false;
		} else if (!NOMBRE_CURSO.equals(other.NOMBRE_CURSO))
			return false;
		if (especializacionList == null) {
			if (other.especializacionList != null)
				return false;
		} else if (!especializacionList.equals(other.especializacionList))
			return false;
		return true;
	}

}
