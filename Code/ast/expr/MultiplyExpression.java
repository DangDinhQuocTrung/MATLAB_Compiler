package ast.expr;

import java.util.*;

public class MultiplyExpression implements Expression {
	private Expression expr1, expr2;
	
	public MultiplyExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	public Double eval() {
		return 0.0;
	}
}