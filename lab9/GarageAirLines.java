package lab9;
import java.util.ArrayList;
public class GarageAirLines {
    private ArrayList<Aircraft> masAircraft = new ArrayList<Aircraft>(); // massiv s letatelnimi apparatami
    public void addAircraft(Aircraft m){
        masAircraft.add(m);
    }
    public GarageAirLines(){
        
    }
    public Boolean findAircraft(Aircraft m){
        return masAircraft.contains(m);
    }
    public GarageAirLines(ArrayList<Aircraft> n){
        masAircraft=n;
    }

    public Aircraft udalenie(int index){
        return masAircraft.remove(index);
    }
    public void printGarage(){
        System.out.println("В гараже: ");
        for (Aircraft a:masAircraft){
            System.out.println("\t"+a.toString());
        }
    }
    public void numOfAircrafts(){
        for (Aircraft a:masAircraft){
            if (a instanceof Helicopter){
                int k=1;
                System.out.println("В вашем гараже вертолет");
            }

            if (a instanceof Plane){
                int j=1;
                System.out.println("В вашем гараже самолет");
                j++;
            }
        }
    }

}
