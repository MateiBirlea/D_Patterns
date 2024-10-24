package Abstract_Factory.Product;

import Abstract_Factory.Product.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
