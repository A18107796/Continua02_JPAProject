package idat.edu.pe.daa2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.modelo.Rol;
import idat.edu.pe.daa2.modelo.Usuario;
import idat.edu.pe.daa2.repositorios.UsuarioRepositorio;

@Service
@Transactional
public class UsuarioServicio {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	public UsuarioServicio() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Usuario> findAll(){
		return (List<Usuario>) repositorio.findAll();
	}
	
	public Usuario create(Usuario usuario)
	{
		return repositorio.save(usuario);
	}
	
	public Usuario update(Usuario usuarioActualizar)
	{
		Usuario usuarioActual = repositorio.findById(usuarioActualizar.getID_USUARIO()).get();
		
		usuarioActual.setUSUARIO(usuarioActualizar.getUSUARIO());
		usuarioActual.setCONTRASENA(usuarioActualizar.getCONTRASENA());
		
		
		Usuario usuarioActualizado = repositorio.save(usuarioActualizar);
		return usuarioActualizado;
	}
	
	public Usuario findById(Integer id)
	{
		return repositorio.findById(id).get();
	}
	
	public void DeleteById(Integer id)
	{
		repositorio.deleteById(id);
	}
}
