package com.finepointmobile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by danielmalone on 7/24/17.
 */
public class URLReader {

    public static String fetch() throws IOException {
        URL url = new URL("https://finepointmobile.com/");

        URLConnection connection = url.openConnection();
        connection.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String inputLine;
        while ((inputLine = reader.readLine()) != null) {
            reader.close();
            return inputLine;
        }
        return null;
    }
}
