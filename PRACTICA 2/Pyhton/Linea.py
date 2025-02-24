import matplotlib.pyplot as plt
#MACHACA ARCANI MAYA SALOME
class Linea:
    class Punto:
        def __init__(self, x, y):
            self.x = x
            self.y = y

        def __str__(self):
            return f"({self.x}, {self.y})"

    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea: {self.p1} a {self.p2}"

    def dibujaLinea(self):
        plt.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], marker="o", linestyle="-", color="blue")
        plt.xlim(0, 400)
        plt.ylim(0, 400)
        plt.gca().invert_yaxis()
        plt.title("Dibujando Línea")
        plt.show()
        
p1 = Linea.Punto(50, 100)
p2 = Linea.Punto(300, 200)
linea = Linea(p1, p2)
linea.dibujaLinea()
