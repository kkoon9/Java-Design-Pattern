package observer;

public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            // 표시되는 모습을 잘 알 수 있도록 Tread.sleep 사용
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
