package idat.edu.pe.daa2.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "area")
public class Area implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID_AREA")
	private Integer ID_AREA;

	@Column(name = "NOMBRE")
	private String NOMBRE;

	@OneToOne(mappedBy = "area", cascade = CascadeType.ALL)
	private Empleado empleado;

	public Area() {
		// TODO Auto-generated constructor stub
	}

	public Area(Integer iD_AREA, String nOMBRE) {
		ID_AREA = iD_AREA;
		NOMBRE = nOMBRE;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID_AREA == null) ? 0 : ID_AREA.hashCode());
		result = prime * result + ((NOMBRE == null) ? 0 : NOMBRE.hashCode());
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
		Area other = (Area) obj;
		if (ID_AREA == null) {
			if (other.ID_AREA != null)
				return false;
		} else if (!ID_AREA.equals(other.ID_AREA))
			return false;
		if (NOMBRE == null) {
			if (other.NOMBRE != null)
				return false;
		} else if (!NOMBRE.equals(other.NOMBRE))
			return false;
		if (empleado == null) {
			if (other.empleado != null)
				return false;
		} else if (!empleado.equals(other.empleado))
			return false;
		return true;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Integer getID_AREA() {
		return ID_AREA;
	}

	public void setID_AREA(Integer iD_AREA) {
		ID_AREA = iD_AREA;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

}
