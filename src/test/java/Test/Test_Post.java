package Test;

import org.json.simple.JSONObject;
import org.json.simple.JSONObject.*;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class Test_Post {
	

	/*
	 * given()
	 *  --content type,set cookies, add authentication,add param,set headers
	 * 
	 * when()
	 * ---get,post,put,delete
	 * 
	 * then()
	 * -----validate status code,extract response, extract headers,cookies,response body
	 */
	
	@Test
	public void test1() {
		
		//for post method data parser : gson,jackson,json,json simply for dependency
	   //1st way	
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "ramya");
		map.put("job", "Tester");
		System.out.println(map);
		JSONObject request =new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		
		//2nd way without map
		JSONObject request1 =new JSONObject();
		request1.put("name", "r");
		request1.put("job", "t");
		System.out.println(request1);
		
	}	
	@Test
		public void test2() {
			
//			HashMap data=new HashMap();
//			data.put("name", "ramya");
//			data.put("job", "tester");
//			
		JSONObject request1 =new JSONObject();
		request1.put("name", "r");
		request1.put("job", "t");
		System.out.println(request1);
			
			given().
			   contentType("application/json").
			   body(request1.toJSONString())
			.when()
			   .post("https://reqres.in/api/users")
			.then().
			    statusCode(201).
			    log().all();
			
			
		}
		
		
	
		
	}


