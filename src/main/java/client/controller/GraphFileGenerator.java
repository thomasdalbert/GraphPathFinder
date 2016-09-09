package client.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import client.model.util.IMathUtil;;

public class GraphFileGenerator implements IGraphFileGenerator {
	
	private IMathUtil mathUtil;

	private Path filePath = null;
	private char[][] fileContent = null;
	
	public GraphFileGenerator(){}
	
	public Path generateGraphFile( int lenght, int width, byte density ){
		createFileContent( lenght, width, density );
		createFile();
		fillFile( filePath, fileContent );
		return filePath;
	}

	// Prototype who will not support splitting branches
	private void createFileContent( int lenght, int width, byte density ){
		for ( int i = 0; i > lenght; i++ ){
			for ( int j = 0; j > width; j++ ){
				if ( mathUtil.isEven(j) )
					fileContent[i][j] = 'o';
				else
					fileContent[i][j] = '-';
			}
			if ( mathUtil.randomNumber(100) > density ){
				i++;
			}
		}
	}

	private void createFile(){
		filePath = Paths.get( "foo.txt" );
	}
	
	private void fillFile( Path filePath, char[][] fileContent ){
		// Files.write(filePath, fileContent, Charset.forName( "UTF-8" ));
	}

}