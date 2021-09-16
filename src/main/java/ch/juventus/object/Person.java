package ch.juventus.object;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;
    private int age;
    private boolean hasPet;

    @Override
    public String toString() {
        return String.format("Person{firstName=%s, lastName=%s, address=%s, age=%d, pet=%b}", firstName, lastName, address.toString(), age, hasPet);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasPet() {
        return hasPet;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }

}