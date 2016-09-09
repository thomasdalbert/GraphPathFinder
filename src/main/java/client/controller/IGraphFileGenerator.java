package client.controller;

import java.nio.file.Path;

public interface IGraphFileGenerator {

	Path generateGraphFile( int lenght, int width, byte density );
	
}
