package com.antlr.condition;
// Generated from condition.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link conditionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface conditionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link conditionParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(conditionParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link conditionParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(conditionParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link conditionParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(conditionParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link conditionParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(conditionParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link conditionParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(conditionParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link conditionParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(conditionParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link conditionParser#true_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_block(conditionParser.True_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link conditionParser#false_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse_block(conditionParser.False_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link conditionParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(conditionParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(conditionParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(conditionParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(conditionParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(conditionParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link conditionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(conditionParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(conditionParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(conditionParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(conditionParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link conditionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(conditionParser.IdAtomContext ctx);
}