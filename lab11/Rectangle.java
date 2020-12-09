package lab11;

public class Rectangle {
    public double a,b;
    public Rectangle (double aa, double bb){
        a=aa;
        b=bb;
    }
    public void showInfo(){
        System.out.println("Длины сторон прямоугольника:");
        System.out.println("A="+a+"\n"+"B="+b);
    }
    public double perimetrRectangle(){
        double perimetr = 2*(a+b);
        return perimetr;
    }
    public double squareRectangle(){
        double square = a*b;
        return square;
    }
    public void showPerimetr(){
        System.out.println("Периметр прямоугольника равен => "+perimetrRectangle());
    }
    public void showSquare(){
        System.out.println("Площадь прямоугольника равна => "+squareRectangle());
    }
}
