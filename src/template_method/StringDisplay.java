package template_method;

public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        for(int i = 0;i<width;i++) {
            sb.append("-");
        }
        sb.append("+");
        System.out.println(sb.toString());
    }
}
