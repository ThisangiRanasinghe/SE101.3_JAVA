

package com.mycompany.practical4q1;
public class Practical4Q1 {

    public static void main(String[] args) {
        
        Employee bogdan=new Employee();
        bogdan.setEmpId(123);
        bogdan.setEmpName("Mr.Bogdan");
        bogdan.setEmpDesignation("Software Engineer");
        
        Employee bird=new Employee();
        bird.setEmpId(200);
        bird.setEmpName("Ms.Bird");
        bird.setEmpDesignation("Graphic Designer");
        
        System.out.println("Employee Id:"+bogdan.getEmpId());
        System.out.println("Employee Name:"+bogdan.getEmpName());
        System.out.println("Employee Designation:"+bogdan.getEmpDesignation());
        
        System.out.println("\nEmployee Id:"+bird.getEmpId());
        System.out.println("Employee Name:"+bird.getEmpName());
        System.out.println("Employee Designation:"+bird.getEmpDesignation());
        
        
        
    }
}
/* output
Employee Id:123
Employee Name:Mr.Bogdan
Employee Designation:Software Engineer

Employee Id:200
Employee Name:Ms.Bird
Employee Designation:Graphic Designer
*/