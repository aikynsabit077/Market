public class Person {
    protected String name;
    protected int age;
    protected int salary;

    public Person(String name, int age, int salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }
    public void work() {
        System.out.println("Person is working");
    }
}
