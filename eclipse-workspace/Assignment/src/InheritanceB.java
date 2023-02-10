
public class InheritanceB extends InheritanceA {

	public void B()
	{
		System.out.println("This is child Method");
	}
	public static void main(String[] args) {

		InheritanceB obj= new InheritanceB();
		obj.A();//calling parent method
		obj.B();//calling local method
	}

}
