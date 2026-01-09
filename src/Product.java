public class Product {
    protected int id;
    protected String name;
    protected int price;
    protected boolean available;

    public Product(int id, String name, int price, boolean available) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public void applyDiscount(int percent) {
        price -= price * percent / 100;
    }

    public boolean isExpensive() {
        return price > 1000;
    }

    public String getType() {
        return "Product";
    }

    public void showInfo() {
        System.out.println(name + " | Price: " + price + " tg");
    }
}
