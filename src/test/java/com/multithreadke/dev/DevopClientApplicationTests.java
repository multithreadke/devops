package com.multithreadke.dev;

import com.multithreadke.dev.model.Result;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DevopClientApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void queryAPIStatus() {
	    Result validate = new Result(true, "200", "Success");
		Result response = restTemplate.getForObject("http://localhost:" + port + "/api/v1/status", Result.class);
		Assert.assertNotEquals(validate, response);
	}
}
