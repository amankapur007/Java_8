package com.example.java8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) throws ScriptException, FileNotFoundException {
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		
		File f = new File("scripts/readurl.js");
		Reader reader = new FileReader(f);
		
		Object result = engine.eval(reader);
		System.out.println(result);
	}
}
