package ast.sm;

import java.util.*;
import ast.expr.*;
import ast.DataTable;
import ast.Jama.Matrix;

public class ExitStatement implements Statement {
	
	public ExitStatement() {
		
	}
	
	public void run() {
		System.out.println("Exit");
	}
}