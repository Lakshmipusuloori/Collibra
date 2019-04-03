package getRequest;
import org.testng.Assert;
import org.testng.annotations.Test;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	
	public class GetComments
	{
		@Test
	public void testResponsecode()
	{
				Response resp = RestAssured.get("https://jsonplaceholder.typicode.com/comments");

			int code = resp.getStatusCode();
	System.out.println("Status code is" + code);
	Assert.assertEquals(code, 200);
	}
		@Test
		public void testbody()
		{
			
			Response resp = RestAssured.get("https://jsonplaceholder.typicode.com/comments?email=Jayne_Kuhic@sydney.com");
			String data = resp.asString();
		System.out.println("body is " + data);
		Assert.assertEquals(data, "email:Jayne_Kuhic@sydney.com");
		System.out.println("Response time is :" +resp.getTime());
		
}
	}
