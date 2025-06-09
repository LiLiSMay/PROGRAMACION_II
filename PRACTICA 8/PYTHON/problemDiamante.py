class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z
    def incrementaXZ(self):
        self.x += 1
        self.z += 1
    def incrementaZ(self):
        self.z += 1
    def __str__(self):
        return f"A => x: {self.x}, z: {self.z}"

class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z
    def incrementaYZ(self):
        self.y += 1
        self.z += 1
    def incrementaZ(self):
        self.z += 1

   def __str__(self):
        return f"B => y: {self.y}, z: {self.z}"

class D:
    def __init__(self, x, y, z):
        self.a = A(x, z)
        self.b = B(y, z)
    def incrementaXYZ(self):
        self.a.x += 1
        self.b.y += 1
        self.a.z += 1
        self.b.z += 1
    def __str__(self):
        return f"D => {self.a} | {self.b}"

d = D(1, 2, 3)
print(d)
d.incrementaXYZ()
print("Despues de incrementaXYZ():")
print(d)
