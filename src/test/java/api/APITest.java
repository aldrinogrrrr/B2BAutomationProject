package api;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITest {

    public void TestAPI(){
        System.out.println("went here");
        RestAssured.baseURI = "https://energieportal-qa.bayernwerk.de/messdaten/";
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("fsaul@dxc.com");
        authScheme.setPassword("Password#1");
        RestAssured.authentication = authScheme;
        // Get the RequestSpecification of the request to be sent to the server.
        RequestSpecification httpRequest = RestAssured.given().log().all();
        // specify the method type (GET) and the parameters if any.
        Response response = httpRequest.request(Method.GET, "");
        //System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.asPrettyString());
        Headers headers = response.getHeaders();
//        int i = 0;
//        for(Header header : response.headers())
//        {
//            System.out.println("header  " +i + header.getName());
//            i++;
//        }




    }
}
