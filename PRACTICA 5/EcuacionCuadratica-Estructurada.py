import math

class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def get_discriminante(self):
        return (self.b ** 2) - (4 * self.a * self.c)

    def get_raiz1(self):
        d = self.get_discriminante()
        return (-self.b + math.sqrt(d)) / (2 * self.a) if d >= 0 else None

    def get_raiz2(self):
        d = self.get_discriminante()
        return (-self.b - math.sqrt(d)) / (2 * self.a) if d >= 0 else None

    def __str__(self):
        d = self.get_discriminante()
        if d > 0:
            return f"La ecuación tiene dos raíces: {self.get_raiz1()} y {self.get_raiz2()}"
        elif d == 0:
            return f"La ecuación tiene una raíz: {self.get_raiz1()}"
        else:
            return "La ecuación no tiene raíces reales"

def main():
    try:
        a = float(input("Ingrese a: "))
        b = float(input("Ingrese b: "))
        c = float(input("Ingrese c: "))
        ecuacion = EcuacionCuadratica(a, b, c)
        print(ecuacion)
    except ValueError:
        print("Entrada inválida. Debe ingresar números.")

if __name__ == "__main__":
    main()
