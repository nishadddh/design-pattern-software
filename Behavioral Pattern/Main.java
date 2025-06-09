public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer o1 = new ConcreteObserver("A", subject);
        Observer o2 = new ConcreteObserver("B", subject);

        subject.setState(1);
        subject.setState(2);
    }
}
