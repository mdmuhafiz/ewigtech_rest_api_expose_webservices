package com.ewigtech;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.ewigtech.entity.LetsWorkTogether;
import com.ewigtech.repository.LetsWorkTogetherRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LetsWorkTogetherRepositoryTest {
	@Autowired
	private LetsWorkTogetherRepository letsWorkRepo;
	@Test
	public void saveOneData() {
		LetsWorkTogether l = new LetsWorkTogether("tom","tom@gmail.com","Software Development","I want to know about services in detail");
		letsWorkRepo.save(l);
	}

}
