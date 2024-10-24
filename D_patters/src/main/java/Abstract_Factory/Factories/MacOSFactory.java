package Abstract_Factory.Factories;

import Abstract_Factory.Product.Button;
import Abstract_Factory.Product.Checkbox;
import Abstract_Factory.Product.MacOSButton;
import Abstract_Factory.Product.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
