public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        redCircle.draw();

        Shape greenCircle = new Circle(new GreenColor());
        greenCircle.draw();
    }
}
