package lab12;
import java.util.Arrays;
import java.util.Scanner;

public class lab12 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Benchmark.odinochniy();
        System.out.println("-------------------------");
        Benchmark.dvoinoi();

    }
}

class SecondThread extends Thread {
    SecondThread(String name) {
        super(name);
        start();
    }

    public float[] arr(float[] array, int number) {
        float[] output;
        output = array;
        int i = 0;
        while(i+1 < output.length) {
            output[i] = (float) (output[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + 1 / 2));
            i++;
        }
        return output;
    }
}

class Benchmark {
    static final int size = 10000000;
    static final int half = size/2;
    static float[] array = new float[size];

    public static void odinochniy() {
        long time = System.currentTimeMillis();
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        int i = 0;
        while(i+1 < arr.length) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + 1 / 2));
            i++;
        }
        array = arr;
        System.out.println("Потрачено миллисекунд:");
        System.out.println(System.currentTimeMillis() - time);
    }

    public static void dvoinoi() {
        long time = System.currentTimeMillis();
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        float[] a1 = new float[half];
        float[] a2 = new float[half];
        System.arraycopy(arr, 0, a1, 0, half);
        System.arraycopy(arr, half, a2, 0, half);
        int i = 0;
        while(i+1 < a1.length) {
            a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + 1 / 2));
            i++;
        }
        SecondThread second = new SecondThread("Dva");
        a2 = second.arr(a2, half);
        System.arraycopy(a1, 0, arr, 0, half);
        System.arraycopy(a2, 0, arr, half, half);
        System.out.println("Потрачено миллисекунд:");
        System.out.println(System.currentTimeMillis() - time);
    }
}

