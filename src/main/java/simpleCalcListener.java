// Generated from C:/Uddannelse/DTU/3sem/Compiler/antlrMaven/src/main/java\simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleCalcParser}.
 */
public interface simpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simpleCalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleState}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterSingleState(simpleCalcParser.SingleStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleState}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitSingleState(simpleCalcParser.SingleStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoreStare}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterMoreStare(simpleCalcParser.MoreStareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoreStare}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitMoreStare(simpleCalcParser.MoreStareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link simpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(simpleCalcParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link simpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(simpleCalcParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link simpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf(simpleCalcParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link simpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf(simpleCalcParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assig}
	 * labeled alternative in {@link simpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssig(simpleCalcParser.AssigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assig}
	 * labeled alternative in {@link simpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssig(simpleCalcParser.AssigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallerLarger}
	 * labeled alternative in {@link simpleCalcParser#con}.
	 * @param ctx the parse tree
	 */
	void enterSmallerLarger(simpleCalcParser.SmallerLargerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallerLarger}
	 * labeled alternative in {@link simpleCalcParser#con}.
	 * @param ctx the parse tree
	 */
	void exitSmallerLarger(simpleCalcParser.SmallerLargerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link simpleCalcParser#con}.
	 * @param ctx the parse tree
	 */
	void enterEqual(simpleCalcParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link simpleCalcParser#con}.
	 * @param ctx the parse tree
	 */
	void exitEqual(simpleCalcParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link simpleCalcParser#con}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(simpleCalcParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link simpleCalcParser#con}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(simpleCalcParser.AndOrContext ctx);
}