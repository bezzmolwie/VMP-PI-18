import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число=> ");
        int a = sc.nextInt();
        System.out.println("Введите второе число=> ");
        int b = sc.nextInt();
        System.out.println(numbers.summa(a,b));
    }
}
class numbers{
    static boolean summa(int n1,int n2){
        int sum;
        boolean t=true;
        boolean f=false;
        sum=n1+n2;
        if (sum<=20 & sum>=10){
            return t;
        }else {
            return f;
        }
    }
}
