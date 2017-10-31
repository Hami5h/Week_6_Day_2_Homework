package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hamishstewart on 31/10/2017.
 */

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager(1, "Fred", "AB112233", 36000.00, "Argos");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Argos", manager.getDeptName());
    }
}
