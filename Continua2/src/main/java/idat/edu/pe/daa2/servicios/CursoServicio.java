package idat.edu.pe.daa2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.modelo.Curso;
import idat.edu.pe.daa2.repositorios.CursoRepositorio;

@Service
@Transactional
public class CursoServicio {
	
	@Autowired
	private CursoRepositorio repositorio; 
	
	public CursoServicio() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Curso> findAll(){
		return (List<Curso>) repositorio.findAll();
	}
	
	public Curso create(Curso curso)
	{
		return repositorio.save(curso);
	}
	
	public Curso update(Curso cursoActualizar)
	{
		Curso cursoActual = repositorio.findById(cursoActualizar.getID_CURSO()).get();
		
		cursoActual.setCOD_CURSO(cursoActualizar.getCOD_CURSO());
		cursoActual.setNOMBRE_CURSO(cursoActualizar.getNOMBRE_CURSO());
		
		Curso cursoActualizado = repositorio.save(cursoActual);
		return cursoActualizado;
	}
	
	public Curso findById(Integer id)
	{
		return repositorio.findById(id).get();
	}
	
	public void DeleteById(Integer id)
	{
		repositorio.deleteById(id);
	}
}
