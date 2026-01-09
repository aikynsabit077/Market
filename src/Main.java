import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("    LIST OF PRODUCTS");
        products p1 = new products(12, "Bread", 190, "Food", true);
        products p2 = new products(13, "Juice", 630, "Drink", true);
        products p3 = new products(14, "Meat", 2000, "Food", false);

        p3.applyDiscount(10);
        System.out.println("After discount: " + p3.getInfo());
        System.out.println("Is expensive: " + p3.isExpensive());

        System.out.println("    LIST OF SELLERS");
        seller s1 = new seller("Nurali", 18, "Male", 150000, true);
        seller s2 = new seller("Alisher", 24, "Male", 170000, true);

        s1.increaseSalary(20000);
        System.out.println("After salary increase: " + s1.getInfo());
        System.out.println("Is adult: " + s1.isAdult());

        System.out.println("    MARKET INFORMATION");
        market market = new market("Aqqu", "Aikyn", "Nakhmanovich 11", 2015);

        System.out.println(market.getFullInfo());
        System.out.println("Market age: " + market.getMarketAge());


        System.out.println("    POLYMORPHISM PRODUCTS LIST");

        ArrayList<products> productList = new ArrayList<>();

        productList.add(new FoodProduct(15, "Cheese", 1200, "Food", true, false));
        productList.add(new DrinkProduct(16, "Cola", 500, "Drink", true, 1000));
        productList.add(new FoodProduct(17, "Fish", 2300, "Food", false, true));

        for (products p : productList) {
            p.showInfo();
        }

        System.out.println("    FOOD PRODUCTS ONLY");

        for (products p : productList) {
            if (p instanceof FoodProduct) {
                FoodProduct food = (FoodProduct) p;
                food.showInfo();
            }
        }

    }
}