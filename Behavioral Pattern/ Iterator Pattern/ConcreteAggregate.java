public class ConcreteAggregate implements Aggregate<String> {
    private String[] items = {"A", "B", "C", "D"};

    public Iterator<String> createIterator() {
        return new ConcreteIterator(items);
    }
}
