package client.model.dataAccess;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public abstract class TextFileDAO {

	public static List<String> getFileContent( String path ) throws IOException {
		return Files.readAllLines( Paths.get( path ), Charset.forName( "UTF-8" ) );
	}

}
