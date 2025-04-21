package nonACCESSmodifiers;
abstract class abdsss
{
abstract public void show(); 
public void demo()
{
	System.out.println("executing demo method");
}
}
class abbds extends abdsss
{
	public void show()
	{
		int x=18;
		x++;
		x--;
		System.out.println("executing show method "+x);
	}
	}
public class abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abbds obj =new abbds();
obj.show();
obj.demo();
	}

}
