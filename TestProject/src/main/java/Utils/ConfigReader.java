package Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {
    private static final Properties properties;

    static {
        properties = new Properties();
    }

    public static Properties initialize_Properties(){

        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
            try {
                properties.load(fileInputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return getProperties();
    }

    public static Properties getProperties(){
        return properties;
    }


}
