
public class emplyeewagebuilder {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation");
		int empHrs=0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
		double empCheck = (Math.floor(Math.random() * 10 ) % 3);
	      int IntValue = (int) Math.round(empCheck);
	      switch (IntValue)
	      {
	      	case IS_PART_TIME: 
	      		empHrs = 4; break;
	      	case IS_FULL_TIME:
	      		empHrs = 8; break;
	      	default:
	      		empHrs = 0; break;
	      }
	      totalEmpHrs += empHrs;
	      
	      System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHrs);
	      }
		  int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;	
		  System.out.println("Total Emp Wage: " + totalEmpWage);
	}  
}
