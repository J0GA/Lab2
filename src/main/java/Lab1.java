public class Lab1 {
    static public void main(String[] args){
        Point3d A = new Point3d(1.4,5.7,3.2);
        Point3d B = new Point3d();
        Point3d C = new Point3d(0.4,2.7,6.1);
        if(A.equalsTo(B) || B.equalsTo(C) || C.equalsTo(A)) {
            System.out.println("Одна из точек равна другой");
        }
        else{
            System.out.println("Площадь треугольника равна: " + computeArea(A, B, C));
        }
    }

    static public double computeArea(Point3d obj1, Point3d obj2, Point3d obj3) {
        double a = Point3d.distanceTo(obj1, obj2);
        double b = Point3d.distanceTo(obj2, obj3);
        double c = Point3d.distanceTo(obj1, obj3);
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        if((result*1000)%10 >= 5)
            result=Math.ceil(result*100)/100;
        else
            result = Math.floor(result*100)/100;
        return result;
    }
}
