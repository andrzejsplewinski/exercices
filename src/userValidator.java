import java.lang.*;

public class userValidator {
    public boolean validateAge(int age) {
        if (age <= 15){
            System.out.println("Too young!");
            return false;
        } else {
            System.out.println("User age is ok");
            return true;
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