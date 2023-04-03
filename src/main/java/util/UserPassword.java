package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UserPassword {
    public static List<String> getEmailPassword() throws IOException {
        List<String> credenciales = new ArrayList<>();
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("src/test/resources/file.properties")));
        credenciales.add(properties.getProperty("USER"));
        credenciales.add(properties.getProperty("PASSWORD"));
        return credenciales;
    }
}
