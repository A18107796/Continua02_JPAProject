package idat.edu.pe.daa2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import idat.edu.pe.daa2.modelo.Especializacion;
import idat.edu.pe.daa2.repositorios.EspecializacionRepositorio;

@Service
@Transactional
public class EspecializacionServicio {
	
	@Autowired
	private EspecializacionRepositorio repositorio;
	
	public EspecializacionServicio() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Especializacion> findAll(){
		return (List<Especializacion>) repositorio.findAll();
	}
	
	public Especializacion create(Especializacion especializacion)
	{
		return repositorio.save(especializacion);
	}
	
	public Especializacion update(Especializacion especialiazcionActualizar)
	{
		Especializacion especializacionActual = repositorio.findById(especialiazcionActualizar.getID_ESPECIALIZACION()).get();
		
		especializacionActual.setCOD_ESPECIALIZACION(especialiazcionActualizar.getCOD_ESPECIALIZACION());
		especializacionActual.setNOMBRE_ESPECIALIZACION(especialiazcionActualizar.getNOMBRE_ESPECIALIZACION());
		
		Especializacion especializacionActualizado = repositorio.save(especialiazcionActualizar);
		return especializacionActualizado;
	}
	
	public Especializacion findById(Integer id)
	{
		return repositorio.findById(id).get();
	}
	
	public void DeleteById(Integer id)
	{
		repositorio.deleteById(id);
	}
	
}
