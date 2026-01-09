public class DrinkProduct extends products {

    private int volume; // ml

    public DrinkProduct(int productId, String productName, int productPrice, String category, boolean available, int volume) {
        super(productId, productName, productPrice, category, available);
        this.volume = volume;
    }

    @Override
    public void showInfo() {
        System.out.println("Drink product: " + productName + ", Price: " + productPrice + " tg, Volume: " + volume + " ml");
    }

    @Override
    public String getType() {
        return "Drink";
    }

    public int getVolume() {
        return volume;
    }
}
