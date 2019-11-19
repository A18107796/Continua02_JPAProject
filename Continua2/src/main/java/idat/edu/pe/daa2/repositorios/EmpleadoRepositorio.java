package idat.edu.pe.daa2.repositorios;

import org.springframework.data.repository.CrudRepository;

import idat.edu.pe.daa2.modelo.Empleado;

public interface EmpleadoRepositorio extends CrudRepository<Empleado, Integer> {
	
}
