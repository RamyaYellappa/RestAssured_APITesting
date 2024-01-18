package Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.restassured.http.ContentType;

public class DataDriven extends DataProvider {

//	@Test(dataProvider = "users")
//	 public void test_Post(String firstName,String lastName,int subjectId) {
//			JSONObject request=new JSONObject();
//			request.put("firstName",firstName );
//			request.put("lastName",lastName );
//			request.put("subjectId",subjectId );
//			
//			
//			baseURI="http://localhost:3000/";
//			given().
//			      contentType(ContentType.JSON).accept(ContentType.JSON).
//			      header("Content-Type","application/json").
//			      body(request.toJSONString()).
//			when().
//			      post("users").
//			then().
//			      statusCode(201).
//			      log().all();
//			
//	  }
//	
//	@Test(dataProvider = "delete")
//	public void test_Delete(int id) {
//		
//		baseURI="http://localhost:3000/";
//		when().
//		    delete("users/"+id).
//	    then().
//	        statusCode(200).log().all();
//	   
//	}
//	
    @Parameters({"id"})
	@Test
	public void test_Delete2(int id) {
		
    	System.out.println("value of id: "+id);
		baseURI="http://localhost:3000/";
		when().
		    delete("users/"+id).
	    then().
	        statusCode(200).log().all();
	   
	}


}


