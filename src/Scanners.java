import java.util.Scanner;

public class Scanners
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        // System.out.println("Enter username");
    
        // String userName = myObj.nextLine();  // Read user input
        // System.out.println("Username is: " + userName);  // Output user input
    
        int first = 0;
        int second = 0;
        System.out.println("첫 번째 값을 입력하시오.");
        first = myObj.nextInt();
        System.out.println("두 번째 값을 입력하시오.");
        second = myObj.nextInt();
        System.out.println(first+second);
        
        // return 0;
    }
}