public class Address {
    private String streetNumber;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String streetAndNumber, String street, String city, String state, String zip) {
        this.streetNumber = streetAndNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    @Override
    public String toString() {
        return streetNumber + " " + street + "\n" + city + ", " + state + " " + zip;
    }
    
}
