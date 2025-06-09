public class Empleado {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private double sueldo;

    public Empleado() {
        this.nombre = "";
        this.paterno = "";
        this.materno = "";
        this.edad = 0;
        this.sueldo = 0.0;
    }

    public Empleado(String nombre, String paterno, String materno, int edad, double sueldo) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Paterno: " + paterno + " Materno: " + materno +
                " Edad: " + edad + " Sueldo: " + sueldo;
    }
}
