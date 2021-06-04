package com.antlr.condition;
// Generated from condition.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link conditionParser}.
 */
public interface conditionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link conditionParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(conditionParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link conditionParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(conditionParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link conditionParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(conditionParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link conditionParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(conditionParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link conditionParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(conditionParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link conditionParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(conditionParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link conditionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(conditionParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link conditionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(conditionParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link conditionParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(conditionParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link conditionParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(conditionParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link conditionParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(conditionParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link conditionParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(conditionParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link conditionParser#true_block}.
	 * @param ctx the parse tree
	 */
	void enterTrue_block(conditionParser.True_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link conditionParser#true_block}.
	 * @param ctx the parse tree
	 */
	void exitTrue_block(conditionParser.True_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link conditionParser#false_block}.
	 * @param ctx the parse tree
	 */
	void enterFalse_block(conditionParser.False_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link conditionParser#false_block}.
	 * @param ctx the parse tree
	 */
	void exitFalse_block(conditionParser.False_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link conditionParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(conditionParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link conditionParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(conditionParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(conditionParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(conditionParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(conditionParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(conditionParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(conditionParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(conditionParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(conditionParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(conditionParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(conditionParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(conditionParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(conditionParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(conditionParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(conditionParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(conditionParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(conditionParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(conditionParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(conditionParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(conditionParser.IdAtomContext ctx);
}