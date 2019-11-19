package idat.edu.pe.daa2.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENTE")
	@Basic(optional = false)
	private Integer ID_CLIENTE;

	private String NOMBRE;

	private String APELLIDOS;

	private String DNI;

	private String TELEFONO;

	private Date FECHA_REG;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nOMBRE, String aPELLIDOS, String dNI, String tELEFONO, Date fECHA_REG) {
		NOMBRE = nOMBRE;
		APELLIDOS = aPELLIDOS;
		DNI = dNI;
		TELEFONO = tELEFONO;
		FECHA_REG = fECHA_REG;
	}

	public Integer getID_CLIENTE() {
		return ID_CLIENTE;
	}

	public void setID_CLIENTE(Integer iD_CLIENTE) {
		ID_CLIENTE = iD_CLIENTE;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getAPELLIDOS() {
		return APELLIDOS;
	}

	public void setAPELLIDOS(String aPELLIDOS) {
		APELLIDOS = aPELLIDOS;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getTELEFONO() {
		return TELEFONO;
	}

	public void setTELEFONO(String tELEFONO) {
		TELEFONO = tELEFONO;
	}

	public Date getFECHA_REG() {
		return FECHA_REG;
	}

	public void setFECHA_REG(Date fECHA_REG) {
		FECHA_REG = fECHA_REG;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((APELLIDOS == null) ? 0 : APELLIDOS.hashCode());
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		result = prime * result + ((FECHA_REG == null) ? 0 : FECHA_REG.hashCode());
		result = prime * result + ((ID_CLIENTE == null) ? 0 : ID_CLIENTE.hashCode());
		result = prime * result + ((NOMBRE == null) ? 0 : NOMBRE.hashCode());
		result = prime * result + ((TELEFONO == null) ? 0 : TELEFONO.hashCode());
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
		Cliente other = (Cliente) obj;
		if (APELLIDOS == null) {
			if (other.APELLIDOS != null)
				return false;
		} else if (!APELLIDOS.equals(other.APELLIDOS))
			return false;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		if (FECHA_REG == null) {
			if (other.FECHA_REG != null)
				return false;
		} else if (!FECHA_REG.equals(other.FECHA_REG))
			return false;
		if (ID_CLIENTE == null) {
			if (other.ID_CLIENTE != null)
				return false;
		} else if (!ID_CLIENTE.equals(other.ID_CLIENTE))
			return false;
		if (NOMBRE == null) {
			if (other.NOMBRE != null)
				return false;
		} else if (!NOMBRE.equals(other.NOMBRE))
			return false;
		if (TELEFONO == null) {
			if (other.TELEFONO != null)
				return false;
		} else if (!TELEFONO.equals(other.TELEFONO))
			return false;
		return true;
	}

}
