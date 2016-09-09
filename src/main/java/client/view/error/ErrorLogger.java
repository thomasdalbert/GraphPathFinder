package client.view.error;

public class ErrorLogger implements IErrorLogger {

	@Override
	public void printError( String error ) {
		System.err.println( error );
	}

}