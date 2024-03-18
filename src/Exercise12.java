

import java.util.*;
public class Exercise12 {

    public static void main(String arg[]){

     Scanner Scanner = new Scanner(System.in);
     System.out.print("Enter number =");
     String number = Scanner.next();

     String firstnumber = number.substring(0,3);
     String lastnumber = number.substring(4,number.length());
     
     System.out.println(firstnumber+lastnumber);





    }
}
