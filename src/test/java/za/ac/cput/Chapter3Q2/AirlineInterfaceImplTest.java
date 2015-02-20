package za.ac.cput.Chapter3Q2;

import za.ac.cput.Chapter3Q2.AirlineImpl.AirlineInterfaceImpl;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class AirlineInterfaceImplTest {
    private AirlineInterface test;
    @Before
    public void setUp()
    {
        test = new AirlineInterfaceImpl();
    }
    @Test
    public void testAirline()
    {
        String msg = "Airline name: Mango\nAirline location: London";
        Assert.assertEquals("AirlineInterfaceImpl did not return the expected result",msg,test.airlineDetails("Mango","London"));
    }
    @After
    public void tearDown()
    {

    }
}
