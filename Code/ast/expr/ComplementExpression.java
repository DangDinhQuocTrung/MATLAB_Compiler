package ast.expr;

import java.util.*;
import ast.Jama.Matrix;

public class ComplementExpression implements Expression {
	private Expression expr;
	
	public ComplementExpression(Expression expr) {
		this.expr = expr;
	}
	
	public Matrix value() {
		return expr.value().copy().uminus();
	}
}