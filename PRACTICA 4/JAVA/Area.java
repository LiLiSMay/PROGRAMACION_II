public class Area {

    // Circulo
    public double calcular(double radio) {
        return Math.PI * radio * radio;
    }

    // Triangulo rectangulo o Rectangulo
    public double calcular(double base, double altura) {
        return (base * altura) / 2;
    }

    // Trapecio
    public double calcular(double base1, double base2, double altura) {
        return ((base1 + base2) * altura) / 2;
    }

    // Pentagono
    public double calcular(double lado, double apotema, int dummy1, int dummy2, int dummy3) {
        return (5 * lado * apotema) / 2;
    }
}
