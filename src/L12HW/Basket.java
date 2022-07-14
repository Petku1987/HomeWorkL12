package L12HW;

public class Basket {
    String[] selProduct;

    public Basket(String[] selProduct) {
        this.selProduct = selProduct;
    }

    void showProducts() {
        for (int i = 0; i < selProduct.length; i++)
            System.out.println("List of selected products: " + selProduct[i]);
    }

        }
