import matplotlib.pyplot as plt
import numpy as np

#MACHACA ARCANI MAYA SALOME

class Circulo:
    class Punto:
        def __init__(self, x, y):
            self.x = x
            self.y = y

        def __str__(self):
            return f"({self.x}, {self.y})"

    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Circulo: centro {self.centro}, radio {self.radio}"

    def dibujaCirculo(self):
        fig, ax = plt.subplots()
        circle = plt.Circle((self.centro.x, self.centro.y), self.radio, fill=False, color="red")
        ax.add_patch(circle)
        ax.set_xlim(0, 400)
        ax.set_ylim(0, 400)
        ax.set_aspect(1)
        plt.gca().invert_yaxis()
        plt.title("Dibujando Círculo")
        plt.show()
        
centro = Circulo.Punto(200, 200)
circulo = Circulo(centro, 50)
circulo.dibujaCirculo()