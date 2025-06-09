import math

def area(*args):
    if len(args) == 1:
        # aea de un círculo: π * r²
        r = args[0]
        return math.pi * r**2
    elif len(args) == 2:
        b, h = args
        # Si es triangulo rectangulo: (b * h) / 2
        return (b * h) / 2
    elif len(args) == 3:
        # Trapecio: (b1 + b2) * h / 2
        b1, b2, h = args
        return ((b1 + b2) * h) / 2
    elif len(args) == 5:
        # Pentagono regular: (5/2) * l * a
        # l: lado, a: apotema
        l, a = args[0], args[1]
        return (5 * l * a) / 2
    else:
        raise ValueError("Número de argumentos no válido para calcular área.")


if __name__ == "__main__":
    print("Area del circulo (radio=5):", area(5))
    print("Area del triangulo rectangulo (base=4, altura=3):", area(4, 3))
    print("Area del trapecio (b1=5, b2=7, h=4):", area(5, 7, 4))
    print("Area del pentagono regular (lado=6, apotema=4):", area(6, 4, 0, 0, 0))
