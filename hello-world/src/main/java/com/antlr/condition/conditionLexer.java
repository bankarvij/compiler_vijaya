package com.antlr.condition;
// Generated from condition.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class conditionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, OR=3, AND=4, EQ=5, NEQ=6, GT=7, LT=8, GTEQ=9, LTEQ=10, 
		SCOL=11, ASSIGN=12, OPAR=13, CPAR=14, OBRACE=15, CBRACE=16, TRUE=17, FALSE=18, 
		NIL=19, IF=20, ELSE=21, LOG=22, ID=23, INT=24, SPACE=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", 
		"SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", "FALSE", 
		"NIL", "IF", "ELSE", "LOG", "ID", "INT", "SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'?'", "':'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", 
		"'<='", "';'", "'='", "'('", "')'", "'{'", "'}'", "'true'", "'false'", 
		"'nil'", "'if'", "'else'", "'log'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", 
		"SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", "FALSE", 
		"NIL", "IF", "ELSE", "LOG", "ID", "INT", "SPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public conditionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "condition.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\7\30y\n\30\f\30\16\30|\13"+
		"\30\3\31\6\31\177\n\31\r\31\16\31\u0080\3\32\3\32\3\32\3\32\2\2\33\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\6\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t<\3\2\2\2\13?\3\2\2\2\rB\3\2"+
		"\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25L\3\2\2\2\27O\3\2\2\2\31Q\3"+
		"\2\2\2\33S\3\2\2\2\35U\3\2\2\2\37W\3\2\2\2!Y\3\2\2\2#[\3\2\2\2%`\3\2\2"+
		"\2\'f\3\2\2\2)j\3\2\2\2+m\3\2\2\2-r\3\2\2\2/v\3\2\2\2\61~\3\2\2\2\63\u0082"+
		"\3\2\2\2\65\66\7A\2\2\66\4\3\2\2\2\678\7<\2\28\6\3\2\2\29:\7~\2\2:;\7"+
		"~\2\2;\b\3\2\2\2<=\7(\2\2=>\7(\2\2>\n\3\2\2\2?@\7?\2\2@A\7?\2\2A\f\3\2"+
		"\2\2BC\7#\2\2CD\7?\2\2D\16\3\2\2\2EF\7@\2\2F\20\3\2\2\2GH\7>\2\2H\22\3"+
		"\2\2\2IJ\7@\2\2JK\7?\2\2K\24\3\2\2\2LM\7>\2\2MN\7?\2\2N\26\3\2\2\2OP\7"+
		"=\2\2P\30\3\2\2\2QR\7?\2\2R\32\3\2\2\2ST\7*\2\2T\34\3\2\2\2UV\7+\2\2V"+
		"\36\3\2\2\2WX\7}\2\2X \3\2\2\2YZ\7\177\2\2Z\"\3\2\2\2[\\\7v\2\2\\]\7t"+
		"\2\2]^\7w\2\2^_\7g\2\2_$\3\2\2\2`a\7h\2\2ab\7c\2\2bc\7n\2\2cd\7u\2\2d"+
		"e\7g\2\2e&\3\2\2\2fg\7p\2\2gh\7k\2\2hi\7n\2\2i(\3\2\2\2jk\7k\2\2kl\7h"+
		"\2\2l*\3\2\2\2mn\7g\2\2no\7n\2\2op\7u\2\2pq\7g\2\2q,\3\2\2\2rs\7n\2\2"+
		"st\7q\2\2tu\7i\2\2u.\3\2\2\2vz\t\2\2\2wy\t\3\2\2xw\3\2\2\2y|\3\2\2\2z"+
		"x\3\2\2\2z{\3\2\2\2{\60\3\2\2\2|z\3\2\2\2}\177\t\4\2\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\62\3\2\2\2\u0082\u0083"+
		"\t\5\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\32\2\2\u0085\64\3\2\2\2\5\2"+
		"z\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}