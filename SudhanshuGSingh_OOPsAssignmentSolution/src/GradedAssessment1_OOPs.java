import java.text.SimpleDateFormat;
import java.util.Calendar;

class GradedAssessment1_OOPs {
	
	public static void main (String[] args) {
		
		/*
		 * → Driver class Main will be used to create objects of HrDepartment,
		 * TechDepartment, AdminDepartment → Each department will display all its
		 * functionalities. → Each department  will display whether today is a holiday
		 * or not with the help of the Super Department. (SuperDepartment will act as a
		 * super class for all the departments)
		 */
		
		/*
		 * Expected Output
		 * 
		 * Welcome to Admin Department 
		 * Complete your documents submission 
		 * Complete by EOD  
		 * Today is not a Holiday
		 * 
		 * Welcome to HR Department 
		 * team Lunch 
		 * Fill today’s timesheet and mark your attendance 
		 * Complete by EOD 
		 * Today is not a Holiday
		 * 
		 * 
		 * Welcome to Tech Department 
		 * Complete coding of Module 1 
		 * Complete by EOD 
		 * Core Java 
		 * Today is not a Holiday
		 * 
		 */

		
		//Print Output on Console
		progOutput();
		
	}
	
	public static void progOutput()
	{
		
		SuperDepartment objSuperDepartment = new SuperDepartment();
		
		String strWelcome = "Welcome to ";
		
		System.out.println("Output: as on : " + (new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(Calendar.getInstance().getTime())));
		System.out.println("");
		
		
		SuperDepartment objAdminDepartment = new AdminDepartment();
		System.out.println(strWelcome + objAdminDepartment.departmentName());
		System.out.println(objAdminDepartment.getTodaysWork());
		System.out.println(objAdminDepartment.getWorkDeadline());
		System.out.println(objSuperDepartment.isTodayAHoliday());
		
		System.out.println("");
		
		HrDepartment objHrDepartment = new HrDepartment();
		System.out.println(strWelcome + objHrDepartment.departmentName());
		System.out.println(objHrDepartment.doActivity());
		System.out.println(objHrDepartment.getTodaysWork());
		System.out.println(objHrDepartment.getWorkDeadline());
		System.out.println(objSuperDepartment.isTodayAHoliday());
		
		System.out.println("");
		
		TechDepartment objTechDepartment = new TechDepartment();
		System.out.println(strWelcome + objTechDepartment.departmentName());
		System.out.println(objTechDepartment.getTodaysWork());
		System.out.println(objTechDepartment.getWorkDeadline());
		System.out.println(objTechDepartment.doActivity());
		System.out.println(objSuperDepartment.isTodayAHoliday());
	}

}
