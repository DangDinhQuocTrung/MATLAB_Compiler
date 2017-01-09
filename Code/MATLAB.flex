import java_cup.runtime.*;
import java.lang.Math;

%%

%class Lexer
%cup

%eofval{
	return new Symbol(sym.EOF);
%eofval}

%%


"log|exp|sin|sum" {
	return new Symbol(sym.FUNCTION);
}

"input|disp|clear|whos|who|clc|exit" {
	return new Symbol(sym.COMMAND);
}

"if"		{ return new Symbol(sym.IF); }
"else"		{ return new Symbol(sym.ELSE); }
"for"		{ return new Symbol(sym.FOR); }
"while"		{ return new Symbol(sym.WHILE); }
"end"		{ return new Symbol(sym.END); }
"all"		{ return new Symbol(sym.ALL); }
"pi"		{ return new Symbol(sym.NUMBER, Math.PI); }


[0-9]+("."[0-9]+)?			{ return new Symbol(sym.NUMBER, new Double(yytext())); }
[A-Za-z_$][A-Za-z_$0-9]*    { return new Symbol(sym.IDENTIFIER, yytext()); }
’[^’\r\f\n]*’ { 
	String string = yytext().substring(1, yytext().length() - 1);
	System.out.println(string);
	return new Symbol(sym.STRING, string);
}


\^			{ return new Symbol(sym.POWER); }
"+"			{ return new Symbol(sym.PLUS); }
"-"			{ return new Symbol(sym.MINUS); }
"*"			{ return new Symbol(sym.MULTIPLY); }
".*"		{ return new Symbol(sym.MATRIX_MULTIPLY); }
"/"			{ return new Symbol(sym.DIVIDE); }
"("			{ return new Symbol(sym.LPAREN); }
")"			{ return new Symbol(sym.RPAREN); }
"="			{ return new Symbol(sym.ASSIGN); }

"=="		{ return new Symbol(sym.EQUAL); }
">="		{ return new Symbol(sym.G_EQUAL); }
">"			{ return new Symbol(sym.GREATER); }
"<="		{ return new Symbol(sym.S_EQUAL); }
"<"			{ return new Symbol(sym.SMALLER); }
"~="		{ return new Symbol(sym.NOT_EQUAL); }

","			{ return new Symbol(sym.COMMA); }
";"			{ return new Symbol(sym.SEMICOLON); }
":"			{ return new Symbol(sym.COLON); }
"["			{ return new Symbol(sym.LSQUARE); }
"]"			{ return new Symbol(sym.RSQUARE); }


\.\.\.[^\n\r\f]*[\n\r\f]		{  }
[\n\r\f]+						{  }
[ \t]+							{  }
/* comment */
\%[^\n\r\f]*([\n\r\f])?	      	{  }

