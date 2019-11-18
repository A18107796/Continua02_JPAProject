package idat.edu.pe.daa2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import idat.edu.pe.daa2.modelo.Curso;
import idat.edu.pe.daa2.modelo.Especializacion;
import idat.edu.pe.daa2.servicios.CursoServicio;
import idat.edu.pe.daa2.servicios.EspecializacionServicio;

@SpringBootApplication
public class Continua2Application {

	public static void main(String[] args) {
	
		
		ConfigurableApplicationContext ctx = SpringApplication.run(Continua2Application.class, args);
			
		crearCurso(ctx);
		crearEspecializacion(ctx);
	}
	
	private static void crearCurso(ConfigurableApplicationContext ctx) {
		CursoServicio servicio = ctx.getBean(CursoServicio.class);
		Curso nuevoCurso = new Curso("CUR01","Matematica");
		servicio.create(nuevoCurso);

	}
	private static void crearEspecializacion(ConfigurableApplicationContext ctx) {
		EspecializacionServicio servicio = ctx.getBean(EspecializacionServicio.class);
		Especializacion nuevoEspecializacion= new Especializacion(null,"ESP01","Asistencia Inicial");
		servicio.create(nuevoEspecializacion);

	}
}
