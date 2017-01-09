package ast.sm;

import java.util.*;
import ast.expr.*;

public class IfElseStatement implements Statement {
	private Expression expr;
	private LinkedList<Statement> ifList;
	private LinkedList<Statement> elseList;
	
	public IfElseStatement(Expression expr, LinkedList<Statement> ifList, LinkedList<Statement> elseList) {
		this.expr = expr;
		this.ifList = ifList;
		this.elseList = elseList;
	}
	
	public void run() {
		
	}
}