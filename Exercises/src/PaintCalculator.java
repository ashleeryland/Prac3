import java.util.Scanner;

/**
 * Created by rylan on 27/08/2016.
 */
public class PaintCalculator
{
    public static void main(String args[])
    {
        double height, length, width;
        System.out.println("What is the height of your room? ");
        height = getRoomArea();
        System.out.println("What is the length of your room? ");
        length = getRoomArea();
        System.out.println("What is the width of your room? ");
        width = getRoomArea();
        System.out.println("Total cost of paint is $" + calcRoomArea(height, length, width));
    }
    public static double getRoomArea()
    {
        double number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in meters: ");
        number = input.nextDouble();
        return number;
    }
    public static double calcRoomArea(double height, double length, double width) {
        double totalArea = ((width * height) * 2) + ((length * height) * 2);
        return calcPaintCost(totalArea);
    }
    public static double calcPaintCost(double areaToPaint) {
        final double PRICE_PAINT_PER_GALLON = 32;
        return ((areaToPaint / 350) * PRICE_PAINT_PER_GALLON);
    }

}

