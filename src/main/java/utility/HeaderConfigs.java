package utility;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.AuthenticationPojo;
import pojo.RespAuthenticationpojo;

import java.util.HashMap;
import java.util.Map;

import static pojo.Constant.authentication_endpoint;
import static utility.Utility.fetchvalue;

public class HeaderConfigs {
	
	public HeaderConfigs() {
		
	}
	public static String GetAuthToken() {
		RestAssured.baseURI = fetchvalue("baseurlStaging");
		HeaderConfigs header = new HeaderConfigs();

		RequestSpecification request = RestAssured.given();
		AuthenticationPojo loginpojo = new AuthenticationPojo(fetchvalue("Email"), fetchvalue("Password"));
		request.headers(header.defaultHeaders());

		Response responseFromGenerateToken = request.body(loginpojo).post(authentication_endpoint);
		responseFromGenerateToken.prettyPrint();
		RespAuthenticationpojo d = responseFromGenerateToken.getBody().as(RespAuthenticationpojo.class);

		System.out.println(d.getToken());

		return d.getToken();
	}

	public Map<String, String> defaultHeaders(){
		Map<String, String> defalutHeaders = new HashMap<String, String>();
		defalutHeaders.put("Content-Type", "application/json");
		return defalutHeaders;
	}

	public Map<String, String> headersWithToken(){
		Map<String, String> defalutHeaders = new HashMap<String, String>();
		defalutHeaders.put("Content-Type", "application/json");
		defalutHeaders.put("Authorization", GetAuthToken());
		return defalutHeaders;
	}
}
