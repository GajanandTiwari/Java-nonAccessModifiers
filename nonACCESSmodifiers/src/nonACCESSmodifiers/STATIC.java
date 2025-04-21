package nonACCESSmodifiers;
 class nonacmod
 {
	 static int a=6;
	 static public void show()

 {
		 System.out.println("executing show method ");
 } 
	 static
	 {
		 
		 int x=9;
		 int y=3;
		 int z=6;
		 System.out.println(x+y+z);
	 }
	 }
public class STATIC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(nonacmod.a);
nonacmod.show();
	}

}
