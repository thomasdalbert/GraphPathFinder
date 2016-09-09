package client.model.dataAccess;

import java.io.IOException;
import java.util.List;

public abstract class GraphDAO {

	private static char[][] graph = null;

	public static char[][] getFormattedGraph( String pathToGraphFile ) throws IOException {
		final List<String> fileLines = TextFileDAO.getFileContent( pathToGraphFile );
		graph = new char[ fileLines.size() ][];
		
		fillGraph( fileLines );

		return graph;
	}

	private static void fillGraph( List<String> lines ) {		
		int i = 0;		
		for ( String line : lines ) {
			graph[i] = line.toCharArray();
			++i;
		}
	}

}