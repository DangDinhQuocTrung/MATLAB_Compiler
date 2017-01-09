package ast.expr;

import java.util.*;

public class ComplementExpression implements Expression {
	private Expression expr;
	
	public ComplementExpression(Expression expr) {
		this.expr = expr;
	}
	
	public Double eval() {
		return 0.0;
	}
}