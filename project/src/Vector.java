public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public double getHumberOne(){
        double sumOne = Math.sqrt((x * x) + (y * y) + (z * z));
        return sumOne;
     }
    public double getHumberTwo(Vector v){
        double sumTwo = this.x * v.x + this.y * v.y + this.z * v.z;
        return sumTwo;
    }
    public Vector getHumberThree(Vector vector){
        double v1 = y * vector.z - z * vector.y;
        double v2 = z * vector.x - x * vector.z;
        double v3 = x * vector.y - y * vector.x;
        return new Vector(v1, v2, v3);
    }
    public double getHumberFour(){
        double sumFour = Math.sqrt(x * x + y * y);
        return sumFour;
    }
}
