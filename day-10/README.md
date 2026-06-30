# Day 10 — Patterns (Loops)

## Topics Covered
- Nested `for` loops for row and column control
- Left- and right-aligned star triangles
- Centered star pyramid
- Number triangle pattern
- Inverted triangle

## Files

| File | Description |
|------|-------------|
| `LeftTriangleStars.java` | Left-aligned increasing triangle of `*` |
| `RightTriangleStars.java` | Right-aligned triangle using spaces + `*` |
| `PyramidStars.java` | Centered pyramid star pattern |
| `NumberTriangle.java` | Triangle using numbers 1..n per row |
| `InvertedTriangle.java` | Upside-down left triangle of `*` |

## Key Concepts

```java
// Outer loop = rows, inner loop = columns
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println(); // move to next line after each row
}
```

## How to Run

```bash
javac PyramidStars.java
java PyramidStars
```
