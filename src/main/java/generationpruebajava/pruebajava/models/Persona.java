package generationpruebajava.pruebajava.models;

public class Persona {
  public String nombre;
  public String rol;

  public Persona() {
  }

  public Persona(String nombre, String rol) {
    this.nombre = nombre;
    this.rol = rol;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

  @Override
  public String toString() {
    return "Persona [nombre=" + nombre + ", rol=" + rol + "]";
  }

}
