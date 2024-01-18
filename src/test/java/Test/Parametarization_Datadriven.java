package Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Parametarization_Datadriven {
	
	@DataProvider(name="users")
	public Object[][] dataForPost() {
		//it follows the excel format
		
		Object[][] data=new Object[2][3];
		data[0][0]="priya";
		data[0][1]="Venk";
		data[0][2]=2;
		
		data[1][0]="FDgfd";
		data[1][1]="gfhfh";
		data[1][2]=2;
		
		return data;
				
		
		
	}
	
	
	@Test(dataProvider = "users")
	 public void test_Post(String firstName,String lastName,int subjectId) {
			JSONObject request=new JSONObject();
			request.put("firstName",firstName );
			request.put("lastName",lastName );
			request.put("subjectId",subjectId );
			
			
			baseURI="http://localhost:3000/";
			given().
			      contentType(ContentType.JSON).accept(ContentType.JSON).
			      header("Content-Type","application/json").
			      body(request.toJSONString()).
			when().
			      post("users").
			then().
			      statusCode(201).
			      log().all();
			
	  }

}
