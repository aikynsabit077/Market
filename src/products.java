public class products {
    protected int productId;
    protected String productName;
    protected int productPrice;
    protected String category;
    protected boolean available;

    public products(int productId, String productName, int productPrice, String category, boolean available) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
        this.available = available;
    }
    public void applyDiscount(int percent) {
        productPrice -= productPrice * percent / 100;
    }
    public boolean isExpensive() {
        return productPrice > 1000;
    }
    public void showInfo() {
        System.out.println(getInfo());
    }
    public String getType() {
        return "General product";
    }
    public String getInfo() {
        return "ID: " + productId + ", Name: " + productName + ", Price: " + productPrice + " tg" + ", Category: " + category + ", Available: " + available;
    }
}

