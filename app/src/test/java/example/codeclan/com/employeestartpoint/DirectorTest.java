package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hamishstewart on 31/10/2017.
 */

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director(6, "Allan", "AB114433", 56000.00, "Argos", 120000);
    }

    @Test
    public void canGetBudget() {
        assertEquals(120000, director.getBudget(), 0.01);
    }
}
