package CopyFile;

/**
 * Write a program for file copy.
 * Create an input stream and out put stream objects on the array of bytes.
 * 
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {

		FileInputStream in = null; // Input stream
		FileOutputStream out = null; // output stream
		try { // Try block
			File source = new File("E:/Java.txt"); // Creating source file
			File destination = new File("E:/Videos/zyz.txt"); // Creating destination file
			
																
			in = new FileInputStream(source); // input stream object
			out = new FileOutputStream(destination); // output stream object
			byte[] buf = new byte[1024]; // array of bytes
			int bytesRead;
			while ((bytesRead = in.read(buf)) > 0) { // while loop is used to read and write from a file
														
														
				out.write(buf, 0, bytesRead);
				System.out.println("File copied successfully!!");

			}

		} catch (IOException ioe) { // To catch the input and output exceptions
			System.err.println("File doesn't copied !!");
		} finally { // Finally Block is created to close input and output stream
			if (in != null) {
				in.close();
			}

			if (out != null) {
				out.close();
			}
		}
	}

}
