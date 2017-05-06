//Java program by Alex Bledsoe, 04/06/2017
public class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Patel Koresh";
        e1.idNumber = 432;
        e1.department = "Accounting";
        e1.position = "CEO";

        Employee e2 = new Employee();
        e2.name = "Smidge Crossbow";
        e2.idNumber = 391;
        e2.department = "IT";
        e2.position = "CIO";

        Employee e3 = new Employee();
        e3.name = "Joy Temple";
        e3.idNumber = 814;
        e3.department = "Manufacturing";
        e3.position = "Shift Lead";

        e1.getInfo();
        e2.getInfo();
        e3.getInfo();
    }

}