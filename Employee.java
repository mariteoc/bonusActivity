
public class Employee {
	private String name;
	private int hours;
	private double totalPay;
	final double NORMAL_HOURS = 15.0;
	final double OVERTIME = 16.5;
	
	public Employee() {
		
	}
	
	public Employee(String nameEmp, int hoursEmp) {
		
		name = nameEmp;
		hours = hoursEmp;
		setTotalPay(hours);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(int hours) {
		double total;
		int overtimeHours;
		
		if (hours > 40)
		{
			total = 40 * NORMAL_HOURS;
			overtimeHours = hours - 40;
			total += overtimeHours * OVERTIME;
		}
		else
		{
			total = hours * NORMAL_HOURS;
		}
		
		this.totalPay = total;
	}
	
	
	
	

}
