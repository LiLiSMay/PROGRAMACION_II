public class Main {
    public static void main(String[] args) {
        Direccion d1 = new Direccion("Estación Central, Estación Cementerio, Estación 16 de Julio");
        Ministerio m1 = new Ministerio();
        Ministerio m2 = new Ministerio("Rojo", d1);

        System.out.println("--- Ministerio 1 (vacio) ---");
        System.out.println(m1);
        System.out.println("--- Ministerio 2 ---");
        System.out.println(m2);

        System.out.println("--- Eliminando empleado de edad 26 ---");
        m2.eliminarEmpleadoPorEdad(26);
        System.out.println(m2);

        System.out.println("--- Transfiriendo empleado 'Saul' de m2 a m1 ---");
        m1.transferirEmpleadoDesde(m2, "Saul");
        System.out.println("--- Ministerio 1 después de transferencia ---");
        System.out.println(m1);
        System.out.println("--- Ministerio 2 después de transferencia ---");
        System.out.println(m2);

        System.out.println("--- Empleado con menor edad en m1 ---");
        m1.mostrar(m1.edadMinima());

        System.out.println("--- Empleado con menor sueldo en m1 ---");
        m1.mostrar(m1.sueldoMinimo());
    }

}
