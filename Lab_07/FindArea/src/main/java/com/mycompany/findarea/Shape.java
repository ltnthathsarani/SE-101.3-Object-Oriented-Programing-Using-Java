package com.mycompany.findarea;
abstract class Shape 
{
     public abstract double calculateArea();
     
     public void display()
     {
      System.out.println("Area:"+calculateArea());
     }
}
