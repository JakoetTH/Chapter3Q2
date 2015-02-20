package za.ac.cput.Chapter3Q2;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import za.ac.cput.Chapter3Q2.AirlineImpl.AirlineInterfaceImpltwo;
import za.ac.cput.Chapter3Q2.Conf.AirlineConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirlineInterfaceImpltwoTest {
    private AirlineInterface test;
    private ApplicationContext config;
    @Before
    public void setUp()
    {
        config = new AnnotationConfigApplicationContext(AirlineConfig.class);
        test = (AirlineInterfaceImpltwo)config.getBean("secondImpl");
    }
    @Test
    public void testAirline()
    {
        String msg = "Airline name: Mango\nAirline location: London\nEnjoy the rest of your day.";
        Assert.assertEquals("AirlineInterfaceImpl did not return the expected result",msg,test.airlineDetails("Mango","London"));
    }
    @After
    public void tearDown()
    {

    }
}

