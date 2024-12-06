package Sample_Assured.Sample_Assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_request {
	
	@Test
    public void ValidateGETrequest () {
    	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
    	System.out.println(response.getStatusCode());
    	
    
       
    }
}
