/*
 * Copyright (C) 2015 Arón Vargas Hernández <aronvargas83@gmail.com>
 * UNED <avargas98@alumno.uned.es>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package timemanager.enums;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arón Vargas Hernández <aronvargas83@gmail.com>
 */
public class TimeInvestMeasureUnitsTest {
    
    public TimeInvestMeasureUnitsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class TimeInvestMeasureUnits.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        TimeInvestMeasureUnits[] expResult = null;
        TimeInvestMeasureUnits[] result = TimeInvestMeasureUnits.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class TimeInvestMeasureUnits.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        TimeInvestMeasureUnits expResult = null;
        TimeInvestMeasureUnits result = TimeInvestMeasureUnits.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConvertUnits method, of class TimeInvestMeasureUnits.
     */
    @Test
    public void testConvertUnits() {
        System.out.println("ConvertUnits");
        float units = 0.0F;
        TimeInvestMeasureUnits originalValue = null;
        TimeInvestMeasureUnits finalValue = null;
        float expResult = 0.0F;
        float result = TimeInvestMeasureUnits.ConvertUnits(units, originalValue, finalValue);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
