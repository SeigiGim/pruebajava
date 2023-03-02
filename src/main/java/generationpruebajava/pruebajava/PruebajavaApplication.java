package generationpruebajava.pruebajava;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

import generationpruebajava.pruebajava.models.Alumno;
import generationpruebajava.pruebajava.models.Colegio;
import generationpruebajava.pruebajava.models.Curso;
import generationpruebajava.pruebajava.models.Persona;
import generationpruebajava.pruebajava.models.Profesor;
import generationpruebajava.pruebajava.models.Ramo;

@SpringBootApplication
public class PruebajavaApplication {

	public static void promedioAlumno(Colegio colegio, Profesor profesor, Alumno alumno, Scanner ingreso,
			HashMap libroClases) {
		System.out.println("Hola, profesor " + profesor.getNombre() + ".");
		for (int i = 1; i <= colegio.getCantidadAlumnos(); i++) {

			// ArrayList<String> listaNombres = new ArrayList<String>();
			System.out.println("Ingrese " + alumno.getCantidadNotas() + " notas por alumno.");
			System.out.print("Ingrese el nombre del alumno " + i + " : ");
			String ingresoNombre = ingreso.nextLine();
			alumno.setNombre(ingresoNombre);
			for (int j = 1; j <= alumno.getCantidadNotas(); j++) {

				System.out.print("Ingrese nota " + j + " del alumno " + alumno.getNombre() + " : ");
				Double ingresoNota = ingreso.nextDouble();
				alumno.setNotasAlumno(ingresoNota);
				alumno.getNotasAlumno();
				System.out.println(alumno.toString());
			}
			libroClases.put(alumno.getNombre(), )
			ingreso.nextLine();
		}
	}

	public static void main(String[] args) {

		Scanner ingreso = new Scanner(System.in);

		HashMap<String, ArrayList<Double>> libroClases = new HashMap<String, ArrayList<Double>>();

		// Creación del colegio
		Colegio colegioAlpes = new Colegio("Colegio Alpes", 1, 2, 2, 2);
		System.out.println(colegioAlpes);

		Profesor profesorAlejandro = new Profesor("Alejandro", "Profesor", "Lenguaje");
		System.out.println(profesorAlejandro);

		Alumno nuevoAlumno = new Alumno(null, null, null, 4, null, null, null);

		promedioAlumno(colegioAlpes, profesorAlejandro, nuevoAlumno, ingreso);

	}

}
