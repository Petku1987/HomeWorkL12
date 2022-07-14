package L12HW;

public class Phone {
    String model;
    double weight;
    String number;

    public Phone() {
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, String number, double weight) {
        this(model, number);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Model: " + model + "\t\t\t" +
                "Weight: " + weight + "\t\t\t" +
                "Number: " + number;
    }

    void receiveCall(String incomeName) {
        System.out.println("Income call from: " + incomeName);
    }

    void receiveCall(String incomeName, String incomeNumber) {
        System.out.println("Income call from: " + incomeName + " " + incomeNumber);
    }

    void getNumber(String incomeNumber) {
        System.out.println("Income call from number: " + incomeNumber);
    }

    void sendMessage(String...phoneNumber) {
        System.out.print("The message will be sent to this number(s): " );
        for (int i = 0; i < phoneNumber.length; i++) {
            System.out.print(phoneNumber[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Phone iphone = new Phone("iPhone XS", "068621625", 0.2);
        Phone samsung = new Phone("Samsung GX", "065587458", 0.3);
        Phone lg = new Phone("LG W41 Pro", "079645622", 0.2);
        Phone xiaomi = new Phone("12S Ultra", "078569254");


        System.out.println(iphone.toString());
        System.out.println(samsung.toString());
        System.out.println(lg.toString());
        System.out.println(xiaomi.toString());

        System.out.println();
        iphone.receiveCall("Alex");
        iphone.getNumber("061587452");
        System.out.println();
        iphone.receiveCall("Marry", "061582321");
        System.out.println();
        iphone.sendMessage("069478235", "078522144", "060123789");
    }
}
