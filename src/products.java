public class products {
    public int product_id;
    public int product_price;
    public String product_name;

    public products(int product_id,String product_name,int product_price){
        setValues(product_id,product_name,product_price);
        System.out.println(getValues());
    }
    public void setValues(int product_id,String product_name,int product_price){
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
    }
    public String getValues(){
        return "id: " + product_id + ", name: " + product_name + ", price: " + product_price + "tg";
    }
}
