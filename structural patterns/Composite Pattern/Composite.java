import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component c) {
        children.add(c);
    }

    public void showDetails() {
        System.out.println(name);
        for (Component c : children) {
            c.showDetails();
        }
    }
}
