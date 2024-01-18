package Test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_DummyURL {
	
	@Test
	public void test_Get() {
		baseURI="http://localhost:3000/";
		
		given().
		    param("firstName","Ramya").
		    get("users").
		    
		then().
		   statusCode(200).
		   log().all();
		
	}
	@Test(priority = 0)
  public void test_Post() {
		JSONObject request=new JSONObject();
		request.put("firstName", "test");
		request.put("lastName", "fdsdf");
		request.put("subjectId", 1);
		
		
		baseURI="http://localhost:3000/";
		given().
		      contentType(ContentType.JSON).accept(ContentType.JSON).
		      header("Content-Type","application/json").
		      body(request.toJSONString()).
		when().
		      post("users").
		then().
		      statusCode(201).log().all();
		
  }
	
	@Test(priority = 0)
	  public void test_Put() {
			JSONObject request=new JSONObject();
			request.put("firstName", "Jee");
			request.put("lastName", "Jeeva");
			request.put("subjectId", 1);
			
			
			baseURI="http://localhost:3000/";
			given().
			      contentType(ContentType.JSON).accept(ContentType.JSON).
			      header("Content-Type","application/json").
			      body(request.toJSONString()).
			      
			when().
			      put("users/4").
			then().
			      statusCode(200).log().all();
			
		  
	  }
	@Test(priority = 0)
	  public void test_Patch() {
			JSONObject request=new JSONObject();
			
			request.put("lastName", "Test");
			
			
			
			baseURI="http://localhost:3000/";
			given().
			      contentType(ContentType.JSON).accept(ContentType.JSON).
			      header("Content-Type","application/json").
			      body(request.toJSONString()).
			      
			when().
			      patch("users/1").
			then().
			      statusCode(200).log().all();
			
		  
	  }
	@Test
	public void test_Delete() {
		
		baseURI="http://localhost:3000/";
		when().
		    delete("users/4").
	    then().
	        statusCode(200).log().all();
	   
	}
}
