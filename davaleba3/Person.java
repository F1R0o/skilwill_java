package davaleba3;

public class Person{
    private String name;
    private int age;
    private String email;
    private String gender;
    private double height;


    public Person(){}


    public Person(String name, int age, String email, String gender, double height) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.height = height;
    }



     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}