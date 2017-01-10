package ast.sm;

import java.util.*;
import ast.expr.*;
import ast.DataTable;
import ast.Jama.Matrix;

public class ClcStatement implements Statement {
	
	public ClcStatement() {
		
	}
	
	public void run() {
		System.out.println("Clc");
	}
}