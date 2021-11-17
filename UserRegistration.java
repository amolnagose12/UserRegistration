package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    
    public static void mobileNumber(){

            String mobileNo="91 8806564783";

            String pattern= "^[0-9]{2}\s[0-9]{10}$";
            Pattern r= Pattern.compile(pattern);

            Matcher m = r.matcher(mobileNo);


            if(m.matches()){
                System.out.println(" mobile number Matched Pattern:" );

            }else
            {
                System.out.println("mobile number Not Matched :");
            }

        }


    public static void main(String[] args){
        System.out.println(" java Regex :");

        mobileNumber();

    }
}