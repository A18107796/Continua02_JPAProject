package idat.edu.pe.daa2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.modelo.Distrito;
import idat.edu.pe.daa2.repositorios.DistritoRepositorio;

@Service
@Transactional
public class DistritoServicio {
	
	@Autowired
	private DistritoRepositorio repositorio;
	
	public DistritoServicio() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Distrito> findAll(){
		return (List<Distrito>) repositorio.findAll();
	}
	
	public Distrito create(Distrito distrito)
	{
		return repositorio.save(distrito);
	}
	
	public Distrito update(Distrito distritoActualizar)
	{
		Distrito distritoActual = repositorio.findById(distritoActualizar.getID_DISTRITO()).get();
		
		distritoActual.setCODPOSTAL(distritoActualizar.getCODPOSTAL());
		distritoActual.setNOMBRE_DISTRITO(distritoActualizar.getNOMBRE_DISTRITO());
		
		Distrito distritoActualizado = repositorio.save(distritoActual);
		return distritoActualizado;
	}
	
	public Distrito findById(Integer id)
	{
		return repositorio.findById(id).get();
	}
	
	public void DeleteById(Integer id)
	{
		repositorio.deleteById(id);
	}
}
