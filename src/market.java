public class market {
    public String market_name;
    public String market_adress;
    public String market_owner;

    public market(String market_name,String market_owner,String market_adress){
        setValues(market_name,market_owner,market_adress);
        System.out.println(getValues());
    }
    public void setValues(String market_name,String market_owner,String market_adress){
        this.market_name = market_name;
        this.market_adress = market_adress;
        this.market_owner = market_owner;
    }
    public String getValues(){
        return "Name of Market: "  + market_name + ", Owner of Market: " + market_owner + ", Adress of Market: " + market_adress ;}

}
