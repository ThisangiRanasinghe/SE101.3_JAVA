

package com.mycompany.practical3q2;
public class Practical3q2 {

    public static void main(String[] args) {
         Employee e1 = new Employee("Bogdan", 50000.0, 10000.0);

        System.out.println("Employee Name: " + e1.getEmployeeName());
        System.out.println("Basic Salary: " + e1.getBasicSalary());
        System.out.println("Bonus: " + e1.getBonus());
        System.out.println("Bonus Amount: " + e1.CalculateBonusAmount());
    }
}
/*
output
Employee Name: Bogdan
Basic Salary: 50000.0
Bonus: 10000.0
Bonus Amount: 60000.0
*/