class GrupoVecinos:
    def __init__(self):
        self.vecinos = []

    def agregar(self, vecino):
        self.vecinos.append(vecino)

    def enviar_mensaje(self, mensaje):
        print("📢 [Grupo] Nuevo mensaje:", mensaje)
        for v in self.vecinos:
            v.recibir(mensaje)

class VecinoJuan:
    def recibir(self, mensaje):
        print("📩 Juan recibió:", mensaje)

class VecinoAna:
    def recibir(self, mensaje):
        print("📩 Ana recibió:", mensaje)

grupo = GrupoVecinos()
juan = VecinoJuan()
ana = VecinoAna()
grupo.agregar(juan)
grupo.agregar(ana)
grupo.enviar_mensaje("Habrá corte de agua mañana.")