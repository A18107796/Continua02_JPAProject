package idat.edu.pe.daa2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import idat.edu.pe.daa2.modelo.Area;
import idat.edu.pe.daa2.modelo.Curso;
import idat.edu.pe.daa2.modelo.Distrito;
import idat.edu.pe.daa2.modelo.Empleado;
import idat.edu.pe.daa2.modelo.Especializacion;
import idat.edu.pe.daa2.modelo.Rol;
import idat.edu.pe.daa2.modelo.Usuario;
import idat.edu.pe.daa2.servicios.AreaServicio;
import idat.edu.pe.daa2.servicios.CursoServicio;
import idat.edu.pe.daa2.servicios.DistritoServicio;
import idat.edu.pe.daa2.servicios.EmpleadoServicio;
import idat.edu.pe.daa2.servicios.EspecializacionServicio;
import idat.edu.pe.daa2.servicios.RolServicio;
import idat.edu.pe.daa2.servicios.UsuarioServicio;

@SpringBootApplication
public class Continua2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Continua2Application.class, args);
		
		
		//crearCurso(ctx);
		//crearEspecializacion(ctx);
		//crearArea(ctx);
		//crearDistrito(ctx);
		//crearEmpleado(ctx);
		//crearRol(ctx);
		//crearUsuario(ctx);
		//eliminarArea(ctx);
		//eliminarCurso(ctx);
		//eliminarRol(ctx);
		//eliminarDistrito(ctx, 2);
		//actualizarDistrito(ctx);
		//actualizarCurso(ctx);
	}

	private static void crearCurso(ConfigurableApplicationContext ctx) {

		CursoServicio servicio = ctx.getBean(CursoServicio.class);
		Curso nuevoCurso = new Curso("CUR01", "Matematica Avanzada");
		Curso nuevoCurso2 = new Curso("CUR02", "Comunicacion");
		Curso nuevoCurso3 = new Curso("CUR03", "Programacion");
		Curso nuevoCurso4 = new Curso("CUR04", "Estadistica");
		Curso nuevoCurso5 = new Curso("CUR05", "Ingles I");
		Curso nuevoCurso6 = new Curso("CUR06", "Introduccion a SO I");

		servicio.create(nuevoCurso);
		servicio.create(nuevoCurso2);
		servicio.create(nuevoCurso3);
		servicio.create(nuevoCurso4);
		servicio.create(nuevoCurso5);
		servicio.create(nuevoCurso6);

	}

	private static void crearEspecializacion(ConfigurableApplicationContext ctx) {

		CursoServicio servicio2 = ctx.getBean(CursoServicio.class);
		EspecializacionServicio servicio = ctx.getBean(EspecializacionServicio.class);

		Curso curso1 = servicio2.findById(1);
		Curso curso2 = servicio2.findById(2);
		Curso curso3 = servicio2.findById(3);
		Curso curso4 = servicio2.findById(4);
		Curso curso5 = servicio2.findById(5);
		Curso curso6 = servicio2.findById(6);
		Curso curso7 = servicio2.findById(7);

		Especializacion especializacion = new Especializacion(null, "ESP02", "Maestro Inicial");
		List<Curso> cursosEsp01 = new ArrayList<Curso>();

		cursosEsp01.add(curso1);
		cursosEsp01.add(curso2);
		cursosEsp01.add(curso3);
		cursosEsp01.add(curso4);
		cursosEsp01.add(curso5);
		cursosEsp01.add(curso6);
		cursosEsp01.add(curso7);

		especializacion.setCursoList(cursosEsp01);

		servicio.create(especializacion);

	}

	private static void crearArea(ConfigurableApplicationContext ctx) {

		AreaServicio servicio = ctx.getBean(AreaServicio.class);
		Area nuevaArea = new Area(null,"Administracion");
		Area nuevaArea2 = new Area(null,"Caja");
		Area nuevaArea3 = new Area(null,"Mesa de Ayuda");
		Area nuevaArea4 = new Area(null,"Coordinación");
		Area nuevaArea5 = new Area(null,"Asistente de Ventas");

		servicio.create(nuevaArea);
		servicio.create(nuevaArea2);
		servicio.create(nuevaArea3);
		servicio.create(nuevaArea4);
		servicio.create(nuevaArea5);
		

	}
	
	private static void crearDistrito(ConfigurableApplicationContext ctx) {

		DistritoServicio servicio = ctx.getBean(DistritoServicio.class);
		Distrito distrito = new Distrito(null,"Lima2","Ancon");
		Distrito distrito2 = new Distrito(null,"Lima3","Ate");
		Distrito distrito3 = new Distrito(null,"Lima4","Baranco");
		Distrito distrito4 = new Distrito(null,"Lima5","Breña");
		Distrito distrito5 = new Distrito(null,"Lima6","Carabayllo");
		

		servicio.create(distrito);
		servicio.create(distrito2);
		servicio.create(distrito3);
		servicio.create(distrito4);
		servicio.create(distrito5);
		

	}
	
	private static void crearEmpleado(ConfigurableApplicationContext ctx) {

		EmpleadoServicio servicioEmpleado= ctx.getBean(EmpleadoServicio.class);
		DistritoServicio servicioDistrito = ctx.getBean(DistritoServicio.class);
		AreaServicio servicioArea = ctx.getBean(AreaServicio.class);
		
		Distrito distrito = servicioDistrito.findById(1);
		Area area= servicioArea.findById(1);
		
		if(distrito != null) System.out.println("Distrito obtenido");
		
		if(area != null) System.out.println("Area Obtenida");
		
		Empleado empleado1 = new Empleado();
		
		empleado1.setNOMBRES("asd");
		empleado1.setAPELLIDO_PA("Izagasduirre");
		empleado1.setAPELLIDO_MA("Colachagua");
		empleado1.setDNI("72812569");
		empleado1.setSEXO("M");
		empleado1.setFECHA_NACIMIENTO(new Date());
		empleado1.setDIRECCION("Av Santa clara 12312");
		empleado1.setTELEFONO("970123123");
		empleado1.setESTADO("Activo");
		empleado1.setArea(area);
		empleado1.setDistrito(distrito);
		
		servicioEmpleado.create(empleado1);
		
	}
	
	private static void crearRol(ConfigurableApplicationContext ctx) {

		RolServicio servicio = ctx.getBean(RolServicio.class);
		Rol rol = new Rol(null,"ROLE_ADMIN");
		Rol rol2 = new Rol(null,"ROLE_USER");
		Rol rol3 = new Rol(null,"ROLE_CLIENT");
		Rol rol4 = new Rol(null,"ROLE_OTHER");


		servicio.create(rol);

		servicio.create(rol2);

		servicio.create(rol3);

		servicio.create(rol4);
	
	}
	
	private static void eliminarRol(ConfigurableApplicationContext ctx, int id) {

		RolServicio servicio = ctx.getBean(RolServicio.class);
		servicio.DeleteById(id);
	}
	
	private static void eliminarDistrito(ConfigurableApplicationContext ctx, int id) {

		DistritoServicio servicio = ctx.getBean(DistritoServicio.class);
		servicio.DeleteById(id);
	}
	private static void eliminarCurso(ConfigurableApplicationContext ctx, int id) {

		CursoServicio servicio = ctx.getBean(CursoServicio.class);
		servicio.DeleteById(id);
	}
	private static void eliminarArea(ConfigurableApplicationContext ctx, int id) {

		AreaServicio servicio = ctx.getBean(AreaServicio.class);
		servicio.DeleteById(id);
	}
		
	private static void actualizarDistrito(ConfigurableApplicationContext ctx) {

		DistritoServicio servicio = ctx.getBean(DistritoServicio.class);
		Distrito distrito = new Distrito();
		
		distrito.setID_DISTRITO(1);
		distrito.setCODPOSTAL("LM");
		distrito.setNOMBRE_DISTRITO("Lima");
		servicio.update(distrito);
	}
	
private static void actualizarCurso(ConfigurableApplicationContext ctx) {

	CursoServicio servicio = ctx.getBean(CursoServicio.class);
	Curso curso= new Curso();
	
	curso.setID_CURSO(1);
	curso.setCOD_CURSO("CUR");
	curso.setNOMBRE_CURSO("CURSO ACTUALIZADO");
	servicio.update(curso);
}
	private static void crearUsuario(ConfigurableApplicationContext ctx) {

		RolServicio servicio2 = ctx.getBean(RolServicio.class);
		UsuarioServicio servicio = ctx.getBean(UsuarioServicio.class);

		Rol rol1 = servicio2.findById(1);
		Rol rol2 = servicio2.findById(2);

		System.out.println(rol1.getROL());
		System.out.println(rol2.getROL());
		
		Usuario usuario = new Usuario(null, "admin", "adm");
		List<Rol> rolesUsu = new ArrayList<Rol>();

		rolesUsu.add(rol1);
		rolesUsu.add(rol2);
		
		usuario.setRolList(rolesUsu);

		servicio.create(usuario);


	}

	
	
	
}
