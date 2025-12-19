package s05_state_pattern;

public interface State {

    // 코인 넣는 행위
    public void insertQuarter();

    // 코인 반환 행위
    public void ejectQuarter();

    // 손잡이 돌리기
    public void turnCrank();

    // 알맹이 내보내기
    public void dispense();
}
