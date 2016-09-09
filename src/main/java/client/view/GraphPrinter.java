package client.view;

public class GraphPrinter implements IGraphPrinter {

	public void print( char[][] graph ) {
		for ( int i = 0; i < graph.length; ++i ) {
			for ( int j = 0; j < graph[i].length; j++ ) {
				System.out.print( graph[i][j] );
			}
			System.out.println();
		}
	}

}
