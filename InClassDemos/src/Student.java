
public class Student
{
	// instance variables
	private String name;
	private String address;
	private double tuitionBalance;
	
	/**
	 * @param name
	 * @param address
	 * @param tuitionBalance
	 */
	public Student(String name, String address, double tuitionBalance)
	{
		this.name = name;
		this.address = address;
		this.tuitionBalance = tuitionBalance;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @return the address
	 */
	public String getAddress()
	{
		return address;
	}
	/**
	 * @return the tuitionBalance
	 */
	public double getTuitionBalance()
	{
		return tuitionBalance;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
	/**
	 * @param tuitionBalance the tuitionBalance to set
	 */
	public void setTuitionBalance(double tuitionBalance)
	{
		this.tuitionBalance = tuitionBalance;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Student [name=" + name + ", address=" + address
				+ ", tuitionBalance=" + tuitionBalance + "]\n";
	}


}
