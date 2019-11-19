package idat.edu.pe.daa2.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	@Basic(optional = false)
	private Integer ID_USUARIO;

	@Column(name = "USUARIO")
	private String USUARIO;

	@Column(name = "CONTRASENA")
	private String CONTRASENA;


	@JoinTable(name = "usuario_rol", joinColumns = {
			@JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO") }, inverseJoinColumns = {
					@JoinColumn(name = "ID_ROL", referencedColumnName = "ID_ROL") })
	@ManyToMany
	private List<Rol> rolList;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer iD_USUARIO, String uSUARIO, String cONTRASENA) {
		ID_USUARIO = iD_USUARIO;
		USUARIO = uSUARIO;
		CONTRASENA = cONTRASENA;
	}

	public Usuario(Integer iD_USUARIO, String uSUARIO, String cONTRASENA, List<Rol> rolList) {
		ID_USUARIO = iD_USUARIO;
		USUARIO = uSUARIO;
		CONTRASENA = cONTRASENA;
		this.rolList = rolList;
	}

	public Integer getID_USUARIO() {
		return ID_USUARIO;
	}

	public void setID_USUARIO(Integer iD_USUARIO) {
		ID_USUARIO = iD_USUARIO;
	}

	public String getUSUARIO() {
		return USUARIO;
	}

	public void setUSUARIO(String uSUARIO) {
		USUARIO = uSUARIO;
	}

	public String getCONTRASENA() {
		return CONTRASENA;
	}

	public void setCONTRASENA(String cONTRASENA) {
		CONTRASENA = cONTRASENA;
	}

	public List<Rol> getRolList() {
		return rolList;
	}

	public void setRolList(List<Rol> rolList) {
		this.rolList = rolList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CONTRASENA == null) ? 0 : CONTRASENA.hashCode());
		result = prime * result + ((ID_USUARIO == null) ? 0 : ID_USUARIO.hashCode());
		result = prime * result + ((USUARIO == null) ? 0 : USUARIO.hashCode());
		result = prime * result + ((rolList == null) ? 0 : rolList.hashCode());
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
		Usuario other = (Usuario) obj;
		if (CONTRASENA == null) {
			if (other.CONTRASENA != null)
				return false;
		} else if (!CONTRASENA.equals(other.CONTRASENA))
			return false;
		if (ID_USUARIO == null) {
			if (other.ID_USUARIO != null)
				return false;
		} else if (!ID_USUARIO.equals(other.ID_USUARIO))
			return false;
		if (USUARIO == null) {
			if (other.USUARIO != null)
				return false;
		} else if (!USUARIO.equals(other.USUARIO))
			return false;
		if (rolList == null) {
			if (other.rolList != null)
				return false;
		} else if (!rolList.equals(other.rolList))
			return false;
		return true;
	}

}
