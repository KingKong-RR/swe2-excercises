package ch.juventus.object;

public class Address {

    private String street;
    private int number;
    private int zip;
    private String city;

    @Override
    public String toString() {
        return String.format("Address{street=%s, number=%s, zip=%d, city=%s}", street, number, zip, city);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}