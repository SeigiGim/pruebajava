package generationpruebajava.pruebajava.models;

import java.util.ArrayList;

public class Alumno extends Persona {
  public ArrayList<Double> notasAlumno = new ArrayList<Double>();
  public Integer cantidadNotas;
  public Double mejorNota;
  public Double peorNota;
  public Double promedio;

  public Alumno() {
    super();
  }

  public Alumno(String nombre, String rol, ArrayList<Double> notasAlumno, Integer cantidadNotas, Double mejorNota,
      Double peorNota,
      Double promedio) {
    super(nombre, rol);
    this.notasAlumno = notasAlumno;
    this.cantidadNotas = cantidadNotas;
    this.mejorNota = mejorNota;
    this.peorNota = peorNota;
    this.promedio = promedio;
  }

  public ArrayList<Double> getNotasAlumno() {
    return notasAlumno;
  }

  public void setNotasAlumno(ArrayList<Double> notasAlumno) {
    this.notasAlumno = notasAlumno;
  }

  public Integer getCantidadNotas() {
    return cantidadNotas;
  }

  public void setCantidadNotas(Integer cantidadNotas) {
    this.cantidadNotas = cantidadNotas;
  }

  public Double getMejorNota() {
    return mejorNota;
  }

  public void setMejorNota(Double mejorNota) {
    this.mejorNota = mejorNota;
  }

  public Double getPeorNota() {
    return peorNota;
  }

  public void setPeorNota(Double peorNota) {
    this.peorNota = peorNota;
  }

  public Double getPromedio() {
    return promedio;
  }

  public void setPromedio(Double promedio) {
    this.promedio = promedio;
  }

  @Override
  public String toString() {
    return super.toString() + "Alumno [notasAlumno=" + notasAlumno + ", mejorNota=" + mejorNota + ", peorNota="
        + peorNota + ", promedio="
        + promedio + "]";
  }

}
