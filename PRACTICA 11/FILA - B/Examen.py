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
        return f"Anuncio #{self.__numero} - Precio: {self.__precio}"


class Obra:
    def __init__(self, titulo: str, material: str, a1: Artista, a2: Artista, anuncio: Anuncio = None):
        self.__titulo = titulo
        self.__material = material
        self.__a1 = a1
        self.__a2 = a2
        self.__anuncio = anuncio

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

    def get_genero(self):
        return self.__genero

    def __str__(self):
        return super().__str__() + f" - Género: {self.__genero}"


# inciso a) Crear dos objetos pintura que tengan anuncios de venta

artista1 = Artista("Carlos", 1111, 6)
artista2 = Artista("Lucía", 2222, 4)
artista3 = Artista("Pedro", 3333, 8)
artista4 = Artista("Elena", 4444, 2)

anuncio1 = Anuncio(1, 1200.0)
anuncio2 = Anuncio(2, 1800.0)

pintura1 = Pintura("Montaña", "Óleo", artista1, artista2, "Paisaje", anuncio1)
pintura2 = Pintura("Marina", "Acuarela", artista3, artista4, "Naturaleza", anuncio2)

print("Pintura 1:", pintura1)
print("Pintura 2:", pintura2)

# inciso b) Calcular el promedio de años de experiencia de los artistas de ambas pinturas

def promedio_experiencia(p1: Pintura, p2: Pintura):
    todos = p1.get_artistas() + p2.get_artistas()
    total = sum([a.get_experiencia() for a in todos])
    return total / len(todos)

print("Promedio de experiencia:", promedio_experiencia(pintura1, pintura2))

# inciso c) Incrementar el precio en X a la pintura del artista con nombre X

def incrementar_precio_por_artista(p1: Pintura, p2: Pintura, nombre_artista: str, incremento: float):
    for pintura in [p1, p2]:
        for artista in pintura.get_artistas():
            if artista.get_nombre() == nombre_artista:
                anuncio = pintura.get_anuncio()
                if anuncio:
                    nuevo_precio = anuncio.get_precio() + incremento
                    anuncio.set_precio(nuevo_precio)
                    print(f"Precio incrementado para obra de {nombre_artista}: nuevo precio = {nuevo_precio}")

incrementar_precio_por_artista(pintura1, pintura2, "Pedro", 500.0)