package utility;


import org.apache.logging.log4j.*;

public class Log4j_demo {
	
	
	
	private static Logger log = LogManager.getLogger(Log4j_demo.class.getName());
	
	
	public static void main (String aa[])
	{
		
		log.debug("This is debug");
	
		
		log.info("object is present");
		log.error("object is not present");
		log.fatal(" fatal");
		
		
	}

}

