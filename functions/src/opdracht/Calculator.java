package opdracht;

public class Calculator {
	
	private double FtoC(double num)
	{return (num-32.0)/(9.0/5.0);}
	
	private double CtoK(double num)
	{return (num+273.15);}
	
	private double FtoK(double num)
	{double result;
	 result = (num-32.0)/(9.0/5.0);
	 return (result+273.15);}
	
	private double CtoF(double num)
	{return ((num*9/5)+32);}
	
	private double KtoC(double num)
	{return num - 273.15;}
	
	private double KtoF(double num)
	{double result;
	 result = num - 273.15;
     return (num*9/5)+32;}
	
		  void calc(double num, int calculation) {			  
		    double result;
		    
		    if (calculation == 1) {
		    	result = FtoC(num);
			    System.out.println(num+" Farenheit "+" is "+result+" Celsius");
			    
			}else if (calculation == 2) {
			    result = CtoK(num);
			    System.out.println(num+" Celsius "+" is "+result+" Kelvin");
			    
			}else if (calculation == 3) {
			    result = FtoK(num);
			    System.out.println(num+" Farenheit "+" is "+result+" Kelvin");
			    
			}else if (calculation == 4) {
			    result = CtoF(num);
			    System.out.println(num+" Celsius "+" is "+result+" Farenheit");
			    
			}else if (calculation == 5) {
			    result = KtoC(num);
			    System.out.println(num+" Kelvin "+" is "+result+" Celsius");
			    
			}else {
			    result = KtoF(num);
			    System.out.println(num+" Kelvin "+" is "+result+" Farenheit");
			}
		}
}
