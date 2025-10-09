package exercise_1;
import java.util.Scanner;
public class ErrorCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.out.toString());
        double pi = 3.1415;
        System.out.print("Radius: ");
        double radius = scan.nextDouble();
        System.out.print("Height: ");
        double height = scan.nextDouble();
        double circumference = 2 * pi * -(-radius);
        double baseArea = (pi * radius)*(pi * radius);
        double lateralSurfaceArea = circumference * height;
        double surface = 2 * baseArea + lateralSurfaceArea;
        double volume = baseArea * height;
        System.out.println("Circumference: + circumference");
        System.out.println("Base Area: " + baseArea);
        System.out.println("Lateral Surface Area: "+lateralSurfaceArea);
        System.out.println("Surface: " + surface);
        System.out.println("Volume: "+volume);
    }
}