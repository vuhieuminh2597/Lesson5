package ex1;

import ex1.model.Employee;
import ex1.model.OfficeStaff;
import ex1.model.SalesAgent;
import ex1.model.TechnicalStaff;

public class Main {

    public static void main(String[] args) {
        OfficeStaff officeStaff =
                new OfficeStaff("0123456789","Bình Dương","25/01/2000","0123456789",
                        "123123","Vũ Minh Hiếu","5",17000f,"03/06/2018","Manager");

        SalesAgent salesAgent =
                new SalesAgent("0321456987","Hải Phòng","16/08/2001","03516489515",
                        "138592","Phạm Văn Đồng","3",16000f,"15/4/2019","assistant");

        TechnicalStaff technicalStaff =
                new TechnicalStaff("1111365665","Hà Nội","02/08/1998","033344668",
                        "132564","Ngô Minh Hiếu","5",15600f,"03/07/2015","Super Manager","Chinese");

        Employee[] employees = new Employee[3];
        employees[0] = officeStaff;
        employees[1] = salesAgent;
        employees[2] = technicalStaff;

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
        System.out.println("===============================");
        employees[0].meeting();
        employees[1].trade();
        employees[2].repair();
    }
}
