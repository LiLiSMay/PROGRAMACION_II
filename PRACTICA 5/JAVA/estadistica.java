import java.util.Scanner;

/** Maya Salomé Machaca Arcani **/

public class ModularEstructurado {
    public static double promedio(double[] datos) {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.length;
    }

    public static double desviacion(double[] datos) {
        double prom = promedio(datos);
        double suma = 0;
        for (double num : datos) {
            suma += Math.pow(num - prom, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            datos[i] = sc.nextDouble();
        }
        sc.close();

        System.out.println("El promedio es " + promedio(datos));
        System.out.println("La desviacion estándar es " + desviacion(datos));
    }
}
