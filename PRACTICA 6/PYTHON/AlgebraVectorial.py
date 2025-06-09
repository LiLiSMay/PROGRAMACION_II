import math

class AlgebraVectorial:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def suma(self):
        return [ai + bi for ai, bi in zip(self.a, self.b)]

    def resta(self):
        return [ai - bi for ai, bi in zip(self.a, self.b)]

    def norma(self, v):
        return math.sqrt(sum(vi ** 2 for vi in v))

    def producto_punto(self):
        return sum(ai * bi for ai, bi in zip(self.a, self.b))

    def producto_cruz(self):
        if len(self.a) == 3 and len(self.b) == 3:
            return [
                self.a[1] * self.b[2] - self.a[2] * self.b[1],
                self.a[2] * self.b[0] - self.a[0] * self.b[2],
                self.a[0] * self.b[1] - self.a[1] * self.b[0]
            ]
        else:
            raise ValueError("El producto cruz solo se define en R^3")

    # a)
    def es_perpendicular_suma_modulos(self):
        return math.isclose(self.norma(self.suma()), self.norma(self.resta()))

    # b) 
    def es_perpendicular_mutua(self):
        return math.isclose(self.norma(self.resta()), self.norma([bi - ai for ai, bi in zip(self.a, self.b)]))

    # c) 
    def es_perpendicular_punto(self):
        return math.isclose(self.producto_punto(), 0)

    # d) 
    def es_perpendicular_suma_cuadrados(self):
        suma_ab = [ai + bi for ai, bi in zip(self.a, self.b)]
        norma_suma2 = sum(x ** 2 for x in suma_ab)
        norma_a2 = sum(ai ** 2 for ai in self.a)
        norma_b2 = sum(bi ** 2 for bi in self.b)
        return math.isclose(norma_suma2, norma_a2 + norma_b2)

    # e) 
    def es_paralela_escalar(self):
        razones = []
        for ai, bi in zip(self.a, self.b):
            if bi == 0 and ai == 0:
                continue
            elif bi == 0:
                return False
            else:
                razones.append(ai / bi)
        return all(math.isclose(r, razones[0]) for r in razones)

    # f) 
    def es_paralela_cruz(self):
        try:
            cruz = self.producto_cruz()
            return all(math.isclose(ci, 0) for ci in cruz)
        except ValueError:
            return False

    # g) 
    def proyeccion_a_sobre_b(self):
        producto = self.producto_punto()
        norma_b2 = self.norma(self.b) ** 2
        escalar = producto / norma_b2
        return [escalar * bi for bi in self.b]

    # h) 
    def componente_a_en_b(self):
        producto = self.producto_punto()
        norma_b = self.norma(self.b)
        return producto / norma_b


if __name__ == "__main__":
    a = [3, 4, 0]
    b = [4, -3, 0]

    av = AlgebraVectorial(a, b)

    print("Vector a:", a)
    print("Vector b:", b)
    print()

    print("a) ¿Perpendicular (|a + b| = |a - b|)?", av.es_perpendicular_suma_modulos())
    print("b) ¿Perpendicular (mutua)?", av.es_perpendicular_mutua())
    print("c) ¿Perpendicular (a · b = 0)?", av.es_perpendicular_punto())
    print("d) ¿Perpendicular (|a + b|² = |a|² + |b|²)?", av.es_perpendicular_suma_cuadrados())
    print("e) ¿Paralela (a = r·b)?", av.es_paralela_escalar())
    print("f) ¿Paralela (a × b = 0)?", av.es_paralela_cruz())
    print("g) Proyección de a sobre b:", av.proyeccion_a_sobre_b())
    print("h) Componente de a en dirección de b:", av.componente_a_en_b())
