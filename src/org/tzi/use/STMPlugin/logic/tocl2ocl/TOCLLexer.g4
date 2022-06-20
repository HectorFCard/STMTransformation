lexer grammar TOCLLexer;

//OCL EXPRESSIONS LEXER TOKENS
//HEX: ([0-9] | [A-F] | [a-f])+;
NATURAL_N: '0' | [1-9] [0-9]*;
INTEGER_N: '-'? [1-9] [0-9]*;
REAL_N: INTEGER_N '.' [0-9]+;
PLUS: '+';
MINUS: '-';
ASTERISK: '*';
DIVIDED_BY: '/';
SELF: 'self';
UNDERSCORE: '_';
SINGLE_QUOTE: '\'';
TUPLE: 'Tuple';
SCOPE: '::';
HASH: '#';
LBRACK: '{';
RBRACK: '}';
SET: 'Set';
BAG: 'Bag';
SEQUENCE: 'Sequence';
COLLECTION: 'Collection';
ORDERED_SET: 'OrderedSet';
COMMA: ',';
DOT: '.';
DOUBLE_DOT: '..';
TRUE: 'true';
FALSE: 'false';
BAR: '|';
ARROW: '->';
SELECT: 'select';
REJECT: 'reject';
COLLECT: 'collect';
EXISTS: 'exists';
FOR_ALL: 'forAll';
IS_UNIQUE: 'isUnique';
SORTED_BY: 'sortedBy';
INCLUDES: 'includes';
EXCLUDES: 'excludes';
INCLUDES_ALL: 'includesAll';
EXCLUDES_ALL: 'excludesAll';
DIV: 'div';
L_SQ_BRACK: '[';
R_SQ_BRACK: ']';
ITERATE: 'iterate';
COLON: ':';
EQUALS: '=';
NOT_EQUAL: '<>';
BOOLEAN: 'Boolean';
INTEGER: 'Integer';
REAL: 'Real';
STRING: 'String';
UNLIMITED_NATURAL: 'UnlimitedNatural';
OCL_ANY: 'OclAny';
OCL_INVALID: 'OclInvalid';
OCL_MESSAGE: 'OclMessage';
OCL_VOID: 'OclVoid';
LPAREN: '(';
RPAREN: ')';
IMPLIES: 'implies';
OR: 'or';
XOR: 'xor';
AND: 'and';
NOT: 'not';
GT: '>';
LT: '<';
OCL_AS_TYPE: 'oclAsType';
OCL_IS_KIND_OF: 'oclIsKindOf';
OCL_IS_TYPE_OF: 'oclIsTypeOf';
SELECT_BY_KIND: 'selectByKind';
SELECT_BY_TYPE: 'selectByType';
ALL_INSTANCES: 'allInstances';
AT_PRE: '@pre';
LET: 'let';
IN: 'in';
SEMI: ';';
QUESTION_MARK: '?';
IF: 'if';
THEN: 'then';
ELSE: 'else';
ENDIF: 'endif';
INVALID: 'invalid';
NULL: 'null';

//OCL CONSTRAINTS LEXER TOKENS
PACKAGE: 'package';
ENDPACKAGE: 'endpackage';
CONTEXT: 'context';
INIT: 'init';
DERIVE: 'derive';
INV: 'inv';
STATIC: 'static';
DEF: 'def';
PRE: 'pre';
POST: 'post';
BODY: 'body';

//TOCL EXPRESSIONS LEXER TOKENS
NEXT: 'next';
ALWAYS: 'always';
SOMETIME: 'sometime';
UNTIL: 'until';
BEFORE: 'before';
PREVIOUS: 'previous';
ALWAYS_PAST: 'alwaysPast';
SOMETIME_PAST: 'sometimePast';
SINCE: 'since';
AT_NEXT: '@next';

SIMPLE_NAME: [A-Z_$a-z] [A-Z_$a-z0-9]*;

WhiteSpaceChar: (' ' | '\t' | '\n' | '\r' | '\n\r') -> skip;
Char: [A-Z] | UNDERSCORE | '$' | [a-z] | MINUS | [0-9];
EscapeSequence: '\\' 'b'
                | '\\' 't'
                | '\\' 'n'
                | '\\' 'f'
                | '\\' 'r'
                | '\\' '"'
                | '\\' '\''
                | '\\' '\\'
                | '\\' 'x'
                | '\\' 'u'
                ;
STRING_CHARS: '\''(Char | WhiteSpaceChar | EscapeSequence)+ '\'';