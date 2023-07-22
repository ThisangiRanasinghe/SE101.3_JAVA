

package com.mycompany.employeetest;
public class EmployeeTest {
//Q3.1
    public static void main(String[] args) {
        Employee s1=new Employee();
        
        s1.setName("Kamal");
        s1.setAge(35);
        s1.setSalay(35000);
        
        System.out.println("EmployeeName:"+s1.getName());
        System.out.println("EmloyeeAge:"+s1.getAge());
        System.out.println("EmloyeeSalary:"+s1.getSalary());

        //Modified Employee Test Class
        Employee c1=new Employee("kamal",35,40000);
        System.out.println("EmployeeName:"+c1.getName());
        System.out.println("EmloyeeAge:"+c1.getAge());
        System.out.println("EmloyeeSalary:"+c1.getSalary());

        
    }
}
