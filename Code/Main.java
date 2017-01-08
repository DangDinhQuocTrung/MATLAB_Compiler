import java_cup.runtime.*;
import java.io.*;
import java.io.FileReader;
import java.io.File;

class Main {
	public static void main(String[] argv) throws Exception {
		System.out.println("Source code file:");
		File file = new File("test.txt");
		FileReader fileReader = new FileReader(file);
		Parser parser = new Parser(new Lexer(fileReader));
		Expr root = (Expr) parser.parse().value;
		
		Double v = root.eval();
		System.out.println("Value: " + v);
		System.out.print("Postfix: ");
		root.postfix();
		System.out.println("");
	}
}