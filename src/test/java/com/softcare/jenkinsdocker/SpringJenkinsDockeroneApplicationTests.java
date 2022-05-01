package com.softcare.jenkinsdocker;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsDockeroneApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDockeroneApplicationTests.class);
	@Test
	void contextLoads() {
		assertEquals(true,true);
	}

}
