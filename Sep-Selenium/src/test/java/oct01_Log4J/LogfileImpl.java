package oct01_Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class LogfileImpl {

	public Logger log = LogManager.getLogger(LogfileImpl.class.getName());
	@Test
	public void Print() {
		log.debug("i am from debug");
		log.error("i am from error");
		log.info("i am from info");
		log.fatal("i am from fatal===");
		System.out.println("we are done");
	}

	
}
