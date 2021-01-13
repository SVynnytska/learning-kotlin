package intro;

import static intro.Util.displaySeparator;
import static intro.Util.max;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        max(1, 2);

        displaySeparator();
        displaySeparator('#');
        displaySeparator('#', 6);

        ColorKt.getDescription(Color.RED);
        ColorKt.getDescription(Color.GREEN);

        ColorKt.mix(Color.RED, Color.BLUE);

        try {
            ExceptionKt.bar();
        } catch (IOException e) {

        }

        ExtentionKt.lastChar("123");
        ExtentionKt.repeat("123", 4);

    }
}
