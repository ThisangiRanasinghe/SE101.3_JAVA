

package com.mycompany.testperson;
public class TestPerson {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Namal");
        s1.setId(250);
        s1.setCourse("Software Engineering");
        
        Lecture L1= new Lecture();
        L1.setName("Bandara");
        L1.setId(26);
        L1.setProgramme("Computer Science");
        
        System.out.println("Student Details");
        System.out.println("Name:"+s1.getName());
        System.out.println("Id:"+s1.getId());
        System.out.println("Course:"+s1.getCourse());
        
        System.out.println("\nLecture Details");
        System.out.println("Name:"+L1.getName());
        System.out.println("Id:"+L1.getId());
        System.out.println("Programme:"+L1.getProgramme());
    }
}
/*
Student Details
Name:Namal
Id:250
Course:Software Engineering

Lecture Details
Name:Bandara
Id:26
Programme:Computer Science
*/
