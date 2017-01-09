package ast.expr;

import java.util.*;

public class NumberExpression implements Expression {
	private double number;
	
	public NumberExpression(double number) {
		this.number = number;
	}
	
	public Double eval() {
		return 0.0;
	}
}