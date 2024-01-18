package Test;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_GET {
	
	@Test
	public void test1() {
	given().	
		get("https://reqres.in/api/users?page=2").
	then().
	    statusCode(200).
	    log().all().
	    body("data[5].id",equalTo(12)).
	    body("data[3].id", equalTo(10)).
	    body("data.first_name",hasItems("Lindsay","Tobias"));
	}
	

}
