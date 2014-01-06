import java.util.ArrayList;


public class Employee
{
	private String name;
	private String title;
	private double hourlyRate;
	private double hoursWorked;
	private boolean isPartTime;
	
	public static final int MAX_HOURS_PART_TIME = 30;
	public static final int HOURS_REQUIRED_FOR_OVERTIME = 40;
	public static final double FACTOR_FOR_OVERTIME = 1.25;
	/**
	 * @param name
	 * @param title
	 * @param hourlyRate
	 * @param hoursWorked
	 * @param isPartTime
	 */
	public Employee(String name, String title, double hourlyRate,
			double hoursWorked, boolean isPartTime)
	{
		this.name = name;
		this.title = title;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.isPartTime = isPartTime;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	/**
	 * @return the hoursWorked
	 */
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	/**
	 * @return the isPartTime
	 */
	public boolean isPartTime()
	{
		return isPartTime;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	/**
	 * @param isPartTime the isPartTime to set
	 */
	public void setPartTime(boolean isPartTime)
	{
		this.isPartTime = isPartTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", title=" + title + ", hourlyRate="
				+ hourlyRate + ", hoursWorked=" + hoursWorked + ", isPartTime="
				+ isPartTime + "]\n";
	}

	// isEligibleForOvertime
	public boolean isEligibleForOvertime()
	{
		boolean eligible = false;
		if (hoursWorked > HOURS_REQUIRED_FOR_OVERTIME)
			eligible = true;
		
		return eligible;
	}
	
	// TODO 
	public double calculatePay()
	{
		double pay = 0;
		return pay;
	}

	// TODO 
	public static double computeTaxRate(int dependents, int exemptions)
	{
		double rate = 0.2;
		return rate;
	}
	
	// TODO 
	public static double calculateTotalPayroll(ArrayList<Employee> employees)
	{
		double payroll = 0;
		return payroll;
	}
}
