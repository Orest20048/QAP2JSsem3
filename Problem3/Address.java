package Problem3;

// Address.java
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructor
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // toString method
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}
