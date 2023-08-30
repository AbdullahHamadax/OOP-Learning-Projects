public class Person {
    private int age;
    private String name;
    private String email;

    public Person(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}