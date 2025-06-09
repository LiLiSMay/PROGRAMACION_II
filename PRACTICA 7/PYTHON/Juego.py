import random

class Juego:
    def __init__(self, numero_vidas):
        self.numeroDeVidas = numero_vidas
        self.record = 0

    def reiniciaPartida(self):
        print("Reiniciando partida...")
        # Reinicia vidas (puede redefinirse si es necesario en el futuro)
        pass

    def actualizaRecord(self):
        print("Actualizando record...")
        self.record += 1
        print("Nuevo record:", self.record)

    def quitaVida(self):
        self.numeroDeVidas -= 1
        if self.numeroDeVidas > 0:
            print("Te quedan", self.numeroDeVidas, "vidas.")
            return True
        else:
            print("No te quedan vidas. Has perdido.")
            return False

class JuegoAdivinaNumero(Juego):
    def __init__(self, numero_vidas):
        super().__init__(numero_vidas)
        self.numeroAAdivinar = 0

    def juega(self):
        self.reiniciaPartida()
        self.numeroAAdivinar = random.randint(0, 10)

        print("Bienvenido al juego de adivinar el numero.")
        print("Debes adivinar un numero entre 0 y 10.")

        while True:
            try:
                intento = int(input("Introduce tu intento: "))
            except ValueError:
                print("Por favor, introduce un numero valido.")
                continue

            if intento == self.numeroAAdivinar:
                print("Acertaste!!")
                self.actualizaRecord()
                break
            else:
                if self.quitaVida():
                    if intento < self.numeroAAdivinar:
                        print("El numero a adivinar es mayor.")
                    else:
                        print("El numero a adivinar es menor.")
                else:
                    break

class Aplicacion:
    @staticmethod
    def main():
        juego = JuegoAdivinaNumero(3)
        juego.juega()


if __name__ == "__main__":
    Aplicacion.main()
