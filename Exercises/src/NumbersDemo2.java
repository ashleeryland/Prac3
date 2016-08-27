/**
 * Created by ryland
 */
import java.util.Scanner;
public class NumbersDemo2
{
    public static void main(String args[])
    {
        int a, b;
        a = getNumbers();
        b = getNumbers();

        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);

    }
    public static int getNumbers()
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = input.nextInt();
        return number;
    }
    public static void displayTwiceTheNumber(int value)
    {
        System.out.println(value + " multiplied by 2 is " + (value *2));
    }
    public static void displayNumberPlusFive(int value)
    {
        System.out.println(value + " plus 5 is " + (value + 5));
    }
    public static void displayNumberSquared(int value)
    {
        System.out.println(value + " squared is " + (value * value));
    }
}
