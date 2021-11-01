package homework4.professions;

public class Person extends Driver {
    private int age;

    public String fullName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", fullName='" + fullName + '\'' + '}';
    }
}
