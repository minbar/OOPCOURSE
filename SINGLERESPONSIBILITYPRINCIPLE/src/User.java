public class User {

    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        if (age < 18) {
            throw new Error();
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
