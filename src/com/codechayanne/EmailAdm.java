package com.codechayanne;

import java.util.Random;
import java.util.Scanner;

public class EmailAdm implements administration {

    /* Instance Variable */

    private String firstname;
    private String lastname;
    private String department;
    private String emailcapacity = "15GB";
    private String Domain        = "@company.com";


    /* Getters and Setters */

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }




    /* Methods */

    @Override
    public void password() {

        Random r = new Random();
        String alphabet = "123xyz";

        for (int i = 0; i < 10; i++) {

            System.out.print(alphabet.charAt(r.nextInt(alphabet.length())));
        }
    }

    @Override
    public String email() {
        String email;

        email = this.firstname + this.lastname + this.Domain;
        return email;
    }

    @Override
    public String setDepartment(int x) {

        System.out.println("Please select the new hire department: ");
        System.out.println("1 - Accounting");
        System.out.println("2 - Marketing ");
        System.out.println("3 - Sales");
        System.out.println("4 - Information Technology");
        System.out.println("5 - Application Services");

        switch(x) {
            case 1:
                this.department = "Accounting";
                break;
            case 2:
                this.department = "Marketing";
                break;
            case 3:
                this.department = "Sales";
                break;
            case 4:
                this.department = "Information Technology";
                break;
            case 5:
                this.department = "IApplication Services";
                break;
            default:
                this.department = "no department have been assign";
                break;
        }

        return this.department;
    }
}
