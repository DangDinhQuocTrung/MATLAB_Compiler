package ast.sm;

import java.util.*;
import ast.expr.*;

public class AssignStatement implements Statement {
	private String id;
	private Expression expr;
	
	public AssignStatement(String id, Expression expr) {
		this.id = id;
		this.expr = expr;
	}
	
	public void run() {
		
	}
}