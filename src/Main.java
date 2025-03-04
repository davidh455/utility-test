//David Hoang
import util.Input;

public class Main {
    public static void main(String[] args) {
//        double num = Input.getDouble("Please enter a valid number");
//        System.out.println("You entered " + num);
//
//        String str = Input.getStr("What is your favorite color?");
//        System.out.println("You entered " + str);
        Main c = new Main();
        double a = 20;
        double b = 10;
        double total = c.add(a,b);
        System.out.println("Total is: " + total);

        total = c.subtract(a,b);
        System.out.println("Total is: " + total);

        total = c.multiply(a,b);
        System.out.println("Total is: " + total);

        total = c.divide(a,b);
        System.out.println("Total is: " + total);
    }//end constructor

    public double add(double x, double y){
        return x + y;
    }

    public double subtract(double x, double y){
        return x - y;
    }

    public double multiply(double x, double y){
        return x * y;
    }

    public double divide(double x, double y){
        return x / y;
    }

}//end main
