import java.util.Scanner;

public class CountDown
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to start: ");
        int start = input.nextInt();
        System.out.println(countdown(start));
    }

    public static String countdown(int number)
    {
        if (number == 1){
            return "1 Blastoff!";
        }
        return number + " " + countdown(number - 1);
    }
}
