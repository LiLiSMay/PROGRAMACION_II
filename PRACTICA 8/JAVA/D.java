public class D {
    A a;
    B b;

    public D(int x, int y, int z) {
        a = new A(x, z);
        b = new B(y, z);
    }

    public void incrementaXYZ() {
        a.x++;
        b.y++;
        a.z++;
        b.z++;
    }

    public String toString() {
        return "D => " + a.toString() + " | " + b.toString();
    }

}
