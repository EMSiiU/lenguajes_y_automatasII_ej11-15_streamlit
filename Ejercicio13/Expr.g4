grammar Expr;

root: EOF ;    

CREATE: 'CREATE';
TABLE: 'TABLE';
SERIAL: 'SERIAL';
PRIMARY: 'PRIMARY';
KEY: 'KEY';
VARCHAR: 'VARCHAR';
NOT: 'NOT';
NULL: 'NULL';
INTEGER: 'INTEGER';
DATE: 'DATE';
INSERT: 'INSERT';
INTO: 'INTO';
VALUES: 'VALUES';
SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
INNER: 'INNER';
JOIN: 'JOIN';
ON: 'ON';

PAR_IZQ: '(';
PAR_DER: ')';
COMA: ',';
PUNTO_COMA: ';';
PUNTO: '.';
ASIGNACION: '=';

NUM: [0-9]+ ;
IDT: [a-zA-Z]+[_a-zA-Z0-9]* ;
TEXTO: '\'' (~['\r\n,])* '\'';

WS: [ \t\r\n]+ -> skip ;