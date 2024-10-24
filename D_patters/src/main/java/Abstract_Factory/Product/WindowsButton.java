package Abstract_Factory.Product;

import Abstract_Factory.Product.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}