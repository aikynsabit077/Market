public class products {
    private int productId;
    private String productName;
    private int productPrice;
    private String category;
    private boolean available;

    public products(int productId, String productName, int productPrice, String category, boolean available) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
        this.available = available;
        System.out.println(getInfo());
    }
    public int getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    public void applyDiscount(int percent) {
        productPrice -= productPrice * percent / 100;
    }
    public boolean isExpensive() {
        return productPrice > 1000;
    }
    public String getInfo() {
        return "ID: " + productId + ", Name: " + productName + ", Price: " + productPrice + " tg" + ", Category: " + category + ", Available: " + available;
    }
}

