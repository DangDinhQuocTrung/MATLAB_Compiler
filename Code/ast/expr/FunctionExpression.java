package ast.expr;

import java.util.*;
import ast.Jama.Matrix;

public class FunctionExpression implements Expression {
	private String function;
	private LinkedList<Expression> argList = new LinkedList<>();
	
	public FunctionExpression(String function, LinkedList<Expression> argList) {
		this.function = function;
		this.argList = argList;
	}
	
	public FunctionExpression(String function) {
		this.function = function;
	}
	
	public Matrix value() {
		return new Matrix(0.0);
	}
}