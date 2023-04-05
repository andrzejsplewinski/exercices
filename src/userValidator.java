import java.util.*;
import java.lang.*;
import java.io.*;
public class userValidator {
    public void validateAge(int age) {
        if (age <= 15){
            System.out.println("Too young!");
        } else {
            System.out.println("User age is ok");
        }
    }
    public void validateSex(char sex){
        if (sex == 'm'){
            System.out.println("User is male");
        } else if (sex == 'f'){
            System.out.println("User is female");
        } else {
            System.out.println("Unknown sex");
        }
    }
}