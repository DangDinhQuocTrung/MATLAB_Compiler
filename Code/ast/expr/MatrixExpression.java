package ast.expr;

import java.util.*;
import ast.Jama.Matrix;

public class MatrixExpression implements Expression {
	private LinkedList<MatrixRow> rows = new LinkedList<>();
	
	public MatrixExpression(LinkedList<MatrixRow> rows) {
		this.rows = rows;
	}
	
	public Matrix value() {
		int m = rows.get(0).value().getColumnDimension();
		double[][] a = new double[rows.size()][m];
		for (int i = 0; i < rows.size(); i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = rows.get(i).value().get(0, j);
			}
		}
		return new Matrix(a);
	}
}