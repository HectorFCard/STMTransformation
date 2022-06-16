parser grammar STMParser;

options { tokenVocab=STMLexer; }

document    :   prolog? misc* element misc*;

prolog      :   XMLDeclOpen attribute* SPECIAL_CLOSE ;

content     :   chardata? ((element | reference | CDATA | PI | COMMENT) chardata?)* ;

element     :   modelElem
            |   modelOwnedElem
            |   compClassElem
            |   attributeElem
            |   queryOpElem
            |   paramsElem
            |   condElem
            |   constrElem
            |   specElem
            |   bodyElem
            |   langElem
            |   ownedEndElem
            |   literalElem
            |   genElem
            |   ctxElem
            |   miscElem
            ;

modelElem :   '<' Model attribute* '>' content '<' '/' Model '>'
            |   '<' Model attribute* '/>'
            ;

modelOwnedElem :   '<' OwnedElems attribute* '>' content '<' '/' OwnedElems '>'
            |   '<' OwnedElems attribute* '/>'
            ;

compClassElem :   '<' SnapObjs attribute* '>' content '<' '/' SnapObjs '>'
            |   '<' SnapObjs attribute* '/>'
            ;

attributeElem :   '<' Attributes attribute* '>' content '<' '/' Attributes '>'
            |   '<' Attributes attribute* '/>'
            ;

queryOpElem :   '<' QOps attribute* '>' content '<' '/' QOps '>'
            |   '<' QOps attribute* '/>'
            ;

paramsElem :   '<' Params attribute* '>' content '<' '/' Params '>'
            |   '<' Params attribute* '/>'
            ;

condElem :   '<' Conditions attribute* '>' content '<' '/' Conditions '>'
            |   '<' Conditions attribute* '/>'
            ;

constrElem :   '<' Constraints attribute* '>' content '<' '/' Constraints '>'
            |   '<' Constraints attribute* '/>'
            ;

specElem :   '<' Spec attribute* '>' content '<' '/' Spec '>'
            |   '<' Spec attribute* '/>'
            ;

bodyElem :   '<' Body attribute* '>' content '<' '/' Body '>'
            |   '<' Body attribute* '/>'
            ;

langElem :   '<' Lang attribute* '>' content '<' '/' Lang '>'
            |   '<' Lang attribute* '/>'
            ;

ownedEndElem :   '<' OwnedEnd attribute* '>' content '<' '/' OwnedEnd '>'
            |   '<' OwnedEnd attribute* '/>'
            ;

literalElem :   '<' OwnedLiteral attribute* '>' content '<' '/' OwnedLiteral '>'
            |   '<' OwnedLiteral attribute* '/>'
            ;

genElem :   '<' Gization attribute* '>' content '<' '/' Gization '>'
            |   '<' Gization attribute* '/>'
            ;

ctxElem :   '<' Context attribute* '>' content '<' '/' Context '>'
            |   '<' Context attribute* '/>'
            ;

miscElem :   '<' Name attribute* '>' content '<' '/' Name '>'
            |   '<' Name attribute* '/>'
            ;

reference   :   EntityRef | CharRef;

attribute   :   Name '=' STRING ;

chardata    :   TEXT | SEA_WS ;

misc        :   COMMENT | PI | SEA_WS ;