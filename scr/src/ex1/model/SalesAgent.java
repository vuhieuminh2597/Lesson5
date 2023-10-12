package ex1.model;

import ex1.model.Employee;

public class SalesAgent extends Employee {
    String startDate;
    String duty;

    public SalesAgent(String id, String address, String birthDay, String phoneNumber) {
        super(id, address, birthDay, phoneNumber);
    }

    public SalesAgent(String id, String address, String birthDay, String phoneNumber, String id1, String name, String experienci, float salary) {
        super(id, address, birthDay, phoneNumber, id1, name, experienci, salary);
    }

    public SalesAgent(String id, String address, String birthDay, String phoneNumber, String startDate, String duty) {
        super(id, address, birthDay, phoneNumber);
        this.startDate = startDate;
        this.duty = duty;
    }

    public SalesAgent(String id, String address, String birthDay, String phoneNumber, String id1, String name, String experienci, float salary, String startDate, String duty) {
        super(id, address, birthDay, phoneNumber, id1, name, experienci, salary);
        this.startDate = startDate;
        this.duty = duty;
    }

    @Override
    public void trade() {
        super.trade();
        System.out.println(super.name + " đang thực hiện giao dịch với khách hàng.");
    }

    @Override
    public String toString() {
        return "SalesAgent{" +
                "startDate='" + startDate + '\'' +
                ", duty='" + duty + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", experienci='" + experienci + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", birthDay=" + birthDay +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
