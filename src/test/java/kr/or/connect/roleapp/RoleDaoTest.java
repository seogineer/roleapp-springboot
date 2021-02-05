package kr.or.connect.roleapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.or.connect.roleapp.dao.RoleDao;
import kr.or.connect.roleapp.dto.Role;

@SpringBootTest
public class RoleDaoTest {
	
	@Autowired
	RoleDao roleDao;
	
	@Test
	public void selectAll() throws Exception {
		List<Role> roles = roleDao.selectAll();
		assertEquals(roles.size(), 3);
		for(Role role : roles) {
			System.out.println(role);
		}
	}
}
