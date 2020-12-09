public class ex2analog {
    public static void main(String[] args) {
        int[]massive=new int[8];
        for(int i=0;i<massive.length;i++) {
            massive[i]=i*3;
            }

        for(int j=0;j<massive.length;j++){
            System.out.println();
        }
        System.out.println("Введенный вами массив => ");
        System.out.print("[");
        for(int j=0;j<massive.length;j++){
            System.out.print(massive[j]+",");
        }
        System.out.println("]");
    }
}
