package generationpruebajava.pruebajava.models;

public class Profesor extends Persona {
  public String ramoImpartido;

  public Profesor() {
    super();
  }

  public Profesor(String nombre, String rol, String ramoImpartido) {
    super(nombre, rol);
    this.ramoImpartido = ramoImpartido;
  }

  public String getRamoImpartido() {
    return ramoImpartido;
  }

  public void setRamoImpartido(String ramoImpartido) {
    this.ramoImpartido = ramoImpartido;
  }

  @Override
  public String toString() {
    return super.toString() + "Profesor [ramoImpartido = " + ramoImpartido + "]";
  }

}
