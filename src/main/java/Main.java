import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        int n = 20;

        for (int i = 1; i <= n; i++) {
            intList.add(i);
        }
        System.out.println(intList);

        int tmp = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (i % 2 == 1) {
                intList.set(i - 1, intList.get(i));
                intList.set(i, tmp);
            } else {
                tmp = intList.get(i);
            }
        }
        System.out.println(intList);
    }
}
