grammar Expr;

root: EOF ;    

UPDATE: 'UPDATE';
SET: 'SET';
WHERE: 'WHERE';

COMA: ',';
PUNTO_COMA: ';';
ASIGNACION: '=';

NUM: [0-9]+ ;
IDT: [a-zA-Z]+[_a-zA-Z0-9]* ;
TEXTO: '\'' (~['\r\n,])* '\'';

WS: [ \t\r\n]+ -> skip ;