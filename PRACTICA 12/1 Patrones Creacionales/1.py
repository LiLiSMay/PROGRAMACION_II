class CentralEmergencias:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls)
            cls._instancia.reportes = []
        return cls._instancia

    def recibir_reporte(self, descripcion):
        self.reportes.append(descripcion)

    def ver_reportes(self):
        for r in self.reportes:
            print("Reporte:", r)