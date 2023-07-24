package Log4JExamples;

import org.apache.logging.log4j.*;
public class Log4jXmlConfigurator {

	static Logger logger = Logger.getLogger(Log4jXmlConfigurator.class);
	
	public static void main(String[] args)
	{
		DOMConfigurator.configure("log4j.xml");
		Logger.debug("This is a debug message");
		Logger.info("This is an info");
		Logger.warn("This is a warning");
		Logger.error("This is an error");
		Logger.fatal("This is a fatal message");
		

	}

}
