package L12HW;

public class OnlineMag {

    public static void main(String[] args) {
        Category TV = new Category("    TV", new String []{"Samsung", "LG", "Panasonic"});
        Category Phones = new Category("Phones", new String []{"IPhone", "Samsung", "Xiaomi"});
        Category Fridge = new Category("Fridge", new String []{"Indesit", "Sharp", "Whirlpool"});

        System.out.println(TV.toString());
        System.out.println(Phones.toString());
        System.out.println(Fridge.toString());

        System.out.println();
        User X1 = new User ("userX", "user_pass", new String[]{"TV LG, Phones Xiaomi, Fridge Sharp"});
        X1.toString();
    }
}
