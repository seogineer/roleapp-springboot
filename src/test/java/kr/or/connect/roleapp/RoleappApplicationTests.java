package kr.or.connect.roleapp;

import java.sql.Connection;

import javax.sql.DataSource;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RoleappApplicationTests {
	
	@Autowired
	DataSource dataSource;
	
	@Test
	public void connectionTest() throws Exception {
		Connection conn = dataSource.getConnection();
		Assertions.assertThat(conn).isNotNull();
		if(conn != null) {
			System.out.println("conn ok!!");
		}
		conn.close();
	}
	
	@Test
	void contextLoads() {
	
	}

}
