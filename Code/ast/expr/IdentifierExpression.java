package ast.expr;

import java.util.*;

public class IdentifierExpression implements Expression {
	private String id;
	
	public IdentifierExpression(String id) {
		this.id = id;
	}
	
	public Double eval() {
		return 0.0;
	}
}