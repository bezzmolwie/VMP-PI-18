package lab9;

import java.util.Scanner;

public class Airlines {
    public static void main(String[] args) {
        GarageAirLines myGarage = new GarageAirLines();
        Scanner sc = new Scanner(System.in);
        Helicopter myHelicopter1=new Helicopter();
        myHelicopter1.setAllInfo();
        System.out.println("Первый вертолет : "+myHelicopter1.toString());
        myGarage.addAircraft(myHelicopter1);
        System.out.println("Хотите добавить еще вертолет?(y/n) => ");
        String otvet = sc.nextLine();
        if (otvet.equals("y")){
            Helicopter myHelicopter2 = new Helicopter();
            myHelicopter2.setAllInfo();
            myGarage.addAircraft(myHelicopter2);
        }
        sc.nextLine();
        Plane myPlane1=new Plane();
        myPlane1.setAllInfo();
        System.out.println(myPlane1.toString());
        myGarage.addAircraft(myPlane1);
        System.out.println("Хотите добавить еще самолет?(y/n) => ");
        otvet = sc.nextLine();
        if (otvet.equals("y")){
            Plane myPlane2 = new Plane();
            myPlane2.setAllInfo();
            myGarage.addAircraft(myPlane2);
        }
        myGarage.printGarage();
        myGarage.numOfAircrafts();
        System.out.println("Какой летательный апарат вы хотите удалить?=>");
        int k =sc.nextInt();
        if (k==1){
            myGarage.udalenie(0);
        }
        if (k==2){
            myGarage.udalenie(1);
        }
        if (k==3){
            myGarage.udalenie(2);
        }
        if (k==4){
            myGarage.udalenie(3);
        }
        myGarage.numOfAircrafts();
    }
}
