
grammar CMCGrammar;

@header {
package MCGrammar;
}

prog            : includes? globals? functions? main
                ;

includes        : (INCLUDE STR)+
                ;

globals         : GLOB OP (vars)+ CL
                ;

vars            : type ID (SEP ID)* EOL
                ;

functions       : function+
                ;

function        : type ID OPP ((type ID SEP)* type ID)? CLP block
                ;

main            : MAIN block                                        
                ;

block           : OP line+ CL
                ;

line            : vars                                              #varDeclart
                | attribution EOL                                   #attrLine
                | input EOL                                         #inputLine         
                | output EOL                                        #outputLine
                | expr EOL                                          #exprLine
                | ifstmt                                            #ifLine
                | whilestmt                                         #whileLine
                | forstmt                                           #forLine
                | retrn EOL                                         #returnLine
                | callfunction EOL                                  #funcLine
                ;

attribution     : ID AT expr                                        #attrExpr
                | ID AT STR                                         #attrStr
                ;

input           : READ OPP ID CLP                                   
                ;

output          : WRITE OPP outputType CLP                                  
                ;

outputType      : STR                                               #printSTR
                | ID                                                #printID
                | expr                                              #printExpr
                ;

ifstmt          : IF OPP boolExpr CLP block                         #iffStmt
                | IF OPP boolExpr CLP block ELSE block              #ifStmtElse
                ;


whilestmt       : WHILE OPP boolExpr CLP block                      #whileeStmt
                ;

forstmt         : FOR OPP attribution EOL boolExpr EOL ID incr NUM CLP block    #forrStmt
                ;

callfunction    : ID CALL ID OPP ((ID SEP)* ID) CLP
                | ID CALL ID OPP ((NUM SEP)* NUM) CLP
                | ID OPP CLP
                ;

retrn           : RET '0'                                          #returnVal
                ;

type            : INT
                | FLOAT
                | BOOLEAN
                | STRING
                ;

assignOP        : EQ
                | NEG 
                | LESS 
                | LESSEQ 
                | GREATER 
                | GREATEREQ 
                ;

expr            : term PLUS expr                                    #exprPlus
                | term MINUM expr                                   #exprMinum
                | term                                              #exprTerm
                ;

term            : term MULT factor                                  #termMult
                | term DIV factor                                   #termDiv
                | term MOD factor                                   #termMod
                | factor                                            #termFactor
                ;

factor          : OPP expr CLP                                      #exprParnt
                | ID                                                #factorId
                | NUM                                               #factorNum
                | STR                                               #factorStr
                ;

boolExpr        : TRUE                                              #trueValue
                | FALSE                                             #falseValue
                | factor assignOP factor                            #boolExpres
                ;

incr            : PEG
                | MEG
                ;


INCLUDE     : '#Include';
GLOB        : 'global';
MAIN        : 'main';
FUNCTION    : 'function';
WS: (' '|'\t')+{skip();};
NL: '\r'?'\n'+{skip();};
LC: '//' ~[\r\n]*{skip();};

IF          : 'if';
ELSE        : 'else';
FOR         : 'for';
WHILE       : 'while';
WRITE       : 'writeln';
READ        : 'readln';
RET         : 'return';

OP          : '{';
CL          : '}';
SEP         : ',';
OPP         : '(';
CLP         : ')';
EOL         : ';';
AT          : '=';
RNG         : '...';
NEG         : '!=';
EQ          : '==';
PEG	    : '+=';
MEG	    : '-=';
LESS        : '<';
LESSEQ      : '<=';
GREATER     : '>';
GREATEREQ   : '>=';
CALL        : '->';
TRUE        : 'true';
FALSE       : 'false';
PLUS        : '+';
MINUM       : '-';
MULT        : '*';
DIV         : '/';
MOD         : '%';



INT         : 'int';
FLOAT       : 'float';
BOOLEAN     : 'bool';
STRING      : 'string';

ID: [a-zA-Z][0-9a-zA-Z]*;
NUM: [+-]?[0-9]+('.'[0-9]+)?;
STR: '"'[a-zA-Z0-9 ]?[ a-zA-Z0-9_.:]*'"';


