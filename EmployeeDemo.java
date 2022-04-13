import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		String empName;
		int hours;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee name");
		empName = input.next();
		System.out.println("Enter employee hours");
		hours = input.nextInt();
		
		Employee emp1 = new Employee(empName,hours);
		
		System.out.println("The employee " + emp1.getName() + " worked a total of " +
		emp1.getHours() + ". The total payment is " + emp1.getTotalPay());
	

	}

}
