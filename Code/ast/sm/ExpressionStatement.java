package ast.sm;

import java.util.*;
import ast.expr.*;

public class ExpressionStatement implements Statement {
	private Expression expr;
	
	public ExpressionStatement(Expression expr) {
		this.expr = expr;
	}
	
	public void run() {
		
	}
}