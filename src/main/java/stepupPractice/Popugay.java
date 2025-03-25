package stepupPractice;

public class Popugay extends Bird {
    private final String song;

    public Popugay(String song) {
        this.song = song;
    }

    @Override
    public void sing() {
        char[] songChar = song.toCharArray();
        String result = "";
        for (int i = 0; i < (int) (Math.random() * songChar.length) + 1; i++) {
            result += songChar[i];
        }
        System.out.println(result);
    }
}
