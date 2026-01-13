# AI Agent Instructions for java_2026

## Project Overview
This is an educational Java exercise repository focusing on **file I/O operations** (Chapter 17 content). Two exercises demonstrate:
1. **exercise1_starter.java**: Text file I/O with append mode and random data generation
2. **exercise2_starter.java**: Binary file I/O with DataInputStream/DataOutputStream for mixed data types

## Key Codebase Patterns

### File I/O Conventions
- **Text Output**: Use `FileOutputStream` with `PrintWriter` for text data (Exercise 1)
- **Binary Output**: Use `DataOutputStream` wrapping `FileOutputStream` for typed data (Exercise 2)
- **File Modes**: Always use append mode (`new FileWriter(..., true)`) to preserve existing data
- **Resource Management**: Ensure streams are closed in finally blocks or try-with-resources statements

### Data Writing Patterns
- **Random integers**: Generated via `(int)(Math.random() * 100)` for 0-99 range
- **Mixed-type serialization**: Write primitives in order (int[], long, double) using typed write methods
- **Timestamps**: Store Date objects as `currentTime.getTime()` (long milliseconds)

### Data Reading Patterns
- **Sequential reading**: Read data in same order as written (order matters for binary files)
- **Array reading**: Loop exactly N times matching write count; avoid end-of-stream assumptions
- **Type consistency**: Use matching read methods (readInt, readLong, readDouble) to write methods

## Common Issues & Solutions

| Issue | Solution |
|-------|----------|
| Data corruption on re-write | Use append mode (`FileWriter(..., true)`) not overwrite mode |
| EOF exceptions during array read | Use fixed-count loops instead of sentinel value (-1) checks |
| Type mismatches in binary I/O | Maintain write/read order and types strictly |
| Unclosed streams | Use try-with-resources: `try (DataOutputStream out = ...)` |

## Testing & Validation
- Verify output files exist after write: check `Exercise17_01.txt` and `Exercise17_02.dat`
- Validate binary reads match written values before test assertions
- Check file size for binary files (5 ints × 4 bytes + long 8 bytes + double 8 bytes = ~36 bytes minimum)

## File References
- `exercise1_starter.java`: Example of FileOutputStream for text, append pattern
- `exercise2_starter.java`: Example of DataInputStream/DataOutputStream for binary mixed types
