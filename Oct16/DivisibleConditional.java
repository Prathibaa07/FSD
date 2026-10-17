package Oct16;
import java.util.Scanner;

public class DivisibleConditional {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to divisible with 5:");
		int a=sc.nextInt();
		if(a%5==0){
			System.out.println(a+" is divisible with 5");
		}
		else{
			System.out.println(a+" is not divisible with 5");
		}
	}

}
