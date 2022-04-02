package observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    public Random random = new Random();
    private int number;

    @Override
    int getNumber() {
        return number;
    }

    @Override
    void execute() {
        for(int i = 0; i<20;i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
