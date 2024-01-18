package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DemoTest {
	
	@Test
	public void test1() {
		
		////GET method
		
		//Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		Response response=get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int statuscode=response.getStatusCode();
	    Assert.assertEquals(statuscode, 200);
	}
	@Test
	public void test2() {
		baseURI="https://reqres.in/api/";
		given().
		   get("users?page=2").
		then().
		   statusCode(200).
		   body("data[1].id",equalTo(8)).
		   body("data[0].id", equalTo(7)).
		   body("data[0].email",equalTo("michael.lawson@reqres.in"))
		   .log().all();
		
		
		
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
	}

}
