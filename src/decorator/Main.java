package decorator;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello World");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);

        System.out.println("=============b1 show=============");
        b1.show();
        System.out.println("=============b2 show=============");
        b2.show();
        System.out.println("=============b3 show=============");
        b3.show();
        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("안녕하세요")
                                                ),
                                                '*'
                                        )

                                )
                        ),
                        '/'
                );

        System.out.println("=============b4 show=============");
        b4.show();

    }
}
