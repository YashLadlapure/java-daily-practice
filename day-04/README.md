# Day 4 — Operators

## Topics Covered
- Arithmetic operators: `+`, `-`, `*`, `/`, `%`
- Relational operators: `==`, `!=`, `>`, `<`, `>=`, `<=`
- Logical operators: `&&`, `||`, `!`
- Operator precedence and expression evaluation order

## Files

| File | Description |
|------|-------------|
| `ArithmeticOperators.java` | Integer and floating-point arithmetic operations |
| `RelationalOperators.java` | Comparison between two integers |
| `LogicalOperators.java` | AND, OR, NOT with boolean and combined conditions |
| `OperatorPrecedence.java` | Mixed expressions to understand evaluation order |

## Key Concepts

```java
// Precedence: * and / before + and -
int result = 10 + 2 * 5;   // 20, not 60

// Logical short-circuit
boolean check = (a >= 18) && (a < 60);
```

## How to Run

```bash
javac ArithmeticOperators.java
java ArithmeticOperators
```
