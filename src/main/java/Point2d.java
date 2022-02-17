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

    public boolean equals(Object obj){
        if (this == obj) //Сравнение ссылок
            return true;

        if (obj == null) //Переданный объект - null
            return false;

        if (!(obj instanceof Point2d)) //Если переданный объект не типа Point2d
            return false;

        Point2d point2d = (Point2d) obj; //Операция приведения типа
        return (this.xCoord == point2d.xCoord && this.yCoord == point2d.yCoord);
    }
}
