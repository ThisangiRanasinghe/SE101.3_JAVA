
package com.mycompany.testinheritance;
public class SubC extends SuperB {
    void triple () {x=x+3;} // override existing method
    void quadruple () {x=x*4;} // new method

    
}

/*
It extends the 'SuperB' class,which means it inherits the properties and methods of 'SuperB'.
It override the 'triple()' method from the 'SuperB' class,changing the way of 'x'is modified when this methods is called.
It introduces a new method 'quadruple()' ,which multiplies the value of 'x' by 4.

*/
