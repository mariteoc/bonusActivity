import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testSetTotalPaySmall40() {
		Employee emp = new Employee();
		int hour = 30;
		emp.setHours(hour);
		emp.setTotalPay();
		
		assertEquals(450.0,emp.getTotalPay(),0.02);
	}

	@Test
	void testSetTotalBig40() {
		Employee emp = new Employee();
		int hour = 50;
		emp.setHours(hour);
		emp.setTotalPay();
		
		assertEquals(765.0,emp.getTotalPay(),0.02);
	}

}
