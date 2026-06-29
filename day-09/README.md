# Day 9 — Do-While Loop

## Topics Covered
- `do-while` loop syntax — body runs at least once
- Input validation: keep asking until valid input
- Repeat menus: loop back to menu until user exits
- Accumulating input until a sentinel value (0)

## Files

| File | Description |
|------|-------------|
| `InputValidation.java` | Keeps asking until user enters a positive number |
| `RepeatMenu.java` | Menu that repeats until user chooses Exit |
| `GuessTheNumber.java` | Guess a fixed number with high/low hints |
| `SumUntilZero.java` | Adds numbers until user enters 0 |

## Key Concepts

```java
// do-while always runs the body at least once
do {
    // body
} while (condition);

// vs while — may skip body entirely if condition is false initially
while (condition) {
    // body
}
```

## How to Run

```bash
javac RepeatMenu.java
java RepeatMenu
```
