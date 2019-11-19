package idat.edu.pe.daa2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.modelo.Area;
import idat.edu.pe.daa2.repositorios.AreaRepositorio;

@Service
@Transactional
public class AreaServicio {
	
	@Autowired
	private AreaRepositorio repositorio;
	
	public AreaServicio() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Area> findAll(){
		return (List<Area>) repositorio.findAll();
	}
	
	public Area create(Area area)
	{
		return repositorio.save(area);
	}
	
	public Area update(Area areaActualizar)
	{
		Area areaActual = repositorio.findById(areaActualizar.getID_AREA()).get();
		
		areaActual.setNOMBRE(areaActualizar.getNOMBRE());
		
		Area areaActualizado = repositorio.save(areaActualizar);
		return areaActualizado;
	}
	
	public Area findById(Integer id)
	{
		return repositorio.findById(id).get();
	}
	
	public void DeleteById(Integer id)
	{
		repositorio.deleteById(id);
	}
	
}
