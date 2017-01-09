package ast.expr;

import java.util.*;
import ast.Jama.Matrix;

public class EqualExpression implements Expression {
	private Expression expr1, expr2;
	
	public EqualExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	public Matrix value() {
		Matrix m1 = expr1.value().copy(), m2 = expr2.value().copy();
		if (m1.sameDimension(m2)) {
			int m = m1.getRowDimension(), n = m1.getColumnDimension();
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (m1.get(i, j) != m2.get(i, j)) {
						return new Matrix(0.0);
					}
				}
			}
			return new Matrix(1.0);
		}
		System.out.println("Comparison is illegal");
		return new Matrix(0.0);
	}
}