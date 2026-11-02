import java.util.Random;

public class FortuneTeller {
    public static void main(String[] args) {
        String[] fortunes = {
            "You will debug a tricky error today.",
            "A great idea is about to strike you.",
            "Your code will compile on the first try... eventually.",
            "Someone will ask you for help with Java soon.",
            "Today is a good day to learn something new."
        };

        Random random = new Random();
        int index = random.nextInt(fortunes.length);

        System.out.println("🔮 Your fortune: " + fortunes[index]);
    }
}