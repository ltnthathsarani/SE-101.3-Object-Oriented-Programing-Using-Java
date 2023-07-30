package com.mycompany.studentmarks;
public class StudentMarks 
{

    public static void main(String[] args) 
    {
       Student m1 = new Student();
       m1.display();
    }
}


/*  When compile the provided code, encounter 
a compilation error in Class 02 (Undergraduate class) due to the
attempt to extend a final class Student. The error message will 
indicate that a final class cannot be subclassed.

To fix the issue,  need to remove the final keyword from
the Student class if you want it to be subclassed. Alternatively,
 create a new non-final class (e.g., Undergraduate) that is
not related to the Student class and define its properties and behaviors independentl*/