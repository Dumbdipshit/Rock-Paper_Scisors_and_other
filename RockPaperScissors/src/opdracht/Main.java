package opdracht;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class Main 
{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator calc =new Calculator();		
		
		String play = "None";
		boolean cont =true;
		String hand = "none";
		String[] type = {"R", "P", "S"};
		
		while (cont == true) {
			System.out.println("Type R or P or S");
			hand = input.nextLine();
			while (!hand.equals("R") && !hand.equals("P") && !hand.equals("S")) {
				System.out.println("Please input a Value that is listed above.");
				hand = input.nextLine();
			}
				String me = (String) calc.generate();
			
			calc.compare(me, hand);
			
			System.out.println("Do you want to play again?");
			System.out.println("Type: Y or N");
			play = input.nextLine();
			
			while (!play.equals("Y") && !play.equals("N")) {
				System.out.println("Please input a Value that is listed above.");
				play = input.nextLine();
			}if (play.equals("N")) {
				cont = false;
			}
			System.out.println();	
		}System.out.println("GoodBye");
			
		}
  }

