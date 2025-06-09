public class Vector {
    private double[] elementos;

    public Vector(double... elementos) {
        this.elementos = elementos;
    }

    public double[] getElementos() {
        return elementos;
    }

    public int dimension() {
        return elementos.length;
    }

    public double norma() {
        double suma = 0;
        for (double v : elementos) {
            suma += v * v;
        }
        return Math.sqrt(suma);
    }

    public Vector suma(Vector otro) {
        double[] resultado = new double[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            resultado[i] = this.elementos[i] + otro.elementos[i];
        }
        return new Vector(resultado);
    }

    public Vector resta(Vector otro) {
        double[] resultado = new double[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            resultado[i] = this.elementos[i] - otro.elementos[i];
        }
        return new Vector(resultado);
    }

    public double productoPunto(Vector otro) {
        double suma = 0;
        for (int i = 0; i < elementos.length; i++) {
            suma += this.elementos[i] * otro.elementos[i];
        }
        return suma;
    }

    public Vector productoCruz(Vector otro) {
        if (elementos.length != 3 || otro.elementos.length != 3) {
            throw new IllegalArgumentException("Solo definido para R^3");
        }
        double[] r = new double[3];
        r[0] = elementos[1] * otro.elementos[2] - elementos[2] * otro.elementos[1];
        r[1] = elementos[2] * otro.elementos[0] - elementos[0] * otro.elementos[2];
        r[2] = elementos[0] * otro.elementos[1] - elementos[1] * otro.elementos[0];
        return new Vector(r);
    }

    public boolean esCero() {
        for (double v : elementos) {
            if (Math.abs(v) > 1e-9)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (double v : elementos) {
            sb.append(String.format("%.2f ", v));
        }
        return sb.append("]").toString();
    }
}
