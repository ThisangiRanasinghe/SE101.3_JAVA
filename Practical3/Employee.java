
package com.mycompany.employeetest;
public class Employee {
   private  String name;
   private int age;
   private double salary; 
   
   public String getName()
   {
       return name;
   }
   public void setName(String name)
   {
       this.name=name;
   }
   public int getAge()
   {
       return age;
   }
   public void setAge(int age)
   {
       this.age=age;
   }
   
   public double getSalary()
   {
       return salary;
   }
   public void setSalay(double salary)
   {
       this.salary=salary;
   }

   //Modified Employee Class with Constructor
   public Employee(String name,int age,double salary)
   {
       this.name=name;
       this.age=age;
       this.salary=salary;
   }
   
   public String getName()
   {
       return name;
   }
   public int getAge()
   {
       return age;
   }
   
   public double getSalary()
   {
       return salary;
   }
   
}
