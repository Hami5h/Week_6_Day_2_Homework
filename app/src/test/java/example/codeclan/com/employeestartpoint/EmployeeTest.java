package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    Employee employee;

    @Before
    public void before() {
        employee = new Employee(1, "Wilma", "AB123456C", 30000.00 );
    }

    @Test
    public void canGetEmployeeId() {
        assertEquals(1, employee.getId());
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals("Wilma", employee.getName());
    }

    @Test
    public void canGetEmployeeSSn() {
        assertEquals("AB123456C", employee.getSocialSecurityNumber());
    }

    @Test
    public void canSetEmployeeName() {
        employee.setName("Betty");
        assertEquals("Betty", employee.getName());
    }

}