public class Direccion {
    private String detalle;

    public Direccion() {
        this.detalle = "";
    }

    public Direccion(String detalle) {
        this.detalle = detalle;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return detalle;
    }
}
