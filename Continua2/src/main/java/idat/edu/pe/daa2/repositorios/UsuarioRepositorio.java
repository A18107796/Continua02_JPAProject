package idat.edu.pe.daa2.repositorios;

import org.springframework.data.repository.CrudRepository;

import idat.edu.pe.daa2.modelo.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer>{
	
}
