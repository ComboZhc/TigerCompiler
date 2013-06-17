grammar Tiger;
program : expr | decs;
exprList : (expr (COMMA expr)*)?;
exprs : (expr (SEMI expr)*)?;
relOp : EQ | NEQ | LT | LE | GT | GE;
expr : exprOr (OR expr)?;
exprOr : exprAnd (AND exprOr)?;
exprAnd : arith (relOp arith)?;
arith : term ((PLUS | MINUS) arith)?;
term: factor ((MUL | DIV) term)?;
factor : NIL
    | INT
    | STRING
    | arrayInitializer
    | typeInitializer
    | negateExpr
    | newExpr
    | sequenceExpr
    | assignExpr
    | valueExpr
    | funcExpr
    | methodExpr
    | ifExpr
    | whileExpr
    | forExpr
    | breakExpr
    | letExpr;
arrayInitializer : typeID LSQR expr RSQR OF expr;
typeInitializer : typeID LBCE initFields RBCE;
negateExpr : MINUS expr;
newExpr : NEW typeID;
sequenceExpr : LPAR exprs RPAR;
assignExpr : lvalue ASSIGN expr?;
valueExpr : lvalue;
funcExpr : ID LPAR exprList RPAR;
methodExpr : lvalue DOT ID LPAR exprList RPAR;
ifExpr : IF expr THEN expr (ELSE expr)?;
whileExpr : WHILE expr DO expr;
forExpr : FOR ID ASSIGN expr TO expr DO expr;
breakExpr : BREAK;
letExpr : LET decs IN exprs END;
initFields : (initField (COMMA initField)*)?;
initField : ID EQ expr;
lvalue : ID ((DOT ID) | LSQR expr RSQR)* ;

decs : dec* ;
dec : typeDec
    | classDec
    | varDec
    | funcDec
    | primitiveDec
    | importDec;

varDec : VAR ID (COLON typeID)? ASSIGN expr;
typeDec : TYPE ID EQ type;
classDec : CLASS ID (EXTENDS ID)? LBCE classFields RBCE;
funcDec : FUNCTION ID LPAR typeFields RPAR (COLON typeID)? EQ expr;
methodDec : METHOD ID LPAR typeFields RPAR (COLON typeID)? EQ expr;
primitiveDec : PRIMITIVE ID LPAR typeFields RPAR (COLON typeID)? EQ expr;
importDec : IMPORT STRING;

type : idType
    | recordType
    | arrayType;
idType : typeID;
arrayType : ARRAY OF typeID;
recordType : LBCE typeFields RBCE;
typeFields : (typeField (COMMA typeField)*)?;
typeField : ID COLON typeID;
typeID : ID;

classFields : classField* ;
classField : varDec
    | methodDec;

COMMENT: '/*' (COMMENT | ~('*'|'/') | '*'~'/' | '/'~'*')*? '*/' -> skip;
STRING: '"' (SLASH | ~'\\')*? '"';

ASSIGN: ':=';
COMMA: ',';
SEMI: ';';
COLON: ':';
DOT: '.';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';
EQ: '=';
NEQ: '<>';
AND: '&';
OR: '|';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';

LPAR: '(';
RPAR: ')';
LSQR: '[';
RSQR: ']';
LBCE: '{';
RBCE: '}';

NIL: 'nil';
NEW: 'new';
IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while'; 
DO: 'do';
FOR: 'for';
TO: 'to';
BREAK: 'break';
LET: 'let';
IN: 'in';
END: 'end';
CLASS: 'class';
EXTENDS: 'extends';
VAR: 'var';
TYPE: 'type';
METHOD: 'method';
FUNCTION: 'function';
ARRAY: 'array';
OF: 'of';
PRIMITIVE: 'primitive';
IMPORT: 'import';

ID: LETTER (LETTER|DIGIT|'_')* | '_main';
INT: DIGIT+;

WHITESPACE : [ \t\r\n]+ -> skip;
fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment SLASH : '\\'([abfnrtv'"''\\'] | [0-7] | [1-7][0-7] | [1-3][0-7][0-7] | [xX][0-9a-fA-F] | [xX][1-9a-fA-F][0-9a-fA-F]);