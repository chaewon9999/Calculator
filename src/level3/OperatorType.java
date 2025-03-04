package level3;

public enum OperatorType {
    ADD('+'), SUB('-'), MUL('*'), DIV('/');

    private final char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }
}
