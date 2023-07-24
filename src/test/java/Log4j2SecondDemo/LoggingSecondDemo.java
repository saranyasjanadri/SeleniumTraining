package Log4j2SecondDemo;

import org.apache.logging.log4j.*;

public class LoggingSecondDemo
{
	private static Logger demologger=LogManager.getLogger(LoggingSecondDemo.class);
	public static void main(String[] args)
	{
		//If no configuration file could be located the DefaultConfiguration
		//will be used.This will cause logging output to go to the console.
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
		demologger.info("Click is successful");
		demologger.error("DB connection failed");
	}

}
