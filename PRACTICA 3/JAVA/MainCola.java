public class MainCola {
    public static void main(String[] args) {
        Cola cola = new Cola(5);
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        System.out.println("Frente: " + cola.peek());
        System.out.println("Elemento eliminado: " + cola.remove());
        System.out.println("Nuevo frente: " + cola.peek());
        System.out.println("¿Está vacía? " + cola.isEmpty());
        System.out.println("Tamaño actual: " + cola.size());
    }
}
