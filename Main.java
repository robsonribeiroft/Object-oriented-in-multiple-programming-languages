package ring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Value of the external radius: ");
		double radiusExternal = scanner.nextDouble();
		System.out.println("Value of the internal radius: ");
		double radiusInternal = scanner.nextDouble();
		
		Ring ring = new Ring(radiusExternal, radiusInternal);
		
		System.out.println("area = " + ring.getRingArea());
		
		scanner.close();
	}

}
