public class MainPila {
    public static void main(String[] args) {
        Pila pila = new Pila(5);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Tope: " + pila.peek());
        System.out.println("Elemento extraído: " + pila.pop());
        System.out.println("Tope actual: " + pila.peek());
        System.out.println("¿Está vacía? " + pila.isEmpty());
    }
}
