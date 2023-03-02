package generationpruebajava.pruebajava.models;

public class Ramo {
  public String nombre;

  public Ramo() {
  }

  public Ramo(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Ramo [nombre=" + nombre + "]";
  }

}
