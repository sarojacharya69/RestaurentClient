import java.util.Scanner;

public class RestaurentClient {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("==============================");
			System.out.println("      1)Briayni               ");
			System.out.println("      2)Exit                    ");

			System.out.println("==============================");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				BiryaniDetails details = new BiryaniDetails();
				details.biryanimenuDetails();

				break;
			case 2:
				System.out.println("thanks for using app");
				System.exit(0);
			default:
				System.out.println("Choose 1 to 2 between");
			}
		}

	}

}
