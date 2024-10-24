package Abstract_Factory.Factories;

import Abstract_Factory.Product.Button;
import Abstract_Factory.Product.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
