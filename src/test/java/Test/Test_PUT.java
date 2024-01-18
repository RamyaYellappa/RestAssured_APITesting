package Test;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_PUT {
	
	@Test
	public void test1() {
		
//		HashMap data=new HashMap();
//		data.put("name", "ramya");
//		data.put("job", "tester");
//		
	JSONObject request1 =new JSONObject();
	request1.put("name", "ramya");
	request1.put("job", "tester");
	System.out.println(request1);
		
		given().
		   contentType("application/json").
		   body(request1.toJSONString())
		.when()
		   .put("https://reqres.in/api/users/2")
		.then().
		    statusCode(200).
		    log().all();
		
		
	}

}
