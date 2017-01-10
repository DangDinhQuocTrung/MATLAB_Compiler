package ast.sm;

import java.util.*;
import ast.expr.*;
import ast.DataTable;
import ast.Jama.Matrix;

public class WhosStatement implements Statement {
	
	public WhosStatement() {
		
	}
	
	public void run() {
		System.out.println("Whos");
	}
}