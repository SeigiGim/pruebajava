package generationpruebajava.pruebajava.models;

public class Colegio {
  public String nombreColegio;
  public Integer cantidadCursos;
  public Integer cantidadAlumnos;
  public Integer cantidadProfesores;
  public Integer cantidadRamos;

  public Colegio() {
  }

  public Colegio(String nombreColegio, Integer cantidadCursos, Integer cantidadAlumnos, Integer cantidadProfesores,
      Integer cantidadRamos) {
    this.nombreColegio = nombreColegio;
    this.cantidadCursos = cantidadCursos;
    this.cantidadAlumnos = cantidadAlumnos;
    this.cantidadProfesores = cantidadProfesores;
    this.cantidadRamos = cantidadRamos;
  }

  public String getNombreColegio() {
    return nombreColegio;
  }

  public void setNombreColegio(String nombreColegio) {
    this.nombreColegio = nombreColegio;
  }

  public Integer getCantidadCursos() {
    return cantidadCursos;
  }

  public void setCantidadCursos(Integer cantidadCursos) {
    this.cantidadCursos = cantidadCursos;
  }

  public Integer getCantidadAlumnos() {
    return cantidadAlumnos;
  }

  public void setCantidadAlumnos(Integer cantidadAlumnos) {
    this.cantidadAlumnos = cantidadAlumnos;
  }

  public Integer getCantidadProfesores() {
    return cantidadProfesores;
  }

  public void setCantidadProfesores(Integer cantidadProfesores) {
    this.cantidadProfesores = cantidadProfesores;
  }

  public Integer getCantidadRamos() {
    return cantidadRamos;
  }

  public void setCantidadRamos(Integer cantidadRamos) {
    this.cantidadRamos = cantidadRamos;
  }

  @Override
  public String toString() {
    return "Colegio [nombreColegio=" + nombreColegio + ", cantidadCursos=" + cantidadCursos + ", cantidadAlumnos="
        + cantidadAlumnos + ", cantidadProfesores=" + cantidadProfesores + ", cantidadRamos=" + cantidadRamos + "]";
  }

}
