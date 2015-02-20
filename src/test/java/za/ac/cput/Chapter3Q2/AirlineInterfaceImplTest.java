package za.ac.cput.Chapter3Q2;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import za.ac.cput.Chapter3Q2.AirlineImpl.AirlineInterfaceImpl;
import za.ac.cput.Chapter3Q2.Conf.AirlineConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirlineInterfaceImplTest {
    private AirlineInterface test;
    private ApplicationContext config;
    @Before
    public void setUp()
    {
        config = new AnnotationConfigApplicationContext(AirlineConfig.class);
        test = (AirlineInterfaceImpl)config.getBean("firstImpl");
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
