package ast.sm;

import java.util.*;
import ast.expr.*;
import ast.DataTable;
import ast.Jama.Matrix;

public class ClearStatement implements Statement {
	private String id;
	
	public ClearStatement(String id) {
		this.id = id;
	}
	
	public void run() {
		System.out.println("Clear");
	}
}