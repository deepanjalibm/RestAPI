import APIAssignment.SwaggerUser;
import APIAssignment.SwaggerUserCreationResponseDetails;
import io.restassured.http.ContentType;
//import jdk.jfr.ContentType;
import org.junit.Assert;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
//import org.testng.Assert;
//import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;



public class CreateSwaggerUser {

    @Test
    public void testCreatingASwaggerUser() {
            /*get: curl -X 'GET' \
            //  'https://petstore.swagger.io/v2/user/
            post: curl -X 'POST' \
            'https://petstore.swagger.io/v2/user' \
            -H 'accept: application/json' \
            -H 'Content-Type: application/json' \
            -d '{
            "id": 1,
                    "username": "Tina",
                    "firstName": "susan",
                    "lastName": "a",
                    "email": "tina@abc.com",
                    "password": "abcd",
                    "phone": "8787878787",
                    "userStatus": 1
        }'*/

        SwaggerUser swaggerUser = new SwaggerUser();
        SwaggerUserCreationResponseDetails responseDetails = new SwaggerUserCreationResponseDetails();
        swaggerUser.setUsername("Tina");
        swaggerUser.setFirstName("Kumari");
        swaggerUser.setLastName("Bnm");
        swaggerUser.setEmail("tina@abc.com");
        swaggerUser.setPassword("222222222");
        swaggerUser.setPhone("8787878787");
        swaggerUser.setUserStatus(200);

        responseDetails = given().

                contentType(JSON).
                body(swaggerUser).
                log().body().
                when().
                post("https://petstore.swagger.io/v2/user").
                as(SwaggerUserCreationResponseDetails.class);

        System.out.println("Response is : " + responseDetails.toString());
        Assert.assertEquals(200, responseDetails.getCode());
    }

    //ultiple user..> https://petstore.swagger.io/v2/user/createWithArray
    @Test
    public void testCreatingMultipleUser() {

        ArrayList<SwaggerUser> swaggeruserList = new ArrayList<SwaggerUser>();//Creating arraylist
        SwaggerUser swaggermultiUser = new SwaggerUser();
        SwaggerUser userTwoDataDetails = new SwaggerUser();
        SwaggerUserCreationResponseDetails responseDetails;
        //first user object data

        swaggermultiUser.setId(0);
        swaggermultiUser.setUsername("Meena");
        swaggermultiUser.setFirstName("Rani");
        swaggermultiUser.setLastName("MM");
        swaggermultiUser.setEmail("Meenarani@swager.com");
        swaggermultiUser.setPassword("123456");
        swaggermultiUser.setPhone("8989898989");
        swaggermultiUser.setUserStatus(0);
        swaggeruserList.add(swaggermultiUser);

        responseDetails =
                given().
                        contentType(JSON).
                        body(swaggeruserList).
                        log().body().
                        when().
                        post("https://petstore.swagger.io/v2/user/createWithArray").
                        as(SwaggerUserCreationResponseDetails.class);

        System.out.println("Checking response after users creation: " + responseDetails.toString());
        Assert.assertEquals(200, responseDetails.getCode());

    }
}



