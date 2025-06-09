public class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;
    private int cantidad;

    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
        this.cantidad = 0;
    }

    public void insert(long e) {
        if (isFull()) {
            System.out.println("Error: Cola llena");
            return;
        }
        fin = (fin + 1) % n;
        arreglo[fin] = e;
        cantidad++;
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("Error: Cola vacía");
            return -1;
        }
        long valor = arreglo[inicio];
        inicio = (inicio + 1) % n;
        cantidad--;
        return valor;
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("Error: Cola vacía");
            return -1;
        }
        return arreglo[inicio];
    }

    public boolean isEmpty() {
        return cantidad == 0;
    }

    public boolean isFull() {
        return cantidad == n;
    }

    public int size() {
        return cantidad;
    }
}
