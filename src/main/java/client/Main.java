package client;

import java.nio.file.Path;

import client.controller.GraphFileGenerator;
import client.controller.GraphFileProcessor;
import client.view.GraphPrinter;
import client.view.error.ErrorLogger;

public class Main {

	public static void main( String[] args ) {

		Path filePath = new GraphFileGenerator().generateGraphFile( 3, 3, (byte) 100 );
		new GraphFileProcessor( new GraphPrinter(), new ErrorLogger() ).processGraphFile( filePath.toString() );

	}

}