grammar Expr;

root: expr* EOF;
expr: instruccion NL*;
instruccion: SUDO? comando argumento*;

comando : NMAP | SS | TCPDUMP | CURL | DIG | JOURNALCTL | GREP | UFW;

argumento : OPCION_LARGA | OPCION_CORTA | IP_CIDR | IP | DOMINIO | RUTA | TEXTO | NUM
    | MX | DENY | FROM | TODAY | IDF;

SUDO: 'sudo';
NMAP: 'nmap';
SS: 'ss';
TCPDUMP: 'tcpdump';
CURL: 'curl';
DIG: 'dig';
JOURNALCTL: 'journalctl';
GREP: 'grep';
UFW: 'ufw';
MX: 'MX';
DENY: 'deny';
FROM: 'from';
TODAY: 'today';

OPCION_LARGA: '--' [a-zA-Z]+ [a-zA-Z0-9-]*;
OPCION_CORTA: '-' [a-zA-Z]+ [a-zA-Z0-9]*;

IP_CIDR: OCTETO '.' OCTETO '.' OCTETO '.' OCTETO '/' NUM;
IP: OCTETO '.' OCTETO '.' OCTETO '.' OCTETO;
DOMINIO: [a-zA-Z0-9]+ ('.' [a-zA-Z0-9]+)+;
RUTA: '/' [a-zA-Z0-9._/-]+;
TEXTO: '"' ~[\r\n"]* '"';
NUM: [0-9]+;
IDF: [a-zA-Z_][a-zA-Z0-9_]*;

fragment OCTETO: [0-9] [0-9]? [0-9]?;

NL: [\r\n]+;
WS: [ \t]+ -> skip;