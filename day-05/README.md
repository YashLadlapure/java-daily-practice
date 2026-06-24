# Day 5 — If / Else

## Topics Covered
- Simple `if`, `else if`, `else` conditions
- Nested `if` statements
- Grading system using chained conditions
- Finding min and max of two numbers using ternary operator

## Files

| File | Description |
|------|-------------|
| `SimpleConditions.java` | Checks if a number is positive, negative, or zero |
| `GradeChecker.java` | Assigns grade A–F based on marks input |
| `MinMax.java` | Finds minimum and maximum of two numbers |
| `NestedIf.java` | Access control using nested if conditions |

## Key Concepts

```java
// Chained if-else
if (marks >= 90) grade = "A";
else if (marks >= 75) grade = "B";
else grade = "F";

// Ternary operator
int min = (a < b) ? a : b;

// Nested if
if (age >= 18) {
    if (hasID == 1) { ... }
}
```

## How to Run

```bash
javac GradeChecker.java
java GradeChecker
```
