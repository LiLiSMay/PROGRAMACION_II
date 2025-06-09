public class A {
    int x;
    int z;

    public A(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public void incrementaXZ() {
        x++;
        z++;
    }

    public void incrementaZ() {
        z++;
    }

    public String toString() {
        return "A => x: " + x + ", z: " + z;
    }

}
