package com.mycompany.interfaces;
public class Interfaces
{

    public static void main(String[] args)
    {
        Speaker politician = new Politician();
        Speaker priest = new Priest();
        Speaker lecturer = new Lecturer();

        politician.speak();
        priest.speak();
        lecturer.speak();
    }
}
