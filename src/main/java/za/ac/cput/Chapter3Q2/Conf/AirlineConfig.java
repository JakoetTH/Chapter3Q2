package za.ac.cput.Chapter3Q2.Conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Chapter3Q2.AirlineInterface;
import za.ac.cput.Chapter3Q2.AirlineImpl.AirlineInterfaceImpl;
import za.ac.cput.Chapter3Q2.AirlineImpl.AirlineInterfaceImpltwo;

@Configuration
public class AirlineConfig {
    @Bean(name="firstImpl")
    public AirlineInterface getAirlineImpl()
    {
        return new AirlineInterfaceImpl();
    }
    @Bean(name="secondImpl")
    public AirlineInterface getAirlineImpltwo()
    {
        return new AirlineInterfaceImpltwo();
    }
}
