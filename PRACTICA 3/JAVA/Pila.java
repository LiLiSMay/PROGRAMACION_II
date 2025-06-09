public class Pila {
    private long[] arreglo;
    private int top;
    private int n;

    public Pila(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.top = -1;
    }

    public void push(long e) {
        if (isFull()) {
            System.out.println("Error: Pila llena");
            return;
        }
        arreglo[++top] = e;
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("Error: Pila vacía");
            return -1;
        }
        return arreglo[top--];
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("Error: Pila vacía");
            return -1;
        }
        return arreglo[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == n - 1;
    }
}
