//David Hoang
import util.Input;

public class Main {
    public static void main(String[] args) {
        double num = Input.getDouble("Please enter a valid number");
        System.out.println("You entered " + num);

        String str = Input.getStr("What is your favorite color?");
        System.out.println("You entered " + str);
    }
}
