package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Utils {

    public static String readPropertyArchive(String property) {

        Properties prop;
        String value = null;

        try {
            prop = new Properties();
            prop.load(new FileInputStream(new File("config.properties")));

            value = prop.getProperty(property);

            if (value == null || value.isEmpty()) {
                throw new Exception("Valor n�o configurado ou vazio!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return value;

    }


}
