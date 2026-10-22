package Oct22;

public class Keywords {

	public static void main(String[] args) {
				son s=new son();
				son i=new son(5);
				son n=new son("Prathibaa Hiiiii");
				s.bike();
				
				//private keyword:
				//s.house();
				
				//static:
				Father.whatsapp();
				System.out.println(Father.name);
				
			}

		}
		class Father{
			static String name="Prathi";
			public void bike(){
				System.out.println("This is hondo bike");
			}
			
			private void house(){
				System.out.println("Parents house");
			}
			static void whatsapp(){
				System.out.println("Testing.......");
			}
			Father(){
				System.out.println("This is Default Constructor");
			}
			Father(int a){
				System.out.println("This is Parameter Constructor "+a);
			}
			Father (String s){
				System.out.println("Welcome! "+s);
			}
		}

		class son extends Father{
			public void bike(){
				super.bike();
				System.out.println("My father brought me a pen");
			}
			son(){
				super();
				System.out.println("This is son default constructor");
			}
			son(int a){
				super(a);
				System.out.println("This is Son Parameter Constructor "+a);
			}
			son (String s){
				super(s);
				System.out.println("Welcome! "+s);
			}
	}

