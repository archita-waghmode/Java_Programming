import java.util.Scanner;

class program22
{
    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in); //scanner object name

        System.out.println("Enter your name:");
        String sName = scanner.nextLine();

        System.out.println("Welcome "+sName);
    }
}