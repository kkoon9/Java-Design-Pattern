package chain_of_responsibility;

public abstract class Support {
    private String name; // 트러블 해결자의 이름
    private Support next; // 떠넘기는 곳

    public Support(String name) { // 트러블 해결자의 생성
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    /**
     * 하위 클래스에서 구현하는 추상 메서드.
     * 반환값이 true일 때에는 요구가 처리됐음을 나타내고
     * 반환값이 false일 때에는 아직 요구가 처리되지 않았음을 나타낸다. (다음으로 떠넘긴다.)
     *
     * @param trouble
     * @return
     */
    protected abstract boolean resolve(Trouble trouble);

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
