package lab4;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args)throws Polojitel {
        int x=0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите размер массива => ");
            x = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException z){
            System.out.println("ОШИБКА! Введите число!");
            return;
        }
        byte [] array = new byte[x];
        for (int i=0;i<array.length;i++){
            try{
            System.out.println("Введите "+i+" элемент массива !!положительные числа(тип byte)!! => ");
            //array[i]=sc.nextByte();
                array[i]=Byte.parseByte(sc.nextLine());
                if (array[i]<0){
                    throw new Polojitel("ОШИБКА! Введите положительное число!");
                }
        }catch (IllegalArgumentException z){
                System.out.println("ОШИБКА! Введите положительное число типа byte(-128 до 127)!");
                return;
            }
        }
        int max = 0;
        int max_index=0;
        for(int j=0;j<array.length;j++){
            if (array[j]>max){
                max = array[j];
                max_index=j;
            }
        }
        System.out.print("[");
        for (int z=0;z<array.length;z++){
            System.out.print(array[z]+",");
        }
        System.out.println("]");
        System.out.println("Максимальное значение : "+max);
        System.out.println("Его индекс: "+max_index);
    }
}
