public class Main {
    public static void main(String[] args) {
        Vector a = new Vector(3, 4, 0);
        Vector b = new Vector(4, -3, 0);

        AlgebraVectorial av = new AlgebraVectorial(a, b);

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);
        System.out.println();

        System.out.println("a) ¿Perpendicular (|a + b| = |a - b|)? " + av.esPerpendicularSumaModulos());
        System.out.println("b) ¿Perpendicular mutua? " + av.esPerpendicularMutua());
        System.out.println("c) ¿Producto punto = 0? " + av.esPerpendicularProductoPunto());
        System.out.println("d) ¿|a + b|^2 = |a|^2 + |b|^2? " + av.esPerpendicularSumaCuadrados());
        System.out.println("e) ¿Paralela por escalar? " + av.esParalelaEscalar());
        System.out.println("f) ¿Paralela por cruz? " + av.esParalelaCruz());
        System.out.println("g) Proyección de a sobre b: " + av.proyeccionASobreB());
        System.out.println("h) Componente de a en dirección de b: " + av.componenteAenB());
    }
}
