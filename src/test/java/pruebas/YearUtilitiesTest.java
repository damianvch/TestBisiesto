package pruebas;

import bisiesto.YearUtilities;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Grupo03
 */
public class YearUtilitiesTest {
    @Test
    public void test1() {
        System.out.println("Test bisiesto...");
        assertTrue(YearUtilities.isLeap(4));//es bisiesto
    }

    @Test
    public void test2() {
        System.out.println("Test no bisiesto...");
        assertFalse(YearUtilities.isLeap(6));
    }
}
