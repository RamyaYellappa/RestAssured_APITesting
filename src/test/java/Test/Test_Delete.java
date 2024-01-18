package Test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Test_Delete {
	 
	@Test
	public void delete() {
		
		when().
		  delete("https://reqres.in/api/users/2").
		then().
		  statusCode(204).log().all();
		
	}

}
