
public class MultipleInheritZ extends MultipleInheritY  {
	
	public void z ()
		
		{
			System.out.println("This is child Method");
		}
	
	public static void main(String[] args) {
		MultipleInheritZ obj= new MultipleInheritZ();
		obj.x();//grand parent
		obj.y();//parent
		obj.z();//local 
	}

}
