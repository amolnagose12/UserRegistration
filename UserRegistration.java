package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    
    public static void password(){

            String pass="Amol@123";

            String pattern= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&]).{8,32}$";
            Pattern r= Pattern.compile(pattern);

            Matcher m = r.matcher(pass);


            if(m.matches()){
                System.out.println(" password Matched Pattern:" );

            }else
            {
                System.out.println("password Not Matched :");
            }

        }


    public static void main(String[] args){
        System.out.println(" java Regex :");

        password();

    }
}