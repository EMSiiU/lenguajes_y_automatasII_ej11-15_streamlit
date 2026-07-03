grammar Expr;

root: expr EOF ;    

expr: NUM | IDF | TEXTO ;

PUBLIC : 'public';
CLASS : 'class';
STATIC : 'static';
VOID : 'void';
STRING : 'String';
INT : 'int';
SYSTEM : 'System';

NUM: [0-9]+ ;
IDF: [a-zA-Z]+[0-9a-zA-Z]*;
TEXTO: '"' ~[\r\n"]* '"';

PAR1: '(';
PAR2: ')';
LLAVE1: '{';
LLAVE2: '}';
CORCHETE1: '[';
CORCHETE2: ']';
IGUAL: '=';
MAS: '+';
PUNTOCOMA: ';';
PUNTO: '.';

WS: [ \t\r\n]+ -> skip ;