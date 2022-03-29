package visitor;

/**
 * 방문자를 받아들이는 인터페이스
 */
public interface Element {
    void accept(Visitor v);
}
