class Cola:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.inicio = 0
        self.fin = -1
        self.cantidad = 0

    def insert(self, e):
        if self.isFull():
            print("Error: Cola llena")
            return
        self.fin = (self.fin + 1) % self.n
        self.arreglo[self.fin] = e
        self.cantidad += 1

    def remove(self):
        if self.isEmpty():
            print("Error: Cola vacía")
            return None
        valor = self.arreglo[self.inicio]
        self.inicio = (self.inicio + 1) % self.n
        self.cantidad -= 1
        return valor

    def peek(self):
        if self.isEmpty():
            print("Error: Cola vacía")
            return None
        return self.arreglo[self.inicio]

    def isEmpty(self):
        return self.cantidad == 0

    def isFull(self):
        return self.cantidad == self.n

    def size(self):
        return self.cantidad


if __name__ == "__main__":
    cola = Cola(5)
    cola.insert(10)
    cola.insert(20)
    cola.insert(30)
    print("Frente:", cola.peek())
    print("Elemento eliminado:", cola.remove())
    print("Nuevo frente:", cola.peek())
    print("¿Está vacía?", cola.isEmpty())
    print("Tamaño actual:", cola.size())
