package ast.sm;

import java.util.*;
import ast.expr.*;
import ast.Jama.Matrix;

public class ExpressionStatement implements Statement {
	private Expression expr;
	
	public ExpressionStatement(Expression expr) {
		this.expr = expr;
	}
	
	public void run() {
		System.out.println(expr.value());
	}
}