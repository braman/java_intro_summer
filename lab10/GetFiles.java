import java.io.*;

public class GetFiles {
	
	public static void readFiles(String filePath) throws IOException {
		File f = new File(filePath);
		System.out.println(filePath);
		if (f.isFile()) {
			return;
		}	
		for (File fi:f.listFiles()) {
			System.out.println(fi.getName());
			if (fi.isDirectory()) {
				readFiles(fi.getAbsolutePath());
			} 
		}
		
	}

	public static void main(String args[]) throws IOException {
		readFiles("/Users/raman/Documents/");
	}

}
