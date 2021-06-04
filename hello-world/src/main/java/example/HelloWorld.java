package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.antlr.condition.conditionBaseVisitor;
import com.antlr.condition.conditionLexer;
import com.antlr.condition.conditionParser;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		String fileName = args[0];
		
		if (fileName == null || !fileName.endsWith(".hu")) {
			System.out.println("Invalid file name!!!");
			System.exit(1);
		}
		
		try (InputStream inputStream = HelloWorld.class.getClassLoader().getResourceAsStream(fileName);
		InputStreamReader streamReader = new InputStreamReader(inputStream);
		BufferedReader reader = new BufferedReader(streamReader))
		{

			String line = null;
			StringBuilder content = new StringBuilder("");
			while((line = reader.readLine()) != null) {
				content.append(line);
			}
			
			conditionLexer lexer = new conditionLexer(CharStreams.fromString(content.toString()));
			
			conditionParser parser = new conditionParser(new CommonTokenStream(lexer));
	        ParseTree tree = parser.parse();
	        conditionBaseVisitor visitor = new conditionBaseVisitor();
	        visitor.visit(tree);
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
	}

}
