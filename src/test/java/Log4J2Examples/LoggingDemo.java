package Log4J2Examples;

import org.apache.logging.log4j.*;

public class LoggingDemo
{
	private static Logger demologger=LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args)
	{
		//If no configuration file could be located the DefaultConfiguration
		//will be used.This will cause logging output to go to the console.
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.debug("This is debug");
		demologger.fatal("This is fatal");
	}

}
