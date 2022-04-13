import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testSetTotalPaySmall40() {
		Employee emp = new Employee();
		int hour = 30;
		emp.setTotalPay(hour);
		
		assertEquals(450.0,emp.getTotalPay(),0.02);
	}

	@Test
	void testSetTotalBig40() {
		Employee emp = new Employee();
		int hour = 50;
		emp.setTotalPay(hour);
		
		assertEquals(765.0,emp.getTotalPay(),0.02);
	}

}
