# Day 6 — Switch

## Topics Covered
- `switch` statement syntax: `case`, `break`, `default`
- Menu-based programs using integer choices
- Simple calculator using `switch`
- Grouping multiple cases (fall-through for seasons)

## Files

| File | Description |
|------|-------------|
| `SimpleSwitchDemo.java` | Basic 3-option menu using switch |
| `CalculatorSwitch.java` | 4-operation calculator via menu input |
| `DayOfWeek.java` | Maps numbers 1–7 to weekday names |
| `SeasonFinder.java` | Groups months into seasons using case fall-through |

## Key Concepts

```java
// Basic switch
switch (choice) {
    case 1:
        // ...
        break;
    default:
        // runs when no case matches
}

// Case grouping (intentional fall-through)
case 12:
case 1:
case 2:
    season = "Winter";
    break;
```

## How to Run

```bash
javac CalculatorSwitch.java
java CalculatorSwitch
```
