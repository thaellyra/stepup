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

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}