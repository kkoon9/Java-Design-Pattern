package mediator;

public interface Colleague {
    /**
     * 중개인임을 확인해두는 메서드
     *
     * @param mediator
     */
    void setMediator(Mediator mediator);

    /**
     * 중개인이 내리는 '지시'에 해당하는 메서드
     * 자신의 상태를 스스로 판단하는 것이 아닌 중개인의 판단에 맡긴다.
     *
     * @param enabled true이면 '유효상태', false이면 '무효상태'
     */
    void setColleagueEnabled(boolean enabled);
}
