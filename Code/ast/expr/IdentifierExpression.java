package ast.expr;

import java.util.*;
import ast.DataTable;
import ast.Jama.Matrix;

public class IdentifierExpression implements Expression {
	private String id;
	
	public IdentifierExpression(String id) {
		this.id = id;
	}
	
	public Matrix value() {
		if (DataTable.contains(id)) {
			return DataTable.get(id);
		} else {
			System.out.println("Variable have not been declared");
			return new Matrix(0.0);
		}
	}
}