package assignment;

public class JavaVeriableEx {
	
	// local variable Example
	
		public void projectDetails(String project_name,String lead_name, int numofemployee ) {
			System.out.println("Project Name:"+ project_name );
			System.out.println("Project Lead Name:"+ lead_name );
			System.out.println("Number of employee:"+numofemployee );
		}
		
	
	// global variable Example
	
	int age =23;
	String name="Ekta" ;
	String designation= "Test Engineer";
	
	public void displayEmployeeDetails() {
		System.out.println("Name:"+name );
		System.out.println("Age:"+age );
		System.out.println("Deisgnation:"+designation );
	}

}
 