package Oct29;
import java.util.*;
import java.util.ArrayList;
public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Anu");
		list.add("Arun");
		list.add("Archan");
		list.add("Abi");
		list.add("Akash");
		list.add(null);
		System.out.println(list);
		
		ArrayList list1=new ArrayList();
		list1.add("Kalai");
		list1.add(100);
		list1.add(true);
		System.out.println(list1);
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}

}
