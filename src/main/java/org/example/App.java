package org.example;


import org.example.model.Employee;
import org.example.model.SystemDeveloper;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args )
    {
        /*
            1. Create Employee
                1.1 Make employee abstract and define calculate salary
            2. Create SystemDeveloper
                2.1 Do array logic
                2.2 fix the salary
                2.3 fix the toString
            3. Create SalesPerson
                3.1 fix array logic
                3.2 fix acquired clients
                3.3 fix the salary
                3.4 fix toString
         */

        SystemDeveloper codeMonkey = new SystemDeveloper(1, "Erik Svensson", LocalDate.now());
        System.out.println(codeMonkey);
        codeMonkey.addLanguage("Java");
        codeMonkey.addCertificate("OCA");
        System.out.println(codeMonkey);


    }
}
