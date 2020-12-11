import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []massive= new int[8];
        for(int i=0;i<massive.length;i++){
            System.out.println("Введите "+i+" элемент массива=> ");
            massive[i]=sc.nextInt();
        }
        System.out.println("Введенный вами массив => ");
        System.out.print("[");
        for(int j=0;j<massive.length;j++){
            System.out.print(massive[j]+",");
        }
        System.out.println("]");
    }
}
