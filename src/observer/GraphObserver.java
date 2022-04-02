package observer;

public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver:");
        int count = generator.getNumber();
        for(int i = 0;i<count;i++) {
            System.out.print('*');
        }
        System.out.println();
        try {
            // 표시되는 모습을 잘 알 수 있도록 Tread.sleep 사용
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
