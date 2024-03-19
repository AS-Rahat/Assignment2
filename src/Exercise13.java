import java.util.*;
public class Exercise13 {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number without comma:");
        String number = scanner.next();

        String firstnumbers = number.substring(0,2);
        String lastnumbers = number.substring(2,number.length());

        System.out.println(firstnumbers+","+lastnumbers);

    }
}
