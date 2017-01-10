package ast.sm;

import java.util.*;
import ast.expr.*;
import ast.DataTable;
import ast.Jama.Matrix;

public class WhoStatement implements Statement {
	private String id;
	
	public WhoStatement(String id) {
		this.id = id;
	}
	
	public void run() {
		System.out.println("Who");
	}
}