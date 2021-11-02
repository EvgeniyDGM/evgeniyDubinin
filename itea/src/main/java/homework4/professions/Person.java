package homework4.professions;

public class Person {
    private int age;

    private String fullName;

    public Person() {
    }

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

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }
}
