
package com.mycompany.practical5q4;

public class Circle extends Shape {
    private double radius;
 
    
    public Circle(double radius)
    {
        this.radius=radius;
        
    }
    @Override
    public double calculateArea()
    {
        return 3.14159*radius*radius;
    }
    
    
}
