
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Ana");
        person1.setAge(25);
        person1.setEmail("ana@example.com");
        person1.setGender("Female");
        person1.setHeight(1.65);




        Person person2 = new Person("Giorgi", 30, "giorgi@example.com", "Male", 1.80);
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Email: " + person1.getEmail());
        System.out.println("Gender: " + person1.getGender());
        System.out.println("Height: " + person1.getHeight());

        System.out.println("\nPerson 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Email: " + person2.getEmail());
        System.out.println("Gender: " + person2.getGender());
        System.out.println("Height: " + person2.getHeight());


    }          

}
