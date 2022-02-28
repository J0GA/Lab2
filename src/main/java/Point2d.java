public class Point2d {
    private double xCoord;
    private double yCoord;

    public Point2d(double x, double y) { //Конструктор инициализации
        xCoord = x;
        yCoord = y;
    }

    public Point2d(){ //Конструктор по умолчанию
        this(0,0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

    public boolean equalsTo(Point2d obj){
        return (this.xCoord == obj.xCoord && this.yCoord == obj.yCoord);
    }
}
