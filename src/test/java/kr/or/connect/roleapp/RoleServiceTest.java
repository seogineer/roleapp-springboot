package kr.or.connect.roleapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.or.connect.roleapp.dto.Role;
import kr.or.connect.roleapp.service.RoleService;

@SpringBootTest
public class RoleServiceTest {
	@Autowired
	RoleService roleService;
	
	@Test
	public void getRoles() throws Exception {
		List<Role> roles = roleService.getRoles();
		assertEquals(roles.size(), 3);
	}
}
