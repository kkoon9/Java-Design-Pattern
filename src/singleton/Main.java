package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();

        if(ob1 == ob2) {
            System.out.println("같은 인스턴스다.");
        } else {
            System.out.println("다른 인스턴스다.");
        }
        System.out.println("end.");
    }
}
