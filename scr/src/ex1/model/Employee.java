package ex1.model;

import ex1.model.action.Actionable;

public abstract class Employee extends Person implements Actionable {
    public String id;//Employee code
    public String name;
    public String experienci;
    public float salary;

    public Employee(String id, String address, String birthDay, String phoneNumber) {
        super(id, address, birthDay, phoneNumber);
    }

    public Employee(String id, String address, String birthDay, String phoneNumber, String id1, String name, String experienci, float salary) {
        super(id, address, birthDay, phoneNumber);
        this.id = id1;
        this.name = name;
        this.experienci = experienci;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", experienci='" + experienci + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", birthDay=" + birthDay +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public void doWork() {

    }

    @Override
    public void repair() {

    }

    @Override
    public void design() {

    }

    @Override
    public void trade() {

    }

    @Override
    public void meeting() {

    }
}
