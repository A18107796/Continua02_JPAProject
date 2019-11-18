package idat.edu.pe.daa2.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ALUMNO")
	private Integer ID_ALUMNO;

	@Column(name = "NOMBRE")
	private String NOMBRE;

	@Column(name = "APELLIDO_PA")
	private String APELLIDO_PA;

	@Column(name = "APELLIDO_MA")
	private String APELLIDO_MA;

	@Column(name = "DNI")
	private String DNI;

	@Column(name = "SEXO")
	private String SEXO;

	@Column(name = "FECHA_NACIMIENTO")
	private Date FECHA_NACIMIENTO;

	@JoinColumn(name = "distrito", referencedColumnName = "ID_DISTRITO")
	@OneToOne(optional = false)
	private Distrito distrito;

	@Column(name = "DIRECCION")
	private String DIRECCION;

	@Column(name = "TELEFONO")
	private String TELEFONO;

	@Column(name = "ESTADO")
	private String ESTADO;

	@Column(name = "FECHA_REG")
	private Date FECHA_REG;

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(Integer iD_ALUMNO, String nOMBRE, String aPELLIDO_PA, String aPELLIDO_MA, String dNI, String sEXO,
			Date fECHA_NACIMIENTO, Distrito distrito, String dIRECCION, String tELEFONO, String eSTADO,
			Date fECHA_REG) {
		ID_ALUMNO = iD_ALUMNO;
		NOMBRE = nOMBRE;
		APELLIDO_PA = aPELLIDO_PA;
		APELLIDO_MA = aPELLIDO_MA;
		DNI = dNI;
		SEXO = sEXO;
		FECHA_NACIMIENTO = fECHA_NACIMIENTO;
		this.distrito = distrito;
		DIRECCION = dIRECCION;
		TELEFONO = tELEFONO;
		ESTADO = eSTADO;
		FECHA_REG = fECHA_REG;
	}

	public String getSEXO() {
		return SEXO;
	}

	public void setSEXO(String sEXO) {
		SEXO = sEXO;
	}

	public Integer getID_ALUMNO() {
		return ID_ALUMNO;
	}

	public void setID_ALUMNO(Integer iD_ALUMNO) {
		ID_ALUMNO = iD_ALUMNO;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getAPELLIDO_PA() {
		return APELLIDO_PA;
	}

	public void setAPELLIDO_PA(String aPELLIDO_PA) {
		APELLIDO_PA = aPELLIDO_PA;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public Date getFECHA_NACIMIENTO() {
		return FECHA_NACIMIENTO;
	}

	public void setFECHA_NACIMIENTO(Date fECHA_NACIMIENTO) {
		FECHA_NACIMIENTO = fECHA_NACIMIENTO;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public String getDIRECCION() {
		return DIRECCION;
	}

	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}

	public String getTELEFONO() {
		return TELEFONO;
	}

	public void setTELEFONO(String tELEFONO) {
		TELEFONO = tELEFONO;
	}

	public String getESTADO() {
		return ESTADO;
	}

	public void setESTADO(String eSTADO) {
		ESTADO = eSTADO;
	}

	public Date getFECHA_REG() {
		return FECHA_REG;
	}

	public void setFECHA_REG(Date fECHA_REG) {
		FECHA_REG = fECHA_REG;
	}

	public String getAPELLIDO_MA() {
		return APELLIDO_MA;
	}

	public void setAPELLIDO_MA(String aPELLIDO_MA) {
		APELLIDO_MA = aPELLIDO_MA;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((APELLIDO_MA == null) ? 0 : APELLIDO_MA.hashCode());
		result = prime * result + ((APELLIDO_PA == null) ? 0 : APELLIDO_PA.hashCode());
		result = prime * result + ((DIRECCION == null) ? 0 : DIRECCION.hashCode());
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		result = prime * result + ((ESTADO == null) ? 0 : ESTADO.hashCode());
		result = prime * result + ((FECHA_NACIMIENTO == null) ? 0 : FECHA_NACIMIENTO.hashCode());
		result = prime * result + ((FECHA_REG == null) ? 0 : FECHA_REG.hashCode());
		result = prime * result + ((ID_ALUMNO == null) ? 0 : ID_ALUMNO.hashCode());
		result = prime * result + ((NOMBRE == null) ? 0 : NOMBRE.hashCode());
		result = prime * result + ((SEXO == null) ? 0 : SEXO.hashCode());
		result = prime * result + ((TELEFONO == null) ? 0 : TELEFONO.hashCode());
		result = prime * result + ((distrito == null) ? 0 : distrito.hashCode());
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
		Alumno other = (Alumno) obj;
		if (APELLIDO_MA == null) {
			if (other.APELLIDO_MA != null)
				return false;
		} else if (!APELLIDO_MA.equals(other.APELLIDO_MA))
			return false;
		if (APELLIDO_PA == null) {
			if (other.APELLIDO_PA != null)
				return false;
		} else if (!APELLIDO_PA.equals(other.APELLIDO_PA))
			return false;
		if (DIRECCION == null) {
			if (other.DIRECCION != null)
				return false;
		} else if (!DIRECCION.equals(other.DIRECCION))
			return false;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		if (ESTADO == null) {
			if (other.ESTADO != null)
				return false;
		} else if (!ESTADO.equals(other.ESTADO))
			return false;
		if (FECHA_NACIMIENTO == null) {
			if (other.FECHA_NACIMIENTO != null)
				return false;
		} else if (!FECHA_NACIMIENTO.equals(other.FECHA_NACIMIENTO))
			return false;
		if (FECHA_REG == null) {
			if (other.FECHA_REG != null)
				return false;
		} else if (!FECHA_REG.equals(other.FECHA_REG))
			return false;
		if (ID_ALUMNO == null) {
			if (other.ID_ALUMNO != null)
				return false;
		} else if (!ID_ALUMNO.equals(other.ID_ALUMNO))
			return false;
		if (NOMBRE == null) {
			if (other.NOMBRE != null)
				return false;
		} else if (!NOMBRE.equals(other.NOMBRE))
			return false;
		if (SEXO == null) {
			if (other.SEXO != null)
				return false;
		} else if (!SEXO.equals(other.SEXO))
			return false;
		if (TELEFONO == null) {
			if (other.TELEFONO != null)
				return false;
		} else if (!TELEFONO.equals(other.TELEFONO))
			return false;
		if (distrito == null) {
			if (other.distrito != null)
				return false;
		} else if (!distrito.equals(other.distrito))
			return false;
		return true;
	}



	private static final long serialVersionUID = 1L;

}
