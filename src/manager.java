public class manager extends Person {

    public manager(String name, int age, int salary) {
        super(name, age, salary);
    }
    @Override
    public void work() {
        System.out.println("Manager manages the market");
    }
}
