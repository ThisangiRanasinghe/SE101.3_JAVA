
package com.mycompany.practical5q1;

public class InterfaceImplemented implements MyFirstInterface {
    @Override
    public void dispaly()
    {
        x=20;// Error:Cannot assign value to final variable x
        System.out.println(x);
    }
    
    
}
