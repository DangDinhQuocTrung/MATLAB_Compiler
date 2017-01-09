package ast;

import java.util.*;
import ast.sm.*;

public class Program {
	private LinkedList<Statement> list = new LinkedList<>();
	
	public Program(LinkedList<Statement> list) {
		this.list = list;
	}
	
	public void run() {
		for (Statement s : list) {
			s.run();
		}
	}
}