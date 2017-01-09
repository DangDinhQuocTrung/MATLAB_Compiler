package ast.expr;

import java.util.*;
import ast.Jama.Matrix;

public class NumberExpression implements Expression {
	private double number;
	
	public NumberExpression(double number) {
		this.number = number;
	}
	
	public Matrix value() {
		return new Matrix(number);
	}
}