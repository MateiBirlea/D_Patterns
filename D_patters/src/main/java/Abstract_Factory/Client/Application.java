package Abstract_Factory.Client;

import Abstract_Factory.Factories.GUIFactory;
import Abstract_Factory.Product.Button;
import Abstract_Factory.Product.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
