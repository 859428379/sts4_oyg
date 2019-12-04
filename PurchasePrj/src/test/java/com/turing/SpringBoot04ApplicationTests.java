package com.turing;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot04ApplicationTests {

	@Autowired
	private DataSource ds;
	
	@Test
	void contextLoads() throws SQLException {
		System.out.println("ds:"+ds.getConnection());
	}

}
