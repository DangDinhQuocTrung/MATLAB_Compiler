package ast.sm;

import java.util.*;
import ast.expr.*;

public class IfStatement implements Statement {
	private Expression expr;
	private LinkedList<Statement> list;
	
	public IfStatement(Expression expr, LinkedList<Statement> list) {
		this.expr = expr;
		this.list = list;
	}
	
	public void run() {
		
	}
}