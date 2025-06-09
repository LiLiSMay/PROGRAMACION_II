import java.util.Scanner;

class EcuacionCuadratica {
    private double a, b, c;
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    public Double getRaiz1() {
        double discriminante = getDiscriminante();
        return discriminante >= 0 ? (-b + Math.sqrt(discriminante)) / (2 * a) : null;
    }

    public Double getRaiz2() {
        double discriminante = getDiscriminante();
        return discriminante >= 0 ? (-b - Math.sqrt(discriminante)) / (2 * a) : null;
    }

    @Override
    public String toString() {
        double discriminante = getDiscriminante();
        if (discriminante > 0) {
            return "La ecuación tiene dos raíces: " + getRaiz1() + " y " + getRaiz2();
        } else if (discriminante == 0) {
            return "La ecuación tiene una raíz: " + getRaiz1();
        } else {
            return "La ecuación no tiene raíces reales";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        System.out.println(ecuacion);
    }
}
