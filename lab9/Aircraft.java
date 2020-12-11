package lab9;

public class Aircraft {
    private String firm,gosnomer,model;
    private int maxSpeed;

    public void setFirm(String firma){
        firm=firma;
    }
    public void setGosnomer(String gosnom){gosnomer=gosnom;}
    public void setMaxSpeed(int speed) {
        maxSpeed=speed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getFirm() {
        return firm;
    }
    public String getGosnomer(){ return gosnomer;}
    public void setModel(String model1){ model=model1;}
    public String getModel(){ return model; }
    public Aircraft(){
        firm="Без названия";
        maxSpeed=0;
    }
    public Aircraft(String firma, int speed,String gosnom){
        firm=firma;
        maxSpeed=speed;
        gosnomer=gosnom;
    }
}
