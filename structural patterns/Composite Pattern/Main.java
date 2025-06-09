public class Main {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Leaf A");
        Leaf leaf2 = new Leaf("Leaf B");

        Composite composite1 = new Composite("Composite X");
        composite1.add(leaf1);
        composite1.add(leaf2);

        Composite root = new Composite("Root Composite");
        root.add(composite1);
        root.showDetails();
    }
}
