package Valeriya_Task;

public enum Position {
    DEVELOPER(0),
    LEAD(2),
    MANAGER(5);

    private int value;

    Position(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Position{" + "title='" + value + '\'' + '}';
    }
}
