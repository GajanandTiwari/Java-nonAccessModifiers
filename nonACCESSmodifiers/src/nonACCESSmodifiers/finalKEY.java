package nonACCESSmodifiers;
final class abcd
{
final int x=9;
final public void show()
{
	x++;
System.out.println("Executing show method "+x);	
}
}
class mod extends abcd
{
public void show()	
{
System.out.println("Executing show method");
}
}
public class finalKEY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
