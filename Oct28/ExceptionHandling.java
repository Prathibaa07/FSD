package Oct28;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			long data=100/10;
			System.out.println(data);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}
}
