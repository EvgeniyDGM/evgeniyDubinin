package homework4.professions;

public class Driver extends Person{

    private String name;
    private String experience;

    @Override
    public String toString() {
        return "Driver{" + "name='" + name + '\'' + ", experience='" + experience + '\'' + '}';
    }

    public Driver(String name, String experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
