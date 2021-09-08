
public class HrDepartment {
	
	/* 
	 
		 Hr department will contain 4 methods of return type String and will not accept any parameter
	               i)  departmentName 
	              ii)  getTodaysWork  
	              iii) getWorkDeadline
	              iv) doActivity
	
		departmentName will return “ Hr Department “
		getTodaysWork will return  “ Fill today’s worksheet and mark your attendance”
		getWorkDeadline will return “ Complete by EOD “
		doActivity “team Lunch”

	 */
	
	public String str;
	
	public String getStr() { return str; } 
	public void setStr(String str) {
		this.str = str; 
	}
	
	
	public String departmentName() {
		this.setStr("HR Department");
		return this.getStr();
		
	}
	
	public String getTodaysWork() {
		this.setStr("Fill today's worksheet and mark your attendance");
		return this.getStr();
	}
	
	public String getWorkDeadline() {
		this.setStr("Complete by EOD");
		return this.getStr();
	}

	public String doActivity() {
		this.setStr("team Lunch");
		return this.getStr();
	}
}
