# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Java learning project focused on practicing Java Stream API examples. The project name "100_Stream_Programs" indicates this is a collection of Stream API exercises and demonstrations.

## Project Structure

- `src/Main.java` - Contains Stream API examples as static methods called from main()
- Plain Java project (no Maven/Gradle) configured for IntelliJ IDEA

## Development Commands

**Compile and run:**
```bash
javac src/Main.java -d out/
java -cp out/ Main
```

**Run in IntelliJ IDEA:**
- Open the project in IntelliJ IDEA
- Right-click on Main.java and select "Run 'Main.main()'"

## Architecture

The codebase follows a simple tutorial/example structure:
- Each Stream API example is implemented as a static method in the Main class
- Methods are called sequentially from the main() method
- Each example demonstrates a specific Stream API operation or pattern

## Adding New Stream Examples

When adding new Stream examples:
1. Create a new static method in Main class with a descriptive name (e.g., `filterEvenNumbers()`, `mapToUpperCase()`)
2. Add a comment header indicating what Stream operation is being demonstrated
3. Call the method from main()
4. Include console output to show the results
