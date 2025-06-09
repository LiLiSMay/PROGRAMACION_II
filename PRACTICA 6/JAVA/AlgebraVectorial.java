public class AlgebraVectorial {
    private Vector a, b;

    public AlgebraVectorial(Vector a, Vector b) {
        this.a = a;
        this.b = b;
    }

    // a)
    public boolean esPerpendicularSumaModulos() {
        return Math.abs(a.suma(b).norma() - a.resta(b).norma()) < 1e-6;
    }

    // b)
    public boolean esPerpendicularMutua() {
        return Math.abs(a.resta(b).norma() - b.resta(a).norma()) < 1e-6;
    }

    // c)
    public boolean esPerpendicularProductoPunto() {
        return Math.abs(a.productoPunto(b)) < 1e-6;
    }

    // d)
    public boolean esPerpendicularSumaCuadrados() {
        double normaSuma2 = Math.pow(a.suma(b).norma(), 2);
        double normaA2 = Math.pow(a.norma(), 2);
        double normaB2 = Math.pow(b.norma(), 2);
        return Math.abs(normaSuma2 - (normaA2 + normaB2)) < 1e-6;
    }

    // e)
    public boolean esParalelaEscalar() {
        double[] va = a.getElementos();
        double[] vb = b.getElementos();
        Double r = null;
        for (int i = 0; i < va.length; i++) {
            if (Math.abs(vb[i]) < 1e-6 && Math.abs(va[i]) < 1e-6)
                continue;
            if (Math.abs(vb[i]) < 1e-6)
                return false;
            double ratio = va[i] / vb[i];
            if (r == null)
                r = ratio;
            else if (Math.abs(r - ratio) > 1e-6)
                return false;
        }
        return true;
    }

    // f)
    public boolean esParalelaCruz() {
        try {
            return a.productoCruz(b).esCero();
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    // g)
    public Vector proyeccionASobreB() {
        double escalar = a.productoPunto(b) / Math.pow(b.norma(), 2);
        double[] vb = b.getElementos();
        double[] res = new double[vb.length];
        for (int i = 0; i < vb.length; i++) {
            res[i] = escalar * vb[i];
        }
        return new Vector(res);
    }

    // h)
    public double componenteAenB() {
        return a.productoPunto(b) / b.norma();
    }
}
