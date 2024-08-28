package com.bridgelabz.Api_Testing1;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class ApiTesting1ApplicationTests {

	@BeforeAll
	public static void setup() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
	}

	@Test
	public void testGreetEndpoint() {
		given()
				.when()
				.get("/greet")
				.then()
				.statusCode(200)
				.body(equalTo("hello world"));
	}

}
