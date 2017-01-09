package ast.expr;

import java.util.*;

public class PlusExpression implements Expression {
	private Expression expr1, expr2;
	
	public PlusExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	public Double eval() {
		return 0.0;
	}
}