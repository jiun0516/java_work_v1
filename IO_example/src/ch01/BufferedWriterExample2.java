package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample2 {

	public static void main(String[] args) {
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("output2.txt"));
			writer.write("Hello, world");
			writer.newLine();
			writer.write("안녕하세요");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
