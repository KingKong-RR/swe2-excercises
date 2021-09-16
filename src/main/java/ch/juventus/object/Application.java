package ch.juventus.object;

public class Application {
    public static void main(String[] args) {

        Address address = new Address();
        address.setStreet("Preyenstrasse");
        address.setNumber(5);
        address.setZip(8623);
        address.setCity("Wetzikon ZH");

        Address address1 = new Address();
        address1.setStreet("Preyenstrasse");
        address1.setNumber(5);
        address1.setZip(8623);
        address1.setCity("Wetzikon ZH");

        Person person = new Person();
        person.setFirstName("Rexhep");
        person.setLastName("Rexhepi");
        person.setAddress(address);
        person.setAge(30);
        person.setHasPet(true);

        Person person1 = new Person();
        person1.setFirstName("Rexhep");
        person1.setLastName("Rexhepi");
        person1.setAddress(address1);
        person1.setAge(30);
        person1.setHasPet(true);


        System.out.println(person.equals(person1));
    }
}