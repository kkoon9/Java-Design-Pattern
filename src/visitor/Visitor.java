package visitor;

public abstract class Visitor {
    /**
     * File을 방문했을 때 호출된다.
     *
     * @param file
     */
    public abstract void visit(File file);

    /**
     * Directory을 방문했을 때 호출된다.
     *
     * @param directory
     */
    public abstract void visit(Directory directory);

}
