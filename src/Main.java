import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Battlefield battlefield = new Battlefield();
		Scanner input = new Scanner(System.in);
		int option = -1;
		int sanity = 0; 
		while (option != 0 && sanity < 100) {
			System.out.println("Moving	Soliders");
			battlefield.moveSoldier();
			System.out.println("Processing	Fights");

			battlefield.soldierFights();

			if (battlefield.getDirCount() == 0) {
				System.out.println("Orcs	win");
				break;
			}
			System.out.printf("Round	%d	of	100	completed\n", sanity++ + 1);
			System.out.println("Enter	0	to	quit");
			option = input.nextInt();
		}

		input.close();
	}

}
