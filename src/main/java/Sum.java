public class Sum {
    public static void main(String[] args) {
        double sum = 0;
        for (String s : args) {
            if (isNumber(s)) {
                sum += Double.parseDouble(s);
            }
        }
        System.out.println("результат: " + sum);
    }

    public static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}