package esercizi.junior.javadeveloper.esercizi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Router 
{
	private static final Logger logger = LoggerFactory.getLogger(Router.class);
	/**
	 * Simple main method used to start spring boot application
	 * @param args
	 */
    public static void main( String[] args )
    {
    	logger.debug("Init main");
    	SpringApplication.run(Router.class, args);
    	logger.debug("Exit main");
    }
}
