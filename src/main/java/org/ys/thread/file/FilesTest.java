package org.ys.thread.file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesTest {
	
	public static void main(String[] args) {
		try {
			Path path = Paths.get("D:", "fileTest","files.txt");
			boolean exists = Files.exists(path);
			if(!exists){
				Files.createFile(path);
			}
			BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardCharsets.UTF_8,StandardOpenOption.APPEND);
			bufferedWriter.write("this is nio test! ");
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
