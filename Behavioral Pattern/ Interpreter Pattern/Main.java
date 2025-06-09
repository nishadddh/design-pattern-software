public class Main {
    public static void main(String[] args) {
        Expression e1 = new NumberExpression(5);
        Expression e2 = new NumberExpression(3);

        Expression add = new AddExpression(e1, e2);
        Expression subtract = new SubtractExpression(e1, e2);

        System.out.println("5 + 3 = " + add.interpret());
        System.out.println("5 - 3 = " + subtract.interpret());
    }
}
