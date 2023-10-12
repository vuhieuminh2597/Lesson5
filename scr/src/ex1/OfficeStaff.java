package ex1;

public class OfficeStaff extends Employee {

    String startDate;
    String duty;

    public OfficeStaff(String id, String address, String birthDay, String phoneNumber) {
        super(id, address, birthDay, phoneNumber);
    }

    public OfficeStaff(String id, String address, String birthDay, String phoneNumber, String id1, String name,
                       String experienci, float salary) {
        super(id, address, birthDay, phoneNumber, id1, name, experienci, salary);
    }

    public OfficeStaff(String id, String address, String birthDay, String phoneNumber, String startDate, String duty) {
        super(id, address, birthDay, phoneNumber);
        this.startDate = startDate;
        this.duty = duty;
    }

    public OfficeStaff(String id, String address, String birthDay, String phoneNumber, String id1, String name,
                       String experienci, float salary, String startDate, String duty) {
        super(id, address, birthDay, phoneNumber, id1, name, experienci, salary);
        this.startDate = startDate;
        this.duty = duty;
    }

    @Override
    public void meeting() {
        super.meeting();
        System.out.println(super.name + " đang tổ chức một cuộc họp khẩn cấp");
    }

    @Override
    public String toString() {
        return "OfficeStaff{" +
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
