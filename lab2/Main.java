package lab2;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число => ");
        int n = sc.nextInt();
        dvoich(n);
        System.out.println("1");

    }
    private static int dvoich(int n){
        int cock;
        if (n<2)
            return 1;
        cock=n%2;
        n=n/2;
        System.out.print(cock);
        return dvoich(n);
    }
}
