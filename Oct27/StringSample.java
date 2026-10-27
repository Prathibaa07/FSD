package Oct27;

public class StringSample {

	public static void main(String[] args) {
		
		String s="Prathi";   //1011
		String f="Prathi";
		System.out.println(s.equals(f));
		
		//s.concat("baa");     //Pool, Immutable
		System.out.println(s);
		
		//String buffer
		StringBuffer sb=new StringBuffer("Bala");   //Heap Memory, Buffullo
		StringBuffer sb1=new StringBuffer("Bala");
		StringBuilder sb2=new StringBuilder("Bala"); //Heap Memory, Horse
		
		sb.append("Ambika");
		System.out.println(sb);
		System.out.println(sb.equals(sb1));
		
	}

}
