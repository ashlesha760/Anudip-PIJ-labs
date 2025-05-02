//lab 2: assignment 3

public class Student2{

    // Attributes
    private String name;
    private int age;
    private String department;

    // Constructor
    public Student2(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
