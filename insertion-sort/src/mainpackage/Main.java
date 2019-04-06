package mainpackage;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        int [] arr = {5, 2, 4, 6, 1, 3};
        Arrays.stream(arr).forEach(System.out::print);
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j -1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        System.out.println("\n");
        Arrays.stream(arr).forEach(System.out::print);
    }
}
