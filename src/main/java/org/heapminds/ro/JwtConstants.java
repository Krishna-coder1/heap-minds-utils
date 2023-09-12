package org.heapminds.ro;

import lombok.Value;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JwtConstants {
     Properties properties = new Properties();

    public  String getSecret() throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream("application.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
            String SECRET_KEY = properties.getProperty("jwt.private.key");
            return  SECRET_KEY;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
