// Generated from C:/Uddannelse/DTU/3sem/Compiler/antlrMaven/src/main/java\simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleState}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleState(simpleCalcParser.SingleStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreStare}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreStare(simpleCalcParser.MoreStareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link simpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(simpleCalcParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link simpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(simpleCalcParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assig}
	 * labeled alternative in {@link simpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssig(simpleCalcParser.AssigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallerLarger}
	 * labeled alternative in {@link simpleCalcParser#con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerLarger(simpleCalcParser.SmallerLargerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link simpleCalcParser#con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(simpleCalcParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link simpleCalcParser#con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(simpleCalcParser.AndOrContext ctx);
}