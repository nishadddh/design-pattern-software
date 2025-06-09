public class ConcreteIterator implements Iterator<String> {
    private String[] items;
    private int index = 0;

    public ConcreteIterator(String[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return index < items.length;
    }

    public String next() {
        return items[index++];
    }
}
