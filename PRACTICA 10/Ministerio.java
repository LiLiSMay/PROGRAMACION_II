public class Ministerio {
    private String nombre;
    private Direccion direccion;
    private Empleado[] empleados;
    private int nroEmpleados;

    public Ministerio() {
        this.nombre = "";
        this.direccion = new Direccion();
        this.empleados = new Empleado[100];
        this.nroEmpleados = 0;
    }

    public Ministerio(String nombre, Direccion direccion) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;

        agregarEmpleado(new Empleado("Pedro", "Rojas", "Luna", 35, 2500));
        agregarEmpleado(new Empleado("Lucy", "Sosa", "Rios", 43, 3250));
        agregarEmpleado(new Empleado("Ana", "Perez", "Rojas", 26, 2700));
        agregarEmpleado(new Empleado("Saul", "Arce", "Calle", 29, 2500));
    }

    public void agregarEmpleado(Empleado e) {
        if (nroEmpleados < 100) {
            empleados[nroEmpleados++] = e;
        }
    }

    public void eliminarEmpleadoPorEdad(int edad) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i].getEdad() == edad) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j] = empleados[j + 1];
                }
                empleados[--nroEmpleados] = null;
                break;
            }
        }
    }

    public void transferirEmpleadoDesde(Ministerio otro, String nombreEmpleado) {
        for (int i = 0; i < otro.nroEmpleados; i++) {
            if (otro.empleados[i].getNombre().equalsIgnoreCase(nombreEmpleado)) {
                this.agregarEmpleado(otro.empleados[i]);
                for (int j = i; j < otro.nroEmpleados - 1; j++) {
                    otro.empleados[j] = otro.empleados[j + 1];
                }
                otro.empleados[--otro.nroEmpleados] = null;
                break;
            }
        }
    }

    public int edadMinima() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i].getEdad() < min) {
                min = empleados[i].getEdad();
            }
        }
        return min;
    }

    public double sueldoMinimo() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i].getSueldo() < min) {
                min = empleados[i].getSueldo();
            }
        }
        return min;
    }

    // Metodo sobrecargado
    public void mostrar(int edad) {
        System.out.println("Empleados con edad " + edad + ":");
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i].getEdad() == edad) {
                System.out.println(empleados[i]);
            }
        }
    }

    public void mostrar(double sueldo) {
        System.out.println("Empleados con sueldo " + sueldo + ":");
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i].getSueldo() == sueldo) {
                System.out.println(empleados[i]);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ministerio: " + nombre + "\nDirección: " + direccion + "\nEmpleados:\n");
        for (int i = 0; i < nroEmpleados; i++) {
            sb.append(empleados[i]).append("\n");
        }
        return sb.toString();
    }
}
