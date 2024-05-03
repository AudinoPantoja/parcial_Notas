public class Estudiante {
    String nombre;
    int edad;
    Long carrera;
    double promedio;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, Long carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Getters y setters omitidos para brevedad

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Long getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(Long carrera) {
        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
