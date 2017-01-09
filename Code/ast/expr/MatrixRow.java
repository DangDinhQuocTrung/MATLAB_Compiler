package ast.expr;

import java.util.*;
import ast.Jama.Matrix;

public class MatrixRow implements Expression {
	private LinkedList<Expression> columns = new LinkedList<>();
	
	public MatrixRow() {}
	
	public MatrixRow(LinkedList<Expression> columns) {
		this.columns = columns;
	}
	
	public Matrix value() {
		double[][] a = new double[1][columns.size()];
		for (int i = 0; i < columns.size(); i++) {
			a[0][i] = columns.get(i).value().get(0, 0);
		}
		return new Matrix(a);
	}
	
	public void add(Expression e) {
		this.columns.add(e);
	}
}