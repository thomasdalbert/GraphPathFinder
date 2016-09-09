package client.model.service;

import java.util.List;

import client.model.dataAccess.AuthorizedGraphCharsDAO;

public class GraphFormatChecker {

	private static final List<Character> AUTHORIZED_EVEN_LINE_CHARS = AuthorizedGraphCharsDAO.getEvenLineChars();
	private static final List<Character> AUTHORIZED_ODD_LINE_CHARS = AuthorizedGraphCharsDAO.getOddLineChars();
	private static char[][] graph = null;

	public static boolean isWellFormatted( char[][] graph ) {
		GraphFormatChecker.graph = graph;
		return evenLinesAreWellFormatted() && oddLinesAreWellFormatted() ?
			true :
			false;
	}

	private static boolean evenLinesAreWellFormatted() {
		for ( int i = 0; i < graph.length; i += 2 ) {
			for ( int j = 0; j < graph[i].length; ++j ) {
				if ( !AUTHORIZED_EVEN_LINE_CHARS.contains( graph[i][j] ) ) return false;
			}
		}
		return true;
	}

	private static boolean oddLinesAreWellFormatted() {
		for ( int i = 1; i < graph.length; i += 2 ) {
			for ( int j = 0; j < graph[i].length; ++j ) {
				if ( !AUTHORIZED_ODD_LINE_CHARS.contains( graph[i][j] ) ) return false;
			}
		}
		return true;
	}
}