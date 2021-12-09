package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Category implements Component {

    private List<Component> components = new ArrayList<>();
    private String name;
    private int level;

    public Category(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        component.setLevel(this.level + 1);
        components.add(component);
    }

    @Override
    public String getTree() {
        StringBuilder tree = new StringBuilder(getName());
        for (Component component : components) {
            tree.append("\n");
            tree.append("\t".repeat(component.getLevel()))
                    .append(component.getTree());
        }
        return tree.toString();
    }

    public void deleteCategory(Component component) {
        components.remove(component);
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
