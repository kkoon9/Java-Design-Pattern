package visitor;


import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentdir = "";

    /**
     * File 클래스의 인스턴스에 대해서 실행해야 할 처리한다.
     *
     * @param file
     */
    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    /**
     * Directory 클래스의 인스턴스에 대해서 실행해야 할 처리한다.
     *
     * @param directory
     */
    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while(it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
