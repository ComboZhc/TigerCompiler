package Language.Tiger;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import Antlr.Tiger.TigerLexer;
import Antlr.Tiger.TigerParser;

public class TigerCompiler {
	public static void main(String[] args) throws Exception {
		ANTLRInputStream input = null;
		if (args.length >= 1) {
			System.out.println("<<<< " + args[0]);
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
			String line = null;
			while ((line = in.readLine()) != null){
				System.out.println(line);
			}
			System.out.println("====");
			input = new ANTLRInputStream(new FileInputStream(args[0]));
		} else {
			input = new ANTLRInputStream(System.in);
		} 
		
		TigerLexer lexer = new TigerLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TigerParser parser = new TigerParser(tokens);
		ParseTree tree = parser.program();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new TigerStandardListener(), tree);
		if (args.length >= 1) {
			System.out.println(">>>>");
		}
	}
}
