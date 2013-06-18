package Language.Tiger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import Antlr.Tiger.TigerLexer;
import Antlr.Tiger.TigerParser;

public class TigerCompiler {
	public static void main(String[] args) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		TigerLexer lexer = new TigerLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TigerParser parser = new TigerParser(tokens);
		
		parser.removeErrorListeners();
		parser.addErrorListener(new TigerErrorListener());
		
		ParseTree tree = parser.program();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new TigerStandardListener(), tree);
	}
}
