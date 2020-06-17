package com.codechayanne;

import java.util.Scanner;

public class Main extends EmailAdm{

    public static void main(String[] args) {
        /* Input Object */

        Scanner in = new Scanner(System.in);

        EmailAdm userEm = new EmailAdm();


        System.out.print("Please enter the employee full name: ");

        userEm.setFirstname(in.nextLine());
        userEm.setLastname(in.nextLine());

        System.out.print("Select department: ");

        int department = in.nextInt();

        userEm.setDepartment(department);

        System.out.println(" ");
        System.out.println("This is your Employee email account Information: ");
        System.out.println(" ");
        System.out.println("Email Address: " + userEm.email());
        System.out.println(" ");
        System.out.println("Department: " + userEm.getDepartment());
        System.out.println(" ");
        System.out.println("Email Capacity: "+ userEm.getEmailcapacity());
        System.out.println(" ");
        System.out.print("Password : ");
        userEm.password();



    }
}
