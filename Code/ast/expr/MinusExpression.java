package ast.expr;

import java.util.*;
import ast.Jama.Matrix;

public class MinusExpression implements Expression {
	private Expression expr1, expr2;
	
	public MinusExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	public Matrix value() {
		Matrix m1 = expr1.value().copy(), m2 = expr2.value().copy();
		if (m1.sameDimension(m2)) {
			return m1.minusEquals(m2);
		} else if (m2.isNumber()) {
			int m = m1.getRowDimension(), n = m1.getColumnDimension();
			Matrix temp = new Matrix(m, n, m2.get(0, 0));
			return m1.minusEquals(temp);
		}
		System.out.println("Operation is illegal");
		return new Matrix(0.0);
	}
}