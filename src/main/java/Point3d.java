public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z){ //Конструктор инициализации
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d(){ //Конструктор по умолчанию
        this(0.0,0.0,0.0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public boolean equalsTo(Point3d obj){
        return (this.xCoord == obj.xCoord && this.yCoord == obj.yCoord && this.zCoord == obj.zCoord);
    }

    public static double distanceTo(Point3d obj1, Point3d obj2){
        double result = Math.sqrt(Math.pow(obj2.getX()-obj1.getX(), 2) + Math.pow(obj2.getY()-obj1.getY(), 2) + Math.pow(obj2.getZ()-obj1.getZ(),2));
        if((result*1000)%10 >= 5)
            result=Math.ceil(result*100)/100;
        else
            result = Math.floor(result*100)/100;
        return result;
    }
}
