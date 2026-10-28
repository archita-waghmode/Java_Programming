import java.util.Scanner;

class program24
{
    public static void main(String A[])
    {
        Scanner scanner = null;
        String sName = null;

        scanner= new Scanner(System.in); //scanner object name

        System.out.println("Enter your name:");
         sName = scanner.next();

        System.out.println("Welcome "+sName);
    }
}
//nextLine()  takes whole line
// next() takes word till space in between words