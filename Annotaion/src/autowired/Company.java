package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Company {
	@Autowired											// this is setter autowired 
	@Qualifier("hrdepartment")
	private Department department;					// this is simmiler like bytype and byName

	 public void compnayWork()
	 {
		 if(department == null)
		 {
			 System.out.println("No Client No Work");
		 }
		 else {
			department.work();
		}
	 }
	 

	 
	 
	 
}
