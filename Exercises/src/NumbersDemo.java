/**
 * Created by ryland
 */
public class NumbersDemo
{
    public static void main(String args[])
    {
        int a = 20, b = 5;
        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);

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
