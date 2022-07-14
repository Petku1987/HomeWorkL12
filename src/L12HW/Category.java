package L12HW;

import java.util.Arrays;

public class Category {

    String name;
    String[] products;

    public Category(String name, String[] products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category " + name + ":" +
                "  brand " + Arrays.toString(products) ;
    }
}
