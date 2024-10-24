package Abstract_Factory.Factories;

import Abstract_Factory.Product.Button;
import Abstract_Factory.Product.Checkbox;
import Abstract_Factory.Product.WindowsButton;
import Abstract_Factory.Product.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
