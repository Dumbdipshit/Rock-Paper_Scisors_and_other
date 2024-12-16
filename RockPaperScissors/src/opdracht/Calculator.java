package opdracht;

import java.util.Random;

public class Calculator {
Random random = new Random();
	
	String generate() {
		String me = "none";
		int num = 0;
		int number = 8;
		String[] type = {"R", "P", "S"};
		
		number = random.nextInt(3);
		 me = type[number];
		 System.out.println("I play "+me);
		 return(me);
	}
	
	void compare(String me, String hand) {
		String[] type = {"R", "P", "S"};
		if (me.equals(type[0])) { // 0 = Rock||   1 = Paper||  2 = S||
			if (hand.equals("R")) {
				System.out.println("Tie!");
			}else if(hand.equals("P")) {
				System.out.println("You Won!");
			}else {
				System.out.println("You Lost!");
			}}else if(me.equals(type[1])){
				if (hand.equals("R")) {
					System.out.println("You Lost!");
				}else if(hand.equals("P")) {
					System.out.println("Tie!");
				}else {
					System.out.println("You Won!");
				}
					
				}else {
				if (hand.equals("R")) {
					System.out.println("You Won!");
				}else if(hand.equals("P")) {
					System.out.println("You Lost!");
				}else {
					System.out.println("Tie!");
				}
			}
	}
}
