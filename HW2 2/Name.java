public class Name {
    private String firstName;
    private String lastName;

    public Name(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    @Override
    public String toString() {
        return lastName + " " + firstName;
    }
    
}
