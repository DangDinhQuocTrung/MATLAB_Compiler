package ast;

import java.util.*;
import ast.Jama.Matrix;

public class DataTable {
	private static HashMap<String, Matrix> data = new HashMap<>();
	
	public static void put(String var, Matrix value) {
		data.put(var, value);
	}
	
	public static Matrix get(String var) {
		return data.get(var);
	}
	
	public static boolean contains(String var) {
		return data.containsKey(var);
	}
}