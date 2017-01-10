package ast.sm;

import java.util.*;
import ast.expr.*;
import ast.DataTable;
import ast.Jama.Matrix;

public class InputStatement implements Statement {
	private String id;
	private String s;
	
	public InputStatement(String id, String s) {
		this.id = id;
		this.s = s;
	}
	
	public void run() {
		//DataTable.put(id, expr.value());
		System.out.println("Input");
	}
}