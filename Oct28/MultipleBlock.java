package Oct28;

public class MultipleBlock {

	public static void main(String[] args) {
		//Integer
		try{                     
			int a[]=new int[5];                     
			a[5]=30/0;  
			System.out.println(a[10]);
		}                    
		catch(ArithmeticException e)                     
		{                      
			System.out.println("Arithmetic Exception occurs");
		}                    
		catch(ArrayIndexOutOfBoundsException e)                     
		{                    
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}                    
		catch(Exception e)                     
		{                      
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");   
		
		
		//String
		try{                     
			String s=null;                   
			System.out.println(s.length());                  
		}                    
		catch(ArithmeticException e)                     
		{                    
			System.out.println("Arithmetic Exception occurs");                     
		}                    
		catch(ArrayIndexOutOfBoundsException e)                     
		{                    
			System.out.println("ArrayIndexOutOfBounds Exception occurs");                     
		}                    
		catch(Exception e)                     
		{                      
			System.out.println("Parent Exception occurs");                     
		}                             
		System.out.println("rest of the code");

	}

}
