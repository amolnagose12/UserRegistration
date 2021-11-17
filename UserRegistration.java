package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    
    public static void lastName(){

            String lastName="Nag";

            String pattern= "^[A-Z]{1}[a-z]{2}";
            Pattern r= Pattern.compile(pattern);

            Matcher m = r.matcher(lastName);


            if(m.matches()){
                System.out.println(" Last Name Matched Pattern:" );

            }else
            {
                System.out.println("Last Name  No Matched :");
            }

        }


    public static void main(String[] args){
        System.out.println(" java Regex :");

        lastName();

    }
}