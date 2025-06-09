class Pila:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.top = -1

    def push(self, e):
        if self.isFull():
            print("Error: Pila llena")
            return
        self.top += 1
        self.arreglo[self.top] = e

    def pop(self):
        if self.isEmpty():
            print("Error: Pila vacía")
            return None
        valor = self.arreglo[self.top]
        self.top -= 1
        return valor

    def peek(self):
        if self.isEmpty():
            print("Error: Pila vacía")
            return None
        return self.arreglo[self.top]

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.n - 1


if __name__ == "__main__":
    pila = Pila(5)
    pila.push(10)
    pila.push(20)
    pila.push(30)
    print("Tope:", pila.peek())
    print("Elemento extraído:", pila.pop())
    print("Tope actual:", pila.peek())
    print("¿Está vacía?", pila.isEmpty())
