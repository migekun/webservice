package asbaprin.ws.aoe.test;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class AgeOfEmpiresStructureTest {

	public static void main(String[] args) {
		HttpURLConnection connection = null;
		try {
			URL url = new URL("https://age-of-empires-2-api.herokuapp.com/api/v1/structure/1");
			connection = (HttpURLConnection) url.openConnection();
			if (connection.getResponseCode() != HttpURLConnection.HTTP_OK)
				throw new RuntimeException("Error de conexión");
			InputStream stream = connection.getInputStream();
			Scanner scanner = new Scanner(stream).useDelimiter("\\A");
			String resultJSON = scanner.hasNext() ? scanner.next():"";
			System.out.println("JSON DE STRUCTURE Barracks: " + resultJSON);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) connection.disconnect();
		}

	}

}
