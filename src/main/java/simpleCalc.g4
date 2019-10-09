grammar simpleCalc;

start   : b=block e=expr   EOF ;

block : s=stmt                  #SingleState
        | '{'ss+=stmt*'}'          #MoreStare
        ;



stmt        :'while' '(' c=con ')' '{'s=stmt'}' 	                        # While
        | '(if('c=con')'' then 'e1=expr' else 'e2=expr ')'        #If
        |   x=ID '=' e=expr                # Assig
        ;

expr    	:e1=expr ('*'|'/') e2=expr  # Multiplication
        | e1=expr op=OP e2=expr         # Addition
        | c=FLOAT     	                # Constant
        | x=ID		                    # Variable
        | '(' e=expr ')'                # Parenthesis
        | op=OP f=FLOAT                 # SignedConstant
        ;
con         : e1=expr ip=IP e2=expr	    #SmallerLarger
        | e1=expr ep=EP e2=expr         #Equal
        | e1=expr ap=AP e2=expr         #AndOr
        ;


ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : NUM+ ('.' NUM+)? ;


OP : ('-'|'+') ;
IP : ('>'|'<'|'>='|'<=');
EP : ('!='|'==');
AP : ('||'|'&&');

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;
EQUAL   : [=];
WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
