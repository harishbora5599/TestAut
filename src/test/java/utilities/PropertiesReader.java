package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private static final String CONFIGFILEPATH = "./config.properties";
    private static final String LOCATORFILEPATH = "src//test//java//Locator//locator.properties";
    private static final String TESTDATALOCALFILEPATH = "src//test//java//testdata//testdata_local.properties";
    private static final String TESTDATASITFILEPATH = "src//test//java//testdata//testdata_local.properties";
    static Properties properties = new Properties();
    public static String getValue(String key) throws Exception {

        File file = new File(CONFIGFILEPATH);
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        return properties.getProperty(key);
    }

    public Long getTimeout() throws Exception {
        String timeout = PropertiesReader.getValue("timeout");
        return Long.parseLong(timeout);
    }

    public static String locator_Values(String value) throws IOException {
        File file = new File(LOCATORFILEPATH);
        FileInputStream in= new FileInputStream(file);
        properties.load(in);
        return properties.getProperty(value);

    }

    public static String test_Data_Values(String value) throws Exception {
        File file = null;
        if(PropertiesReader.getValue("Env").equalsIgnoreCase("Local")) {
            file= new File(TESTDATALOCALFILEPATH);
        }
        else if(PropertiesReader.getValue("Env").equalsIgnoreCase("SIT")) {
            file= new File(TESTDATASITFILEPATH);
        }
        FileInputStream in= new FileInputStream(file);
        properties.load(in);
        return properties.getProperty(value);

    }
}