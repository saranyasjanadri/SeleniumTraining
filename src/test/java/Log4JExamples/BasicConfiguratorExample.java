package Log4JExamples;

import org.apache.logging.log4j.*;

public class BasicConfiguratorExample
{
	//Factory design  pattern-->Creating object for the logger class 
	//without new keyword
	//getLogger() creates one logger object and stores it in the Logger.
	static Logger logger = Logger.getLogger(BasicConfiguratorExample.class);
	
	public static void main(String[]args)
	{
		BasicConfigurator.configure();
		Logger.debug("This is a debug message");
		Logger.info("This is an info");
		Logger.warn("This is a warning");
		Logger.error("This is an error");
		Logger.fatal("This is a fatal message");
		
	}

}
