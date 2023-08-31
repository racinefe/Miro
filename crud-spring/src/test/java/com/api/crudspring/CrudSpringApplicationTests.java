package com.api.crudspring;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class CrudSpringApplicationTests {

	@Test
	void contextLoads() {
		 assertTrue(true); 
	}

}