class Artista:
    def __init__(self, nombre: str, ci: int, años_experiencia: int):
        self.__nombre = nombre
        self.__ci = ci
        self.__años_experiencia = años_experiencia

    def get_nombre(self):
        return self.__nombre

    def get_experiencia(self):
        return self.__años_experiencia

    def __str__(self):
        return f"{self.__nombre} (CI: {self.__ci}, Experiencia: {self.__años_experiencia})"


class Anuncio:
    def __init__(self, numero: int, precio: float):
        self.__numero = numero
        self.__precio = precio

    def get_precio(self):
        return self.__precio

    def set_precio(self, nuevo_precio: float):
        self.__precio = nuevo_precio

    def __str__(self):
        return f"Anuncio #{self.__numero}, Precio: {self.__precio}"


class Obra:
    def __init__(self, titulo: str, material: str, a1: Artista, a2: Artista, anuncio: Anuncio = None):
        self.__titulo = titulo
        self.__material = material
        self.__a1 = a1
        self.__a2 = a2
        self.__anuncio = anuncio  # agregación

    def get_artistas(self):
        return [self.__a1, self.__a2]

    def get_anuncio(self):
        return self.__anuncio

    def set_anuncio(self, anuncio: Anuncio):
        self.__anuncio = anuncio

    def __str__(self):
        return f"Obra: {self.__titulo} ({self.__material})"


class Pintura(Obra):
    def __init__(self, titulo: str, material: str, a1: Artista, a2: Artista, genero: str, anuncio: Anuncio = None):
        super().__init__(titulo, material, a1, a2, anuncio)
        self.__genero = genero

    def __str__(self):
        return super().__str__() + f" - Género: {self.__genero}"


# -----------inciso a. Crear dos objetos pintura que tengan un anuncio y otro sin anuncio---------
artista1 = Artista("Juan", 12345, 5)
artista2 = Artista("Ana", 54321, 7)
artista3 = Artista("Luis", 11111, 3)
artista4 = Artista("Maria", 22222, 10)

anuncio1 = Anuncio(101, 3000.0)

pintura1 = Pintura("Atardecer", "Oleo", artista1, artista2, "Paisaje", anuncio1)
pintura2 = Pintura("Retrato", "Acrílico", artista3, artista4, "Retrato")  # sin anuncio

print(pintura1)
print(pintura2)

# ---------- inciso b. Mostrar el nombre del artista con más años de experiencia de ambas pinturas ----------
def artista_mas_experto(p1: Pintura, p2: Pintura):
    todos = p1.get_artistas() + p2.get_artistas()
    experto = max(todos, key=lambda a: a.get_experiencia())
    return experto.get_nombre()

print("Artista con más experiencia:", artista_mas_experto(pintura1, pintura2))

# ----------inciso  c. Agregar un anuncio a pintura2 y mostrar el monto total de ambas pinturas ----------
anuncio2 = Anuncio(102, 4500.0)
pintura2.set_anuncio(anuncio2)

def total_venta(p1: Pintura, p2: Pintura):
    total = 0
    for p in [p1, p2]:
        if p.get_anuncio() is not None:
            total += p.get_anuncio().get_precio()
    return total

print("Total de venta de ambas pinturas:", total_venta(pintura1, pintura2))