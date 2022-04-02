package mediator;

public interface Mediator {
    /**
     * Mediator가 관리하는 회원을 생성하는 메서드
     */
    void createColleagues();

    /**
     * 중개인에 대한 '상담'에 해당하는 메서드
     */
    void colleagueChanged();
}
