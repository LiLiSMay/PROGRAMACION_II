import math
def getDiscriminante(a, b, c):
    return (b ** 2) - (4 * a * c)
def getRaiz1(a, b, c):
    discriminante = getDiscriminante(a, b, c)
    if discriminante < 0:
        return None  
    return (-b + math.sqrt(discriminante)) / (2 * a)
def getRaiz2(a, b, c):
    discriminante = getDiscriminante(a, b, c)
    if discriminante < 0:
        return None  
    return (-b - math.sqrt(discriminante)) / (2 * a)
def main():
    a, b, c = map(float, input("Ingrese a, b, c: ").split())
    discriminante = getDiscriminante(a, b, c)
    if discriminante > 0:
        print(f"La ecuacion tiene dos raices {getRaiz1(a, b, c):.5f} y {getRaiz2(a, b,    
              c):.5f}")
    elif discriminante == 0:
        print(f"La ecuacion tiene una raiz {getRaiz1(a, b, c):.5f}")
    else:
        print("La ecuacion no tiene raices reales")
if __name__ == "__main__":
    main()
