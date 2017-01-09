import java_cup.runtime.*;

%%

%class Lexer
%cup

%eofval{
	return new Symbol(sym.EOF);
%eofval}

%%

"log"		{ return new Symbol(sym.LOG); }
"exp"		{ return new Symbol(sym.EXP); }
"pi"		{ return new Symbol(sym.PI); }
"input"		{ return new Symbol(sym.INPUT); }
"disp"		{ return new Symbol(sym.DISP); }
"clear"		{ return new Symbol(sym.CLEAR); }
"whos"		{ return new Symbol(sym.WHOS); }
"who"		{ return new Symbol(sym.WHO); }
"clc"		{ return new Symbol(sym.CLC); }
"exit"		{ return new Symbol(sym.EXIT); }
"all"		{ return new Symbol(sym.ALL); }
"sum"		{ return new Symbol(sym.SUM); }
"sin"		{ return new Symbol(sym.SIN); }


"if"		{ return new Symbol(sym.IF); }
"else"		{ return new Symbol(sym.ELSE); }
"for"		{ return new Symbol(sym.FOR); }
"while"		{ return new Symbol(sym.WHILE); }
"end"		{ return new Symbol(sym.END); }
"all"		{ return new Symbol(sym.ALL); }


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
">"			{ return new Symbol(sym.GREATER); }
"<"			{ return new Symbol(sym.SMALLER); }
">="		{ return new Symbol(sym.G_EQUAL); }
"<="		{ return new Symbol(sym.S_EQUAL); }
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

