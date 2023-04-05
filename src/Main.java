import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        System.out.println("Starting...");
        int age = 16;
        char sex = 'm';

        userValidator validator = new userValidator();

        boolean isHigherThenFifteen = validator.validateAge(age);

        if(isHigherThenFifteen){
            validator.validateSex(sex);
        }

        System.out.println("End of the program");
    }



}