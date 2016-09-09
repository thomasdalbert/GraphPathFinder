package client.model.util;

import java.util.Random;

public class MathUtil implements IMathUtil {

	
	public boolean isEven( int number ) {
		if ( number % 2 == 0 )
			return true;
		else 
			return false;
	}

	public byte randomNumber( int maximum ) {
		Random randomNumber = new Random();
		return (byte) randomNumber.nextInt( maximum );
	}

}
