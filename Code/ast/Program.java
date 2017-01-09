package ast;

import java.util.*;
import ast.sm.*;

public class Program {
	private LinkedList<Statement> list;
	
	public Program(LinkedList<Statement> list) {
		this.list = list;
	}
	
	public Double eval() {
		return 0.0;
	}
}