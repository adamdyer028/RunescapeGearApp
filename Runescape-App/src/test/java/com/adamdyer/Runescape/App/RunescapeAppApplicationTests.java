package com.adamdyer.Runescape.App;

import com.adamdyer.Runescape.App.domain.User;
import com.adamdyer.Runescape.App.repository.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
class RunescapeAppApplicationTests {
	@Autowired
	private UserRepository userRepository;

	@BeforeEach
	void setup() {
		User user = new User();
		user.setUsername("testUser");
		user.setPassword("testPassword");
		user.setEmail("test@example.com");
		user.setBirthDate(LocalDate.of(1996, 1, 1));
		user.setRsn("testRSN");
		userRepository.save(user);
	}
	@Test
	void testFindByUsername() {
		User retrievedUser = userRepository.findByUsername("testUser");
		assertNotNull("User is null", retrievedUser);
		assertEquals("Username doesn't match", "testUser", retrievedUser.getUsername());
	}
	@AfterEach
	void cleanup() {
		User user = userRepository.findByUsername("testUser");
		if (user != null) {
			userRepository.delete(user);
		}
	}
	@Test
	void contextLoads() {
	}


}
