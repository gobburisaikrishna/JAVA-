import java.util.Scanner;
public class celcius_to_fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
	double fahrenheit = (celsius * 9/5) + 32;
	System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
	scanner.close();
    }
}
