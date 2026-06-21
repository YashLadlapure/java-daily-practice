# Day 02 — Variables & Data Types

**Date:** June 21, 2026

## Topics covered

- Primitive types: `int`, `double`, `char`, `boolean`
- Reference type: `String`
- Widening and narrowing type casting
- Arithmetic expressions and integer division
- String concatenation with `+`

## Files

| File | What it covers |
|---|---|
| `DataTypes.java` | Declaring and printing all basic types |
| `TypeCasting.java` | Implicit widening, explicit narrowing, char to int |
| `Expressions.java` | Arithmetic operators, integer vs double division, string concat |

## Key learnings

- Integer division drops the decimal — need to cast to `double` to get the full result
- `char` stores a single character but is backed by a numeric ASCII value
- `String` is not a primitive; it is a class, which is why it starts with a capital letter
- Widening casting (int → double) is automatic; narrowing (double → int) needs explicit cast and truncates, not rounds
