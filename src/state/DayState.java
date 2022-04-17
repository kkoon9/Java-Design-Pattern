package state;

public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState() {

    }

    public static State getInstance() {
        return singleton;
    }

    /**
     * hour 야간이면 야간의 상태로 시스템을 이행한다.
     * 여기에서 상태전환이 발생한다.
     *
     * @param context
     * @param hour
     */
    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용 (주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨 (주간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반통화 (주간)");
    }

    public String toString() {
        return "[주간]";
    }
}
