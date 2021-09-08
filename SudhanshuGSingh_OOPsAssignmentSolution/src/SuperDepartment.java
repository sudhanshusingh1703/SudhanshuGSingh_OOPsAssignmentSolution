

public class SuperDepartment {
	
	/*
	 * Super Department class will be the superclass and all other departments must
	 * extend it.
	 * 
	 * → Super department will contain 4 methods of return type String and will not
	 * accept any parameter                i)  departmentName                ii) 
	 * getTodaysWork                 iii) getWorkDeadline               iv)
	 * isTodayAHoliday
	 * 
	 * departmentName will return “ Super Department “ getTodaysWork will return  “
	 * No Work as of now” getWorkDeadline will return “ Nil “ isTodayAHoliday will
	 * return “ Today is not a holiday”
	 */

	
	public String str;
	
	public String getStr() { return str; } 
	public void setStr(String str) {
		this.str = str; 
	}
	
	
	public String departmentName() {
		this.setStr("Super Department");
		return this.getStr();
		
	}
	
	
	public String getTodaysWork() {
		this.setStr("No Work As of now");
		return this.getStr();
	}
	
	public String getWorkDeadline() {
		this.setStr("Nil");
		return this.getStr();
	}
	
	public String isTodayAHoliday() {
		this.setStr("Today is not a holiday ");
		return this.getStr();
	}

}