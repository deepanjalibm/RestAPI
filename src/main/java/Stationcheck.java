import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class Stationcheck {
    @Test
    public void testGetStationDataOn15thAprilAndValidateForStatusCode(){
        given().
                when().
                // get("https://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&date=04/15/2021&json=y").
                //then().
                        get("https://api.bart.gov/api/etd.aspx?cmd=etd&orig=RICH&key=MW9S-E7SL-26DU-VV8V&json=y").
                then().assertThat().assertThat().assertThat().statusCode(200);
                //header("color", "BEIGE");



    }
}
