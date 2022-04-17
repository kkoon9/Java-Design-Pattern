package state;

/**
 * 금고의 상태를 나타낸다.
 * Context는 상태의 관리를 수행하고 있는 인터페이스로 Context에서 자세히 설명한다.
 */
public interface State {
    void doClock(Context context, int hour); // 시간 설정

    void doUse(Context context); // 금고 사용

    void doAlarm(Context context); // 비상벨

    void doPhone(Context context); // 일반통화
}
