

public class AdminDepartment extends SuperDepartment {
	
	/*
	 	Admin department will contain 3 methods of return type String and will not accept any parameter
	
			               i)  departmentName 
			              ii)  getTodaysWork  
			              iii) getWorkDeadline
			              
			departmentName will return “ Admin Department “
			getTodaysWork will return “Complete your documents Submission”
			getWorkDeadline will return “ Complete by EOD “
			
	*/

	
	public String str;
	
	public String getStr() { return str; } 
	public void setStr(String str) {
		this.str = str; 
	}
	
	
	public String departmentName() {
		this.setStr("Admin Department");
		return this.getStr();
		
	}
	
	public String getTodaysWork() {
		this.setStr("Complete your documents Submission");
		return this.getStr();
	}
	
	public String getWorkDeadline() {
		this.setStr("Complete by EOD");
		return this.getStr();
	}
}
