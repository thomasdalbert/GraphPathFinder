package client;

import client.controller.GraphFileProcessor;
import client.view.GraphPrinter;
import client.view.error.ErrorLogger;

public class Main {

	public static void main( String[] args ) {

		new GraphFileProcessor( new GraphPrinter(), new ErrorLogger() ).processGraphFile( args[0] );

	}

}