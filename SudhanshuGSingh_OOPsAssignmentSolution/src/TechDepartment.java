
public class TechDepartment {
	
	/*
	 * Tech department will contain 4 methods of return type String and will not
	 * accept any parameter  
	 *               
	 * i)   departmentName                
	 * ii)  getTodaysWork                 
	 * iii) getWorkDeadline               
	 * iv)  getTechStackInformation
	 * 
	 * departmentName will return “ Tech Department “ 
	 * getTodaysWork will return  “Complete coding of module 1” 
	 * getWorkDeadline will return “ Complete by EOD “
	 * getTechStackInformation will return “core Java”
	 */

	public String str;
	
	public String getStr() { return str; } 
	public void setStr(String str) {
		this.str = str; 
	}
	
	
	public String departmentName() {
		this.setStr("Tech Department");
		return this.getStr();
		
	}
	
	public String getTodaysWork() {
		this.setStr("Complete coding of Module 1");
		return this.getStr();
	}
	
	public String getWorkDeadline() {
		this.setStr("Complete by EOD");
		return this.getStr();
	}

	public String doActivity() {
		this.setStr("Core Java");
		
		return this.getStr();
	}

}
