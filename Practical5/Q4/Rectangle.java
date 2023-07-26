
package com.mycompany.practical5q4;
public class Rectangle extends Shape {
    
    private double width,lenght;
 
    
    public Rectangle(double width, double lenght)
    {
        this.width=width;
        this.lenght=lenght;
       
    }
    
    @Override
     public double calculateArea()
     {
         return width*lenght;
     }
    
    
}
