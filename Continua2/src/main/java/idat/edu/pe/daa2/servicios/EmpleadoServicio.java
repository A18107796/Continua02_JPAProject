package idat.edu.pe.daa2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.modelo.Empleado;
import idat.edu.pe.daa2.repositorios.EmpleadoRepositorio;

@Service
@Transactional
public class EmpleadoServicio {
	
	@Autowired
	private EmpleadoRepositorio repositorio;
	
	public EmpleadoServicio() {
		// TODO Auto-generated constructor stub
	}
	

	public List<Empleado> findAll(){
		return (List<Empleado>) repositorio.findAll();
	}
	
	public Empleado create(Empleado empleado)
	{
		return repositorio.save(empleado);
	}
	
	public Empleado update(Empleado empleadoActualizar)
	{
		Empleado empleadoActual = repositorio.findById(empleadoActualizar.getID_EMPLEADO()).get();
		
		empleadoActual.setNOMBRES(empleadoActualizar.getNOMBRES());
		empleadoActual.setAPELLIDO_PA(empleadoActualizar.getAPELLIDO_PA());
		empleadoActual.setAPELLIDO_MA(empleadoActualizar.getAPELLIDO_MA());
		empleadoActual.setDNI(empleadoActualizar.getDNI());
		empleadoActual.setSEXO(empleadoActualizar.getSEXO());
		empleadoActual.setFECHA_NACIMIENTO(empleadoActualizar.getFECHA_NACIMIENTO());
		empleadoActual.setDIRECCION(empleadoActualizar.getDIRECCION());
		empleadoActual.setTELEFONO(empleadoActualizar.getTELEFONO());
		empleadoActual.setESTADO(empleadoActualizar.getESTADO());
		
		
		Empleado empleadoActualizado = repositorio.save(empleadoActualizar);
		return empleadoActualizado;
	}
	
	public Empleado findById(Integer id)
	{
		return repositorio.findById(id).get();
	}
	
	public void DeleteById(Integer id)
	{
		repositorio.deleteById(id);
	}
	
}
