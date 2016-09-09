package client.controller;

import java.io.IOException;

import client.model.dataAccess.GraphDAO;
import client.model.dataAccess.PropertiesDAO;
import client.model.service.GraphFormatChecker;
import client.view.IGraphPrinter;
import client.view.error.IErrorLogger;

public class GraphFileProcessor implements IGraphFileProcessor {

	private IGraphPrinter graphPrinter = null;
	private IErrorLogger errorLogger = null;

	public GraphFileProcessor( IGraphPrinter graphPrinter, IErrorLogger errorLogger ) {
		this.graphPrinter = graphPrinter;
		this.errorLogger = errorLogger;
	}

	public void processGraphFile( String path ) {
		try {
			char[][] formattedGraph = GraphDAO.getFormattedGraph( path );

			if ( GraphFormatChecker.isWellFormatted( formattedGraph ) ) {
				this.graphPrinter.print( formattedGraph );
			} else {
				this.errorLogger.printError( PropertiesDAO.getInstance().getProperty( "IncorrectGraphFileError" ) );
			}
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}
}