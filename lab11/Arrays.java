package lab11;

import java.util.Scanner;

public class Arrays {
    public int [] intArray;
    public int n;

    public Arrays(int chislo){
        n=chislo;
        intArray = new int[n];
    }
    public void setArray (){
        Scanner sc =new Scanner(System.in);
        for (int i=0;i< n;i++){
            System.out.println("Введите "+(i+1)+" элемент массива => ");
            intArray[i]=sc.nextInt();
        }
    }
    public void showArray(){
        System.out.print("Введенный Вами массив =[");
        for (int i=0;i<n;i++){
            System.out.print(intArray[i]+",");
        }
        System.out.println("]");
    }
    public void massSort(){
        for (int j = 0; j<intArray.length; j++) {
            for (int k = 0; k < intArray.length; k++){
                if (intArray[j] < intArray[k]) {
                    int buffer = intArray[j];
                    intArray[j] = intArray[k];
                    intArray[k] = buffer;
                }
            }
        }
    }
}

