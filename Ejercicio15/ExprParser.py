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
        4,1,24,40,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,5,0,12,8,0,
        10,0,12,0,15,9,0,1,0,1,0,1,1,1,1,5,1,21,8,1,10,1,12,1,24,9,1,1,2,
        3,2,27,8,2,1,2,1,2,5,2,31,8,2,10,2,12,2,34,9,2,1,3,1,3,1,4,1,4,1,
        4,0,0,5,0,2,4,6,8,0,2,1,0,2,9,1,0,10,22,38,0,13,1,0,0,0,2,18,1,0,
        0,0,4,26,1,0,0,0,6,35,1,0,0,0,8,37,1,0,0,0,10,12,3,2,1,0,11,10,1,
        0,0,0,12,15,1,0,0,0,13,11,1,0,0,0,13,14,1,0,0,0,14,16,1,0,0,0,15,
        13,1,0,0,0,16,17,5,0,0,1,17,1,1,0,0,0,18,22,3,4,2,0,19,21,5,23,0,
        0,20,19,1,0,0,0,21,24,1,0,0,0,22,20,1,0,0,0,22,23,1,0,0,0,23,3,1,
        0,0,0,24,22,1,0,0,0,25,27,5,1,0,0,26,25,1,0,0,0,26,27,1,0,0,0,27,
        28,1,0,0,0,28,32,3,6,3,0,29,31,3,8,4,0,30,29,1,0,0,0,31,34,1,0,0,
        0,32,30,1,0,0,0,32,33,1,0,0,0,33,5,1,0,0,0,34,32,1,0,0,0,35,36,7,
        0,0,0,36,7,1,0,0,0,37,38,7,1,0,0,38,9,1,0,0,0,4,13,22,26,32
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'sudo'", "'nmap'", "'ss'", "'tcpdump'", 
                     "'curl'", "'dig'", "'journalctl'", "'grep'", "'ufw'", 
                     "'MX'", "'deny'", "'from'", "'today'" ]

    symbolicNames = [ "<INVALID>", "SUDO", "NMAP", "SS", "TCPDUMP", "CURL", 
                      "DIG", "JOURNALCTL", "GREP", "UFW", "MX", "DENY", 
                      "FROM", "TODAY", "OPCION_LARGA", "OPCION_CORTA", "IP_CIDR", 
                      "IP", "DOMINIO", "RUTA", "TEXTO", "NUM", "IDF", "NL", 
                      "WS" ]

    RULE_root = 0
    RULE_expr = 1
    RULE_instruccion = 2
    RULE_comando = 3
    RULE_argumento = 4

    ruleNames =  [ "root", "expr", "instruccion", "comando", "argumento" ]

    EOF = Token.EOF
    SUDO=1
    NMAP=2
    SS=3
    TCPDUMP=4
    CURL=5
    DIG=6
    JOURNALCTL=7
    GREP=8
    UFW=9
    MX=10
    DENY=11
    FROM=12
    TODAY=13
    OPCION_LARGA=14
    OPCION_CORTA=15
    IP_CIDR=16
    IP=17
    DOMINIO=18
    RUTA=19
    TEXTO=20
    NUM=21
    IDF=22
    NL=23
    WS=24

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

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ExprContext)
            else:
                return self.getTypedRuleContext(ExprParser.ExprContext,i)


        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1022) != 0):
                self.state = 10
                self.expr()
                self.state = 15
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 16
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def instruccion(self):
            return self.getTypedRuleContext(ExprParser.InstruccionContext,0)


        def NL(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.NL)
            else:
                return self.getToken(ExprParser.NL, i)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.instruccion()
            self.state = 22
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==23:
                self.state = 19
                self.match(ExprParser.NL)
                self.state = 24
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InstruccionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def comando(self):
            return self.getTypedRuleContext(ExprParser.ComandoContext,0)


        def SUDO(self):
            return self.getToken(ExprParser.SUDO, 0)

        def argumento(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ArgumentoContext)
            else:
                return self.getTypedRuleContext(ExprParser.ArgumentoContext,i)


        def getRuleIndex(self):
            return ExprParser.RULE_instruccion




    def instruccion(self):

        localctx = ExprParser.InstruccionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_instruccion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==1:
                self.state = 25
                self.match(ExprParser.SUDO)


            self.state = 28
            self.comando()
            self.state = 32
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 8387584) != 0):
                self.state = 29
                self.argumento()
                self.state = 34
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComandoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NMAP(self):
            return self.getToken(ExprParser.NMAP, 0)

        def SS(self):
            return self.getToken(ExprParser.SS, 0)

        def TCPDUMP(self):
            return self.getToken(ExprParser.TCPDUMP, 0)

        def CURL(self):
            return self.getToken(ExprParser.CURL, 0)

        def DIG(self):
            return self.getToken(ExprParser.DIG, 0)

        def JOURNALCTL(self):
            return self.getToken(ExprParser.JOURNALCTL, 0)

        def GREP(self):
            return self.getToken(ExprParser.GREP, 0)

        def UFW(self):
            return self.getToken(ExprParser.UFW, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_comando




    def comando(self):

        localctx = ExprParser.ComandoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_comando)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 1020) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgumentoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPCION_LARGA(self):
            return self.getToken(ExprParser.OPCION_LARGA, 0)

        def OPCION_CORTA(self):
            return self.getToken(ExprParser.OPCION_CORTA, 0)

        def IP_CIDR(self):
            return self.getToken(ExprParser.IP_CIDR, 0)

        def IP(self):
            return self.getToken(ExprParser.IP, 0)

        def DOMINIO(self):
            return self.getToken(ExprParser.DOMINIO, 0)

        def RUTA(self):
            return self.getToken(ExprParser.RUTA, 0)

        def TEXTO(self):
            return self.getToken(ExprParser.TEXTO, 0)

        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def MX(self):
            return self.getToken(ExprParser.MX, 0)

        def DENY(self):
            return self.getToken(ExprParser.DENY, 0)

        def FROM(self):
            return self.getToken(ExprParser.FROM, 0)

        def TODAY(self):
            return self.getToken(ExprParser.TODAY, 0)

        def IDF(self):
            return self.getToken(ExprParser.IDF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_argumento




    def argumento(self):

        localctx = ExprParser.ArgumentoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_argumento)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 37
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 8387584) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





