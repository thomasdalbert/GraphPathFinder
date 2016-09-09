package client.model.dataAccess;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDAO {

	private static final PropertiesDAO instance = new PropertiesDAO();
	private static final String PATH_TO_PROPERTY_FILE = "src/main/java/client/.properties";
	private static final Properties properties = new Properties();
	private static boolean initialized = false;

	private PropertiesDAO() {}

	public static PropertiesDAO getInstance() {
		if ( !initialized ) {
			initialize();
		}
		return instance;
	}

	private static void initialize() {
		try {
			properties.load( new FileInputStream( PATH_TO_PROPERTY_FILE ) );
		} catch ( IOException e ) {
			e.printStackTrace();
		}
		initialized = true;
	}

	public String getProperty( String key ) {
		return properties.getProperty( key );
	}

}
