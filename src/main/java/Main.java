import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        // we expect exactly one argument: the name of the input file
        /*if (args.length!=1) {
            System.err.println("\n");
            System.err.println("Simple calculator\n");
            System.err.println("=================\n\n");
            System.err.println("Please give as input argument a filename\n");
            System.exit(-1);
        }*/
        String filename = "simpleCalc_input.txt";

        // open the input file
        CharStream input = CharStreams.fromFileName(filename);
        //new ANTLRFileStream (filename); // depricated

        // create a lexer/scanner
        simpleCalcLexer lex = new simpleCalcLexer(input);

        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // create a parser
        simpleCalcParser parser = new simpleCalcParser(tokens);

        // and parse anything from the grammar for "start"
        ParseTree parseTree = parser.start();

        // Construct an interpreter and run it on the parse tree
        Interpreter interpreter = new Interpreter();
        Double result=interpreter.visit(parseTree);

        System.out.println("The result is: "+result);
    }
}

// We write an interpreter that implements interface
// "simpleCalcVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.

class Interpreter extends AbstractParseTreeVisitor<Double> implements simpleCalcVisitor<Double> {

    // An environment mapping variablenames to double values (initially empty)
    public static HashMap<String,Double> env=new HashMap<String,Double>();

    public Double visitStart(simpleCalcParser.StartContext ctx){
        // New implementation: visit all assignments:

           visit(ctx.b);
       return visit(ctx.e);
    }

    public Double visitSingleState(simpleCalcParser.SingleStateContext ctx) {
        visit(ctx.s);

        return null;
    }

    public Double visitMoreStare(simpleCalcParser.MoreStareContext ctx) {
        int count =0;
        for(simpleCalcParser.StmtContext s: ctx.ss){
            count++;
            visit(s);}
        return null;
    }

    ;

    public Double visitParenthesis(simpleCalcParser.ParenthesisContext ctx){
        return visit(ctx.e);
    };

    public Double visitVariable(simpleCalcParser.VariableContext ctx){
        // New implementation: look up the value of the variable in the environment env:
        String varname=ctx.x.getText();
        Double d=env.get(varname);
        if (d==null){
            System.err.println("Variable "+varname+" is not defined.\n");
            System.exit(-1);
        }
        return d;
    };

    public Double visitMultiplication(simpleCalcParser.MultiplicationContext ctx){
        return visit(ctx.e1)*visit(ctx.e2);
    };

    public Double visitAddition(simpleCalcParser.AdditionContext ctx){
        if (ctx.op.getText().equals("+")){
            if(env.containsKey(ctx.e1.getText())){
                Double newValue = visit(ctx.e1)+visit(ctx.e2);
                env.remove(ctx.e1.getText());
                env.put(ctx.e1.getText(),newValue);
                return newValue;
            }

        }else {
            if (env.containsKey(ctx.e1.getText())) {
                Double newValue = visit(ctx.e1) - visit(ctx.e2);
                env.remove(ctx.e1.getText());
                env.put(ctx.e1.getText(), newValue);
                return newValue;
            }
        }
            //return visit(ctx.e1)-visit(ctx.e2 );}
        return null;
    };


//TODO:Tjek at dette er sidste led
    public Double visitConstant(simpleCalcParser.ConstantContext ctx){


        return Double.parseDouble(ctx.c.getText());
    };

    public Double visitSignedConstant(simpleCalcParser.SignedConstantContext ctx){
        return Double.parseDouble(ctx.getText());
    }

    public Double visitSmallerLarger(simpleCalcParser.SmallerLargerContext ctx) {


        String option =ctx.ip.getText();

        if(option.equals(">=")){
            if((visit(ctx.e1)>visit(ctx.e2))||(visit(ctx.e1).equals(visit(ctx.e2)))){
                return 1.0;
            }else{
                return 0.0;}

        }else if (option.equals("<=")){
            if((visit(ctx.e1)<visit(ctx.e2))||(visit(ctx.e1).equals(visit(ctx.e2)))){
                return 1.0;
            }else{
                return 0.0;}

        }else if (option.equals("<")){
            if((visit(ctx.e1)<visit(ctx.e2))){
            return 1.0;
        }else{
                return 0.0;}

        }else if (option.equals(">")){
            if((visit(ctx.e1)>visit(ctx.e2))){
            return 1.0;
        }else{
            return 0.0;}

        }
        return null;
    }

    public Double visitEqual(simpleCalcParser.EqualContext ctx) {


        String option =ctx.ep.getText();
        if(option.equals("==")){
            if((visit(ctx.e1)).equals(visit(ctx.e2)))
        return 1.0;
        }
        return 0.0;
    }

    public Double visitAndOr(simpleCalcParser.AndOrContext ctx) {
        return null;
    }


    public Double visitWhile(simpleCalcParser.WhileContext ctx) {
        Double abc = visit(ctx.c);
        boolean isTrue = true;
        if(abc.equals(0.0)) {
           isTrue = false;
        }

        while(isTrue){

            if(visit(ctx.c).equals(0.0)) {
                isTrue = false;
            }else if(isTrue) visit(ctx.s);
        }
        return null;
    }

    public Double visitIf(simpleCalcParser.IfContext ctx) {
        Double abc = visit(ctx.c);
        if(abc.equals(1.0)){

            return visit(ctx.e1);

        }else {

            return visit(ctx.e2);

        }
    }

    public Double visitAssig(simpleCalcParser.AssigContext ctx) {
        // New implementation: evaluate the expression and store it in the environment for the given
        // variable name
        String varname=ctx.x.getText();
        Double v = visit(ctx.e);
        env.put(varname,v);

        return v;
    }

    public Double visitStateExpression(simpleCalcParser.StateExpressionContext ctx) {

        return visit(ctx.e1);
    }


}

