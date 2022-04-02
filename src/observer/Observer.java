package observer;

public interface Observer {
    /**
     * 수를 생성하는 NumberGenerator 클래스에서 호출된다.
     * '나의 내용이 갱신으니 표시 쪽도 갱신해줘' 라는 내용을 Observer에게 전달하기 위한 메서드
     *
     * @param generator
     */
    void update(NumberGenerator generator);
}
