# Day 8 — For Loop

## Topics Covered
- Basic `for` loop syntax
- Multiplication tables
- Factorial using a for loop
- Sum of digits of a number
- Reversing a number using loop logic

## Files

| File | Description |
|------|-------------|
| `MultiplicationTable.java` | Prints multiplication table for any number |
| `Factorial.java` | Computes n! using a for loop |
| `SumOfDigits.java` | Adds up individual digits of an integer |
| `ReverseNumber.java` | Reverses digits of a number using a for loop |

## Key Concepts

```java
// Standard for loop
for (int i = 1; i <= 10; i++) {
    // body
}

// Extracting digits
while (n > 0) {
    int digit = n % 10;
    n /= 10;
}
```

## How to Run

```bash
javac MultiplicationTable.java
java MultiplicationTable
```
