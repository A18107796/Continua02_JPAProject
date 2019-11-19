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
@Table(name = "distrito")
public class Distrito implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DISTRITO")
	@Basic(optional = false)
	private Integer ID_DISTRITO;
	
	@Column(name="CODPOSTAL")
	private String CODPOSTAL;
	
	@Column(name = "NOMBRE_DISTRITO")
	private String NOMBRE_DISTRITO;


    
    @OneToOne(mappedBy = "distrito", cascade = CascadeType.ALL)
    private Empleado empleado;
    
	public Distrito() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Distrito(Integer iD_DISTRITO, String cODPOSTAL, String nOMBRE_DISTRITO) {
		ID_DISTRITO = iD_DISTRITO;
		CODPOSTAL = cODPOSTAL;
		NOMBRE_DISTRITO = nOMBRE_DISTRITO;
	
	}



	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
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

	



	private static final long serialVersionUID = 1L;

}
