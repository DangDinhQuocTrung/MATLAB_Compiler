package ast.sm;

import java.util.*;
import ast.expr.*;
import ast.Jama.Matrix;

public class DisplayStatement implements Statement {
	private Expression expr;
	
	public DisplayStatement(Expression expr) {
		this.expr = expr;
	}
	
	public void run() {
		System.out.println("Display");
	}
}