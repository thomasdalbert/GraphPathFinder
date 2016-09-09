package client.model.dataAccess;

import java.util.ArrayList;
import java.util.List;

public abstract class AuthorizedGraphCharsDAO {

	private final static String SEPARATOR = PropertiesDAO.getInstance().getProperty( "Separator" );

	public static List<Character> getEvenLineChars() {
		final String authorizedEvenCharacters = PropertiesDAO.getInstance().getProperty( "EvenGraphChars" ).replace( SEPARATOR, "" );
		return generateListFromString( authorizedEvenCharacters );
	}

	public static List<Character> getOddLineChars() {
		final String authorizedOddCharacters = PropertiesDAO.getInstance().getProperty( "OddGraphChars" ).replace( SEPARATOR, "" );
		return generateListFromString( authorizedOddCharacters );
	}
	
	private static List<Character> generateListFromString( String authorizedCharacters ) {
		final List<Character> authorizedCharacterList = new ArrayList<Character>();
		
		for ( int i = 0; i < authorizedCharacters.length(); ++i ) {
			authorizedCharacterList.add( authorizedCharacters.charAt( i ) );
		}

		return authorizedCharacterList;
	}
}