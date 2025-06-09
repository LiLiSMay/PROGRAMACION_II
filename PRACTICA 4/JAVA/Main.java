public class Main {
    public static void main(String[] args) {
        Area area = new Area();

        System.out.printf("Area del circulo (radio=5): %.2f%n", area.calcular(5.0));
        System.out.printf("Area del triangulo rectangulo (base=4, altura=3): %.2f%n", area.calcular(4.0, 3.0));
        System.out.printf("Area del trapecio (b1=5, b2=7, h=4): %.2f%n", area.calcular(5.0, 7.0, 4.0));
        System.out.printf("Area del pentagono (lado=6, apotema=4): %.2f%n", area.calcular(6.0, 4.0, 0, 0, 0));
    }
}
