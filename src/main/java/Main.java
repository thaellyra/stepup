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
        bubbleSort(intList1);
        System.out.println(intList1);

        System.out.println("====================");

        int[] intList2 = new int[n];
        for (int i = 0; i < n; i++) {
            intList2[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(intList2));
        bubbleSort(intList2);
        System.out.println(Arrays.toString(intList2));
    }

    public static void bubbleSort(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
    }

    public static void bubbleSort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int tmp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tmp;
                }
            }
        }
    }
}
