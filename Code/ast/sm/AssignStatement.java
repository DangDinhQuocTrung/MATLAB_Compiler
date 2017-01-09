package ast.sm;

import java.util.*;
import ast.expr.*;
import ast.DataTable;
import ast.Jama.Matrix;

public class AssignStatement implements Statement {
	private String id;
	private Expression expr;
	
	public AssignStatement(String id, Expression expr) {
		this.id = id;
		this.expr = expr;
	}
	
	public void run() {
		DataTable.put(id, expr.value());
	}
}