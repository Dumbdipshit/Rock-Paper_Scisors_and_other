package opdracht;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num = 0.0;
		int calculation = 0;
		Calculator calc = new Calculator();
		System.out.println("Type 1 for Farenheit to Celsius.");
		System.out.println("Type 2 for Celsius to Kelvin.");
		System.out.println("Type 3 for Farenheit to Kelvin.");
		System.out.println("Type 4 for Celsius to Farenheit.");
		System.out.println("Type 5 for Kelvin to Celsius.");
		System.out.println("Type 6 for Kelvin to Farenheit.");
		
		calculation = input.nextInt();
		System.out.println();
		
			if (calculation <= 6) {
				if (calculation == 1) {
					System.out.println("Type the Farenheit temprature to calculate to Celsius.");
					num = input.nextDouble();   
					calc.calc(num, calculation);
					
				}else if(calculation == 2) {
					System.out.println("Type the Celsius temprature to calculate to Kelvin.");
					num = input.nextDouble(); 
					calc.calc(num, calculation);	
					
				}else if(calculation == 3) {
					System.out.println("Type the Farenheit temprature to calculate to Kelvin.");
					num = input.nextDouble(); 
					calc.calc(num, calculation);	
					
				}else if(calculation == 4) {
					System.out.println("Type the Celsius temprature to calculate to Farenheit.");
					num = input.nextDouble(); 
					calc.calc(num, calculation);	
					
				}else if(calculation == 5) {
					System.out.println("Type the Kelvin temprature to calculate to Celsius.");
					num = input.nextDouble(); 
					calc.calc(num, calculation);		
					
				}else {
					System.out.println("Type the Kelvin temprature to calculate to Farenheit.");
					num = input.nextDouble(); 
					calc.calc(num, calculation);
				}
			}else {
				System.out.println("Please restart me and type a nummber from the options");
			}
	}
}

