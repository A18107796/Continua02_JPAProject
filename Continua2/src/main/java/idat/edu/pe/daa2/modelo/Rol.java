package idat.edu.pe.daa2.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ROL")
	@Basic(optional = false)
	private Integer ID_ROL;

	@Column(name = "NOMBRE")
	private String ROL;

	@ManyToMany(mappedBy = "rolList")
	private List<Usuario> usuarioList;

	public Rol() {
		// TODO Auto-generated constructor stub
	}

	public Rol(Integer iD_ROL, String rOL) {
		ID_ROL = iD_ROL;
		ROL = rOL;
	}

	public Integer getID_ROL() {
		return ID_ROL;
	}

	public void setID_ROL(Integer iD_ROL) {
		ID_ROL = iD_ROL;
	}

	public String getROL() {
		return ROL;
	}

	public void setROL(String rOL) {
		ROL = rOL;
	}

	public List<Usuario> getUsuarioList() {
		return usuarioList;
	}

	public void setUsuarioList(List<Usuario> usuarioList) {
		this.usuarioList = usuarioList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID_ROL == null) ? 0 : ID_ROL.hashCode());
		result = prime * result + ((ROL == null) ? 0 : ROL.hashCode());
		result = prime * result + ((usuarioList == null) ? 0 : usuarioList.hashCode());
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
		Rol other = (Rol) obj;
		if (ID_ROL == null) {
			if (other.ID_ROL != null)
				return false;
		} else if (!ID_ROL.equals(other.ID_ROL))
			return false;
		if (ROL == null) {
			if (other.ROL != null)
				return false;
		} else if (!ROL.equals(other.ROL))
			return false;
		if (usuarioList == null) {
			if (other.usuarioList != null)
				return false;
		} else if (!usuarioList.equals(other.usuarioList))
			return false;
		return true;
	}

}
