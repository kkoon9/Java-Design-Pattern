package memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsName = {
            "사과", "포도", "바나나", "귤"
    };
    private final String SWEET = "맛있는 ";

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("소지금이 증가했습니다.");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("소지금이 절반이 되었습니다.");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("과일(" + f + ")을 받았습니다.");
            fruits.add(f);
        } else {
            System.out.println("변한 것이 없습니다.");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String f = it.next();
            if (f.startsWith(SWEET)) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruit() {
        StringBuilder sb = new StringBuilder();
        if (random.nextBoolean()) {
            sb.append(SWEET);
        }
        sb.append(fruitsName[random.nextInt(fruitsName.length)]);
        return sb.toString();
    }
}
