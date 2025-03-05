package util;

import java.util.Scanner;

public class Input {

    public static int getInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        boolean gotInt = false;
        int num = 0;

        while (!gotInt) {
            System.out.println(prompt);
            String str = scanner.nextLine();
            try {
                num = Integer.parseInt(str);
                gotInt = true;
            } catch (Exception e) {
                System.out.println(str + " is not a valid integer. Please enter a whole number.");
            }
        }
        return num;
    }

    public static double getDouble(String prompt){
        Scanner scanner = new Scanner(System.in);
        boolean gotDouble = false;//will be true when right data entered
        double num = 0;//will store number returned
        while(!gotDouble){
            System.out.println(prompt);
            String str = scanner.nextLine();
            try{
                num = Double.parseDouble(str);
                gotDouble = true;
            }catch(Exception e){
                System.out.println(str + " is not a number");
            }//end try
        }//end while
        return num;
    }//end getDouble

    public static String getStr(String prompt){
        Scanner scanner = new Scanner(System.in);
        String str = "";//will store data returned
        boolean gotString = false;//will turn true, with correct data
        while(!gotString){
            System.out.println(prompt);
            str = scanner.nextLine();
            if(str.length() >=1){
                gotString = true;
            }else{
                System.out.println("Please enter at least one character.");
            }
        }//end while
        return str;
    }//end getStr()

}
