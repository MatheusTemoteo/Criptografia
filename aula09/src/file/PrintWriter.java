package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter {
	public static void main(String[] args) throws IOException {
		// set up file and stream
		Arquivo arq = new Arquivo("sample3.data");
		File outFile = arq.file;
		FileOutputStream outFileStream = new FileOutputStream(outFile);
		PrintWriter outStream = new PrintWriter(outFileStream);
		// write values of primitive data types to the stream
		outStream.println(987654321);
		outStream.println(11111111L);
		outStream.println(22222222F);
		outStream.println(33333333D);
		outStream.println('A');
		outStream.println(true);
		// output done, so close the stream
		outStream.close();
	}
}
