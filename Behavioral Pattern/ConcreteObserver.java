public class ConcreteObserver implements Observer {
    private String name;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println("Observer " + name + " notified. State is now: " + subject.getState());
    }
}
