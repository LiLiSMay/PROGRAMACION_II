class EnchufeEuropeo:
    def enchufar_europa(self):
        print("🔌 Enchufe europeo conectado")

class AdaptadorEuropeoAamericano:
    def __init__(self):
        self.eu = EnchufeEuropeo()

    def conectar(self):
        print("Usando adaptador europeo → americano")
        self.eu.enchufar_europa()

def usar_enchufe(enchufe):
    enchufe.conectar()

adaptador = AdaptadorEuropeoAamericano()
usar_enchufe(adaptador)
