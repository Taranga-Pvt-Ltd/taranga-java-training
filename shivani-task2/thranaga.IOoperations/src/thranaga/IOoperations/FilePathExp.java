package thranaga.IOoperations;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FilePathExp {
	public static void main(String[] args) throws IOException, URISyntaxException {
		File file = new File("/Users/USER/test.txt");
		printPaths(file);
		// relative path
		file = new File("test.xsd");
		printPaths(file);
		// complex relative paths
		file = new File("/Users/USER/../pankaj/test.txt");
		printPaths(file);
		// URI paths
		file = new File(new URI("file:///Users/USER/test.txt"));
		printPaths(file);
	}

	private static void printPaths(File file) throws IOException {
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("Canonical Path: " + file.getCanonicalPath());
		System.out.println("Path: " + file.getPath());
	}

}
