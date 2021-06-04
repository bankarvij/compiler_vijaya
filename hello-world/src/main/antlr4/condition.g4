grammar condition;

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : assignment
 | if_stat
 | log
 ;

assignment
 : ID ASSIGN expr SCOL
 | ID ASSIGN if_stat SCOL
 ;

if_stat
 : condition '?' true_block ':' false_block
 ;

condition
 : expr
 ;
 
true_block
  : atom
  ;

false_block
 : atom
 ;

log
 : LOG expr SCOL
 ;

expr
 : expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
 ;

atom
 : OPAR expr CPAR #parExpr
 | (INT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 ;

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';

SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
LOG : 'log';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

SPACE
 : [ \t\r\n] -> skip
 ;