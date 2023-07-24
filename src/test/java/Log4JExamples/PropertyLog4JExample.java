package Log4JExamples;

import org.apache.logging.log4j.*;

public class PropertyLog4JExample 
{
	
    static Logger logger=Logger.getLogger(PropertyLog4JExample.class)
	public static void main(String[] args)
    {
    	PropertyConfigurator.configure("log4j.properties")
    	Logger.debug("This is a debug message");
		Logger.info("This is an info");
		Logger.warn("This is a warning");
		Logger.error("This is an error");
		Logger.fatal("This is a fatal message");

	}

}
