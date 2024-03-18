import java.util.*;
public class Exercise15 {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Somthing=");
        String somthing = scanner.next();

        for(int i=0;i<somthing.length();i++){
            System.out.println(somthing.charAt(i));
        }

    }

}
