public class seller {
    private String name;
    private int age;
    private String gender;
    private int salary;
    private boolean active;

    public seller(String name, int age, String gender, int salary, boolean active) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.active = active;
        System.out.println(getInfo());
    }
    public int getSalary() {
        return salary;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public void increaseSalary(int amount) {
        salary += amount;
    }
    public boolean isAdult() {
        return age >= 18;
    }
    public String getInfo() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Salary: " + salary + " tg" + ", Active: " + active;
    }
}