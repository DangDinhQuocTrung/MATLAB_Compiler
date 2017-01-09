import java_cup.runtime.*;
import java.io.*;
import java.io.FileReader;
import java.io.File;
import ast.*;

class Main {
	public static void main(String[] argv) throws Exception {
		System.out.println("Reading source code file");
		File file = new File("test.txt");
		FileReader fileReader = new FileReader(file);
		Parser parser = new Parser(new Lexer(fileReader));
		Program root = (Program) parser.parse().value;
		
		Double v = root.eval();
		System.out.println("Value: " + v);
		System.out.println("");
	}
}