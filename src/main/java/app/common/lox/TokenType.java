package app.common.lox;

enum TokenType {
  // Single-character tokens.
  // (, ), [, ], ',', ., -, +, ;, /, *
  LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE, COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

  // One or two character tokens.
  // !, !=, =, ==, >, >=, <, <=
  BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL, GREATER, GREATER_EQUAL, LESS, LESS_EQUAL,

  // Literals.
  // *variable*, string, int
  IDENTIFIER, STRING, NUMBER,

  // Keywords.
  // and, class, else, false, fun. for, if, nil, or,
  // return, super, this, true, var, while, until
  AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR, RETURN, SUPER, THIS, TRUE, VAR, WHILE, UNTIL,

  EOF
}