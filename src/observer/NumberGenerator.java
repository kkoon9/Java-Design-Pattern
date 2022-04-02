package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Observer 전원에 대해서 '나의 내용이 갱신되었으므로, 당신의 표시를 갱신해라' 라고 전하는 메서드
     *
     */
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer o = it.next();
            o.update(this);
        }
    }

    abstract int getNumber();

    abstract void execute();

}
