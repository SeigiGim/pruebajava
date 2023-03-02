package generationpruebajava.pruebajava.models;

import java.util.ArrayList;

public class Curso {
  public String grado;
  public ArrayList<Integer> cantidadAlumnos = new ArrayList<Integer>();

  public Curso() {
  }

  public Curso(String grado, ArrayList<Integer> cantidadAlumnos) {
    this.grado = grado;
    this.cantidadAlumnos = cantidadAlumnos;
  }

  public String getGrado() {
    return grado;
  }

  public void setGrado(String grado) {
    this.grado = grado;
  }

  public ArrayList<Integer> getCantidadAlumnos() {
    return cantidadAlumnos;
  }

  public void setCantidadAlumnos(ArrayList<Integer> cantidadAlumnos) {
    this.cantidadAlumnos = cantidadAlumnos;
  }

}
