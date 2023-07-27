
package com.mycompany.exceptionhandling2;

public class ExceptionHandling2 {

    public static void main(String[] args) {
       try
    {
        int arr[]=new int[5];
        arr[5]=10;
        System.out.println("User element is: "+arr[5]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e.getMessage());
        System.out.println("Out of array size"+e);
    }
    }
}
