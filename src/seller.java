public class seller {
    public String seller_name;
    public String seller_gender;
    public int seller_age;
    public int seller_salary;

    public seller(String seller_name,int seller_age,String seller_gender,int seller_salary){
        setValues(seller_name,seller_age,seller_gender,seller_salary);
        System.out.println(getValues());
    }

    public void setValues(String seller_name,int seller_age,String seller_gender,int seller_salary){
        this.seller_name = seller_name;
        this.seller_age = seller_age;
        this.seller_gender = seller_gender;
        this.seller_salary = seller_salary;
    }
    public String getValues() {
        return "name: " + seller_name + ", age: " + seller_age + ", salary: " + seller_salary + "tg";
    }



}
