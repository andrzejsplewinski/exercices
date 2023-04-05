import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Punkt1 punkt1 = new Punkt1();
        punkt1.age = 16;
        punkt1.sex = 'k';

        System.out.println("Starting");
            if (punkt1.age <= 15) {
                System.out.println("Too young");
            } else {
                System.out.println("It's okay!");
                if (punkt1.sex == 'm') {
                    System.out.println("User is a male");
                } else if (punkt1.sex == 'f') {
                    System.out.println("User is a female");
                }
                else {
                    System.out.println("User sex is unknown");
                }
            }
        System.out.println("End of the program");
    }
}