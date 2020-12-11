package lab11;

public class Triangle {
    public double a,b,c;
    public Triangle(double aa,double bb,double cc){
        a=aa;
        b=bb;
        c=cc;
    }
    public void showInfo(){
        System.out.println("Длины сторон треугольника:");
        System.out.println("A="+a+"\n"+"B="+b+"\n"+"C="+c);
    }
    public double perimetrTriangle(){
        double Perimetr=a+b+c;
        return Perimetr;
    }
    public double squareTriangle(){
        double p = ((a+b+c)/2);
        double xxx = (p*(p-a)*(p-b)*(p-c));
        double square = Math.sqrt(xxx);
        return square;
    }
    public void showPerimetr(){
        System.out.println("Периметр треугольника равен => "+perimetrTriangle());
    }
    public void showSquare(){
        System.out.println("Площадь треугольника равна => "+squareTriangle());
    }
}
