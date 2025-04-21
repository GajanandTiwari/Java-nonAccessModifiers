package nonACCESSmodifiers;
abstract class nonmod
{
abstract public void show();
abstract public void demo();
}
class accs extends nonmod
{ 
	int x =9; int y=99;
public void show()
{
	
System.out.println(x);
}
public void demo()
{

System.out.println(y);
}
}

public class twoABSmthds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
accs obj =new accs();
obj.show();

obj.demo();
System.out.println("executing both show and demo method  " +(obj.x+obj.y));
	}

}
