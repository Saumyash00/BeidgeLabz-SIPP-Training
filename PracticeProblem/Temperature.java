import java.util.*;
class Temperature{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double celsius=sc.nextDouble();

		double fahrenheit= (celsius*(9/5))+32;
		
		System.out.println(celsius+" degree Celsius equals to "+fahrenheit+" degree Fahrenheit ");
	}
}