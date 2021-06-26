package itji.example.jetty.client;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.http.HttpMethod;

public class MyClient {
	
	public static void main(String[] args) throws Exception {
		HttpClient httpClient = new HttpClient();
		httpClient.start();
		
		ContentResponse res = httpClient.newRequest("http://127.0.0.1:8080/").method(HttpMethod.GET).send();
		System.out.println(res.getContentAsString());
		System.exit(0);
	}

}
