import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;



public class Basics {

	public static void main(String[] args) {
		
		RestAssured.baseURI= "http://172.17.26.11:8045/";
		RestAssured.
		given().queryParam("supplier", "AIR_ARABIA").queryParam("credential_key", "prod_staging_IN_search_arabia_pdt_INTL").queryParam("debug", "1").header("Content-Type","application/json").body("{\r\n" + 
				"    \"roundTrip\": \"true\",\r\n" + 
				"    \"adults\": 1,\r\n" + 
				"    \"children\": 1,\r\n" + 
				"    \"infants\": 1,\r\n" + 
				"    \"returnDate\": null,\r\n" + 
				"    \"reSearch\": false,\r\n" + 
				"    \"isInternational\": true,\r\n" + 
				"    \"customerIP\": null,\r\n" + 
				"    \"cabinType\": \"ECONOMY\",\r\n" + 
				"    \"specialRT\": false,\r\n" + 
				"    \"parentId\": \"bc-e29cd3e8-bbfb-4839-8347-e59b56e1a53b\",\r\n" + 
				"    \"preferredAirlines\": [],\r\n" + 
				"    \"additionalAttributes\": {},\r\n" + 
				"    \"itineraryId\": null,\r\n" + 
				"    \"accountCodes\": [],\r\n" + 
				"    \"excludedAirlines\": [],\r\n" + 
				"    \"stopCount\": 1,\r\n" + 
				"    \"includeAirlines\": [\r\n" + 
				"        \"CX\"\r\n" + 
				"    ],\r\n" + 
				"    \"itineraryDetails\": [\r\n" + 
				"        {\r\n" + 
				"            \"origin\": \"BOM\",\r\n" + 
				"            \"destination\": \"SHJ\",\r\n" + 
				"            \"departDate\": \"2020-05-29\",\r\n" + 
				"            \"originNearbyAirports\": [],\r\n" + 
				"            \"destinationNearbyAirports\": [],\r\n" + 
				"            \"originRadialSearchCriteria\": null,\r\n" + 
				"            \"destinationRadialSearchCriteria\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"origin\": \"SHJ\",\r\n" + 
				"            \"destination\": \"BOM\",\r\n" + 
				"            \"departDate\": \"2020-05-31\",\r\n" + 
				"            \"originNearbyAirports\": [],\r\n" + 
				"            \"destinationNearbyAirports\": [],\r\n" + 
				"            \"originRadialSearchCriteria\": null,\r\n" + 
				"            \"destinationRadialSearchCriteria\": null\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"    \"cabinTypeCriteria\": {\r\n" + 
				"        \"includeAllClasses\": true,\r\n" + 
				"        \"cabinType\": \"ECONOMY\"\r\n" + 
				"    },\r\n" + 
				"    \"supplierCriteria\": {\r\n" + 
				"        \"name\": \"amadeus\",\r\n" + 
				"        \"accountCodes\": [],\r\n" + 
				"        \"bspPassedAirlines\": [\r\n" + 
				"            \"IT\"\r\n" + 
				"        ],\r\n" + 
				"        \"fareCriteria\": {\r\n" + 
				"            \"fareFamilyCriteriaList\": [],\r\n" + 
				"            \"corpFareCriteria\": null\r\n" + 
				"        },\r\n" + 
				"        \"numberOfRecommendations\": 120\r\n" + 
				"    },\r\n" + 
				"    \"roundTripItineraryRequest\": true,\r\n" + 
				"    \"international\": true\r\n" + 
				"}").when().log().all().post("v1/flights").then().assertThat().statusCode(200);
		
	}

}
