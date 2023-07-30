package com.mycompany.interfaceimplemented;
public class InterfaceImplemented implements MyInterface
{

   @Override
   public void display()
    {
    System.out.println("Implementing the display() method" );
    
    }
    public static void main(String[] args)
    {
       InterfaceImplemented obj  = new InterfaceImplemented();
       obj.display();
       
       System.out.println("The value of x is:"+MyInterface.x);
    }
}

/* 1) the main difference between declaring the variable with public static final keywords and omitting 
them lies in the access level and the variable's mutability. The conventional and recommended approach for 
interface variables is to use public static final to make them constants accessible from anywhere.*/

/* 2) there is no difference between the two approaches in terms of how the method is treated by the Java
compiler and the runtime environment. */

/* 3) No, it is not possible to change the value of "x" inside the "display()" method or anywhere else 
in the implementing class. The value of "x" remains constant and will always be the initial value (10)
defined in the interface. */