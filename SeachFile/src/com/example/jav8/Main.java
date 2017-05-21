package com.example.jav8;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Path path = FileSystems.getDefault().getPath("files", "hamlet.txt");
		String searchTerm = "To be, or not to be";
		try(Stream<String> lines = Files.lines(path)){
			Optional<String> line = lines.filter(l->l.contains(searchTerm)).findFirst();
			if(line.isPresent()){
				System.out.println("Found : "+line.get());
			}
			else{
				System.out.println("Not found");
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
	}
}
