import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList1 = new ArrayList<>();
        int n = 20;

        for (int i = 1; i <= n; i++) {
            intList1.add((int) (Math.random() * 100));
        }
        System.out.println(intList1);
        reverse(intList1);
        System.out.println(intList1);

        System.out.println("====================");

        int[] intList2 = new int[n];
        for (int i = 0; i < n; i++) {
            intList2[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(intList2));
        reverse(intList2);
        System.out.println(Arrays.toString(intList2));
    }

    public static void reverse(int[] intArray) {
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
    }

    public static void reverse(ArrayList<Integer> intArray) {
        int n = intArray.size() - 1;
        for (int i = 0; i < intArray.size() / 2; i++) {
            int temp = intArray.get(i);
            intArray.set(i, intArray.get(n - i));
            intArray.set(n - i, temp);
        }
    }
}
