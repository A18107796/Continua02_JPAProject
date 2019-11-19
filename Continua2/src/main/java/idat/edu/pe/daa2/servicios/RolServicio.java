package idat.edu.pe.daa2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.modelo.Area;
import idat.edu.pe.daa2.modelo.Rol;
import idat.edu.pe.daa2.repositorios.RolRepositorio;



@Service
@Transactional
public class RolServicio {

	@Autowired
	private RolRepositorio repositorio;
	public RolServicio() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Rol> findAll(){
		return (List<Rol>) repositorio.findAll();
	}
	
	public Rol create(Rol rol)
	{
		return repositorio.save(rol);
	}
	
	public Rol update(Rol rolActualizar)
	{
		Rol rolActual = repositorio.findById(rolActualizar.getID_ROL()).get();
		
		rolActual.setROL(rolActualizar.getROL());
		
		Rol rolActualizado = repositorio.save(rolActualizar);
		return rolActualizado;
	}
	
	public Rol findById(Integer id)
	{
		return repositorio.findById(id).get();
	}
	
	public void DeleteById(Integer id)
	{
		repositorio.deleteById(id);
	}
}
