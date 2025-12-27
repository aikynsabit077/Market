public class market {
    private String marketName;
    private String ownerName;
    private String address;
    private int foundedYear;

    public market(String marketName, String ownerName, String address, int foundedYear) {
        this.marketName = marketName;
        this.ownerName = ownerName;
        this.address = address;
        this.foundedYear = foundedYear;
    }
    public int getMarketAge() {
        return 2025 - foundedYear;
    }
    public String getFullInfo() {
        return "Market name: " + marketName + ", Owner: " + ownerName + ", Address: " + address + ", Founded: " + foundedYear;
    }
}
