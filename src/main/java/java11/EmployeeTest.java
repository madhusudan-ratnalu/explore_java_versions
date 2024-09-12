package java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void  main (String[]args){
        Employee emp1=new Employee();
        emp1.setEmployeeId("1234");
        emp1.setDeptId("MAD123");
        emp1.setEmployeeName("MADHU");

        Employee emp2=new Employee();
        emp2.setEmployeeId(null);
        emp2.setDeptId("CAD12");
        emp2.setEmployeeName("sudan");

        Employee emp3=new Employee();
        emp3.setEmployeeId("123m");
        emp3.setDeptId("CAD12");
        emp3.setEmployeeName("sudan");

        List<Employee> employees = Arrays.asList(emp1,emp2,emp3);

        List<Employee> nonNullEmployees = employees.stream()
                .filter(emp -> emp.getEmployeeId() != null)
                .collect(Collectors.toList());

        nonNullEmployees.forEach(System.out::println);
    }

}
