import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import pojo.AuthenticationPojo;
import pojo.RespAuthenticationpojo;
import utility.HeaderConfigs;

import static pojo.Constant.authentication_endpoint;
import static utility.ServiceTest.RESPONSE_STATUS_CODE_200;
import static utility.Utility.fetchvalue;

public class GenerateToken {

    @Test
    public static void GetAuthToken() {
        RestAssured.baseURI = fetchvalue("baseurlStaging");
        HeaderConfigs header = new HeaderConfigs();

        RequestSpecification request = RestAssured.given();
        AuthenticationPojo loginpojo = new AuthenticationPojo(fetchvalue("Email"), fetchvalue("Password"));
        request.headers(header.defaultHeaders());

        Response responseFromGenerateToken = request.body(loginpojo).post(authentication_endpoint);
        responseFromGenerateToken.prettyPrint();
        RespAuthenticationpojo d = responseFromGenerateToken.getBody().as(RespAuthenticationpojo.class);

        Assertions.assertEquals(RESPONSE_STATUS_CODE_200, responseFromGenerateToken.getStatusCode());
        Assertions.assertEquals(d.getEmail(), fetchvalue("Email"));
        System.out.println(d.getToken());
    }
}
