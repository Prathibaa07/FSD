package Oct17;
import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		Assignment c=new Assignment();
			c.bank();
		
	}
}
class Assignment{
		
	public void bank(){
		Scanner sc= new Scanner(System.in);
		int balance=5000;
		int a;
		do{
		System.out.println("Initial Balance: "+balance);
		System.out.println("1.Deposit");
		System.out.println("2.Withdrawn");
		System.out.println("3.Exit");
		System.out.println("Enter number:");
		a=sc.nextInt();
		
			switch(a){
		
				case 1:{
					System.out.println("Enter Deposit Amount:");
					int deposit=sc.nextInt();
					balance+=deposit;
					System.out.println("Your deposited total amount: "+balance);
					break;
				}
				case 2:{
					System.out.println("Enter Withdrawn Amount:");
					int withdrawn=sc.nextInt();
					balance-=withdrawn;
					System.out.println("Your deposited total amount: "+balance);
					break;
				}
				case 3:{
					System.out.println("Exited");
					break;
				}
				default:{
					System.out.println("Invalid Input");
					break;
				}
			}
		}while(a!=3);
	}
}