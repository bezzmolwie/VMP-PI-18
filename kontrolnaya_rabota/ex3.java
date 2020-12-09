public class ex3 {
    public static void main(String[] args) {
        int[]massive = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0;i<massive.length;i++){
            if (massive[i]<6){
                massive[i]=massive[i]*2;
            }
        }
        System.out.println("Введенный вами массив => ");
        System.out.print("[");
        for(int j=0;j<massive.length;j++){
            System.out.print(massive[j]+",");
        }
        System.out.println("]");
    }
}
