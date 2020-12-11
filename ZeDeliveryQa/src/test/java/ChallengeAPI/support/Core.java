package ChallengeAPI.support;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

import ChallengeAPI.objects.ApiEnvironment;

public class Core extends ApiEnvironment {

    @BeforeClass
    public static void setup()
    {
        RestAssured.baseURI = baseURL;
        RestAssured.basePath = basePath;

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
