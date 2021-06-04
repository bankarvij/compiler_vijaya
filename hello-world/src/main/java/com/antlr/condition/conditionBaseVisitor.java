package com.antlr.condition;
import java.util.HashMap;
import java.util.Map;

// Generated from condition.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import com.model.Value;

/**
 * This class provides an empty implementation of {@link conditionVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class conditionBaseVisitor extends AbstractParseTreeVisitor<Value> implements conditionVisitor<Value> {
	
	private Map<String, Value> memory = new HashMap<>();
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitParse(conditionParser.ParseContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitBlock(conditionParser.BlockContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitStat(conditionParser.StatContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitAssignment(conditionParser.AssignmentContext ctx) { 
		if (ctx.if_stat() != null) {
			String id = ctx.ID().getText();
			Value value = this.visit(ctx.if_stat());		
			return memory.put(id, value); 
		} else {
			String id = ctx.ID().getText();
			Value value = this.visit(ctx.expr());		
			return memory.put(id, value);  
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitIf_stat(conditionParser.If_statContext ctx) { 
		conditionParser.ConditionContext condition=  ctx.condition();

        boolean evaluatedBlock = false;

        Value evaluated = this.visit(condition.expr());

        if(evaluated.asBoolean()) {
            evaluatedBlock = true;
            // evaluate this block whose expr==true
            return this.visit(ctx.true_block());
        }
        

        if(!evaluatedBlock && ctx.false_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            return this.visit(ctx.false_block());
        }

        return Value.VOID;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitCondition(conditionParser.ConditionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitTrue_block(conditionParser.True_blockContext ctx) { 
		Value value = this.visit(ctx.atom());
		return value;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitFalse_block(conditionParser.False_blockContext ctx) { 
		Value value = this.visit(ctx.atom());
		return value;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitLog(conditionParser.LogContext ctx) { 
		Value value = this.visit(ctx.expr());
		try {
			System.out.println(value.asDouble().intValue());
		}
		catch (Exception e) {
			System.out.println(value);
		}
        
        return value;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitAtomExpr(conditionParser.AtomExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitOrExpr(conditionParser.OrExprContext ctx) { 
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitRelationalExpr(conditionParser.RelationalExprContext ctx) { 
		Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case conditionParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case conditionParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case conditionParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case conditionParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + conditionParser.tokenNames[ctx.op.getType()]);
        }
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitEqualityExpr(conditionParser.EqualityExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitAndExpr(conditionParser.AndExprContext ctx) { 
		Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitParExpr(conditionParser.ParExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitNumberAtom(conditionParser.NumberAtomContext ctx) { 
		return new Value(Double.valueOf(ctx.getText()));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitBooleanAtom(conditionParser.BooleanAtomContext ctx) { return new Value(Boolean.valueOf(ctx.getText()));	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitIdAtom(conditionParser.IdAtomContext ctx) { 
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
	}
}