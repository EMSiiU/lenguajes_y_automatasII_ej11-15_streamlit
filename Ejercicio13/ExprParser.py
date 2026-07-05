# Generated from ./Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,29,5,2,0,7,0,1,0,1,0,1,0,0,0,1,0,0,0,3,0,2,1,0,0,0,2,3,5,0,0,
        1,3,1,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'CREATE'", "'TABLE'", "'SERIAL'", "'PRIMARY'", 
                     "'KEY'", "'VARCHAR'", "'NOT'", "'NULL'", "'INTEGER'", 
                     "'DATE'", "'INSERT'", "'INTO'", "'VALUES'", "'SELECT'", 
                     "'FROM'", "'WHERE'", "'INNER'", "'JOIN'", "'ON'", "'('", 
                     "')'", "','", "';'", "'.'", "'='" ]

    symbolicNames = [ "<INVALID>", "CREATE", "TABLE", "SERIAL", "PRIMARY", 
                      "KEY", "VARCHAR", "NOT", "NULL", "INTEGER", "DATE", 
                      "INSERT", "INTO", "VALUES", "SELECT", "FROM", "WHERE", 
                      "INNER", "JOIN", "ON", "PAR_IZQ", "PAR_DER", "COMA", 
                      "PUNTO_COMA", "PUNTO", "ASIGNACION", "NUM", "IDT", 
                      "TEXTO", "WS" ]

    RULE_root = 0

    ruleNames =  [ "root" ]

    EOF = Token.EOF
    CREATE=1
    TABLE=2
    SERIAL=3
    PRIMARY=4
    KEY=5
    VARCHAR=6
    NOT=7
    NULL=8
    INTEGER=9
    DATE=10
    INSERT=11
    INTO=12
    VALUES=13
    SELECT=14
    FROM=15
    WHERE=16
    INNER=17
    JOIN=18
    ON=19
    PAR_IZQ=20
    PAR_DER=21
    COMA=22
    PUNTO_COMA=23
    PUNTO=24
    ASIGNACION=25
    NUM=26
    IDT=27
    TEXTO=28
    WS=29

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





