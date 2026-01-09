public class FoodProduct extends products {
    private boolean frozen;

    public FoodProduct(int productId, String productName, int productPrice, String category, boolean available, boolean frozen) {
        super(productId, productName, productPrice, category, available); // super()
        this.frozen = frozen;
    }
    @Override
    public void showInfo() {
        System.out.println("Food product: " + productName + ", Price: " + productPrice + " tg, Frozen: " + frozen);
    }
    @Override
    public String getType() {
        return "Food";
    }
    public boolean isFrozen() {
        return frozen;
    }
}

