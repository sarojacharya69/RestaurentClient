import java.util.Scanner;

public class BiryaniDetails {
	void chickenBiryani() {
		System.out.println("Welcome to eat chicken");
	}

	public void biryanimenuDetails() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=======================");
			System.out.println("       1)Chicken Biryani ");
			System.out.println("        2)Back           ");

			System.out.println("=======================");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				chickenBiryani();
				biryanimenuDetails();
				break;
			case 2:
				RestaurentClient.main(null);
				
				break;
			default:
				System.out.println("Choose 1 to 2 Between");

			}

		}

	}

}
