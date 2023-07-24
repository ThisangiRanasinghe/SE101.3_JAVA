

package com.mycompany.testinheritance;
public class TestInheritance {

    public static void main(String[] args) {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); }

    }
/*It contains the 'main()' method to demonstrate the inheritance and method overriding.

It creates an object b of type SuperB, sets the value of x to 2, increments it by 1, and then triples it by calling the respective methods.

The output of b.returnIt() will be: 2 + 1 = 3, 3 * 3 = 9. So, the output will be 9.

It creates an object c of type SubC, sets the value of x to 2, increments it by 1, and then triples it by calling the respective methods.

The triple() method in the SubC class is overridden to add 3 instead of multiplying by 3. So, the output of c.returnIt() will be: 2 + 1 = 3, 3 + 3 = 6. 
However, the code does not call the quadruple() method, so the value of x will remain as 6.

Thus, the output of c.returnIt() will be 6
*/

/*
output
9
6
*/

