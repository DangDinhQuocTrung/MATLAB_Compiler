package ast.expr;

import java.util.*;
import ast.Jama.Matrix;

public class SmallerExpression implements Expression {
	private Expression expr1, expr2;
	
	public SmallerExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	public Matrix value() {
		Matrix m1 = expr1.value().copy(), m2 = expr2.value().copy();
		if (m1.isNumber() && m2.isNumber()) {
			double result = (m1.get(0, 0) < m2.get(0, 0)) ? 1.0 : 0.0;
			return new Matrix(result);
		}
		System.out.println("Comparison is illegal");
		return new Matrix(0.0);
	}
}