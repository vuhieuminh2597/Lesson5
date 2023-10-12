package ex1;

public abstract class Person {
    public String id;//PassPort
    public String address;
    public String birthDay;

    public String phoneNumber;

    public Person(String id, String address, String birthDay, String phoneNumber) {
        this.id = id;
        this.address = address;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", birthDay=" + birthDay +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
