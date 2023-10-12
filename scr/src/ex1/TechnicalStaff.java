package ex1;

public class TechnicalStaff extends Employee {
    String startDate;
    String duty;
    String skill;

    public TechnicalStaff(String id, String address, String birthDay, String phoneNumber) {
        super(id, address, birthDay, phoneNumber);
    }

    public TechnicalStaff(String id, String address, String birthDay, String phoneNumber, String id1, String name,
                          String experienci, float salary) {
        super(id, address, birthDay, phoneNumber, id1, name, experienci, salary);
    }

    public TechnicalStaff(String id, String address, String birthDay, String phoneNumber, String startDate,
                          String duty, String skill) {
        super(id, address, birthDay, phoneNumber);
        this.startDate = startDate;
        this.duty = duty;
        this.skill = skill;
    }

    public TechnicalStaff(String id, String address, String birthDay, String phoneNumber, String id1, String name,
                          String experienci, float salary, String startDate, String duty, String skill) {
        super(id, address, birthDay, phoneNumber, id1, name, experienci, salary);
        this.startDate = startDate;
        this.duty = duty;
        this.skill = skill;
    }

    @Override
    public void dedign() {
        super.dedign();
        System.out.println(super.name + " đang thiết kế một con ốc vít.");
    }

    @Override
    public void repair() {
        super.repair();
        System.out.println(super.name + " đang sửa chữa khuôn mẫu.");
    }

    @Override
    public String toString() {
        return "TechnicalStaff{" +
                "startDate='" + startDate + '\'' +
                ", duty='" + duty + '\'' +
                ", skill='" + skill + '\'' +
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
