package composite;

public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    // 여기서는 예외를 던지지만 다른 add를 구현하는 곳에서 변형시킬 수 있다.
    public Entry add(Entry entry) throws FileTreatmentException {

        throw new FileTreatmentException();
    }

    // 오버로드
    public void printList() {
        printList(" ");
    }

    // 하위 클래스에서만 사용하도록 한다.
    protected abstract void printList(String prefix);

    // getName과 getSize는 추상 메서드지만 하위 클래스에서 이 두 메서드를 구현하며 toString을 호출한다. (Template Method 패턴)
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
