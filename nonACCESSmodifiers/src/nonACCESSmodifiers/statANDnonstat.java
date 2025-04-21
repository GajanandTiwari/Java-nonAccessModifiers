package nonACCESSmodifiers;
 class stt
{
	 static int x=11;
	 
static public void show()
{
	System.out.println("executing show method ");
	
}
public void demo() 
{
	int y=9;
System.out.println("exeecuting demo method "+y);	
}
}

public class statANDnonstat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(stt.x);
stt.show();
stt obj=new stt();
obj.demo();

	}

}
