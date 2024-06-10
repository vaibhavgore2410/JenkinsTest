package com.gore.HttpsUrlConnect;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class JenkinsTestApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsTestApplication.class);


	@Test
	void contextLoads() {
		assertEquals(true, true);
		logger.info("Test Case executed!");
	}

}
