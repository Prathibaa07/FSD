package Oct28;

public class FinallyKeywordException {

	public static void main(String[] args) {
		try{                     
			int a[]=new int[5];                     
			a[5]=30/0;  
			System.out.println(a[10]);
		}                    
		catch(ArithmeticException e)                     
		{                      
			System.out.println("Arithmetic Exception occurs");
		}
		finally{
			System.out.println("Thank you for choosing us");
		}
		System.out.println("Rest of the code");
	}
}
