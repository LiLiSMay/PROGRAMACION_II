public class B {
    int y;
    int z;

    public B(int y, int z) {
        this.y = y;
        this.z = z;
    }

    public void incrementaYZ() {
        y++;
        z++;
    }

    public void incrementaZ() {
        z++;
    }

    public String toString() {
        return "B => y: " + y + ", z: " + z;
    }

}
