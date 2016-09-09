package client.controller;

import java.io.IOException;

public interface IGraphFileGenerator {

	void generateGraphFile( int lenght, int width, byte density ) throws IOException;
}
