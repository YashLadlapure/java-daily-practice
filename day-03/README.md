# Day 3 — Input and Output

## Topics Covered
- `Scanner` class for reading user input
- Reading strings, integers, and decimals
- Basic echo programs
- Handling the newline buffer between `nextInt()` and `nextLine()`

## Files

| File | Description |
|------|-------------|
| `BasicInput.java` | Reads name and age, prints a greeting |
| `EchoProgram.java` | Echoes user input and counts characters |
| `MultiTypeInput.java` | Demonstrates reading multiple data types with Scanner |

## Key Concepts

```java
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();   // reads full line
int age = sc.nextInt();        // reads integer
double d = sc.nextDouble();    // reads decimal
sc.close();                    // always close scanner
```

## How to Run

```bash
javac BasicInput.java
java BasicInput
```
