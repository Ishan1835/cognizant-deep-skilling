# Cognizant Deep Skilling — Java Design Patterns

Worked exercises from the Cognizant Deep Skilling design patterns module.
[Week1](Week1) holds the week 1 exercises — nine small, standalone Java
projects, each demonstrating one Gang-of-Four pattern with a couple of
source classes plus a runnable test class with a `main()` method.

## Week 1 — Design Patterns

| # | Pattern | Project | Scenario |
|---|---------|---------|----------|
| 1 | Singleton | [SingletonPatternExample](Week1/SingletonPatternExample) | A single shared `Logger` instance across the app |
| 2 | Factory Method | [FactoryMethodPatternExample](Week1/FactoryMethodPatternExample) | Creating Word/PDF/Excel documents via factories |
| 3 | Builder | [BuilderPatternExample](Week1/BuilderPatternExample) | Assembling `Computer` configurations step by step |
| 4 | Adapter | [AdapterPatternExample](Week1/AdapterPatternExample) | Unifying PayPal/Stripe gateways behind one interface |
| 5 | Decorator | [DecoratorPatternExample](Week1/DecoratorPatternExample) | Stacking Email/SMS/Slack notification channels |
| 6 | Proxy | [ProxyPatternExample](Week1/ProxyPatternExample) | Lazy-loading and caching remote images |
| 7 | Observer | [ObserverPatternExample](Week1/ObserverPatternExample) | Notifying subscribers of stock price changes |
| 8 | Strategy | [StrategyPatternExample](Week1/StrategyPatternExample) | Swapping payment methods at runtime |
| 9 | Command | [CommandPatternExample](Week1/CommandPatternExample) | Issuing on/off commands to home devices |

## Running an exercise

Each project compiles independently:

```bash
cd Week1/FactoryMethodPatternExample
javac -d out src/*.java
java -cp out FactoryMethodTest
```

Or run every exercise in one go from the repo root:

```bash
./run_all.sh
```

## Requirements

- JDK 17+ (developed against JDK 26)
- No external dependencies — plain `javac`/`java`

## Debugging in VS Code

`.vscode/launch.json` has a ready-made debug configuration for every test
class (e.g. "Debug SingletonTest"). Install the "Extension Pack for Java",
open the Run and Debug panel, pick a configuration, and set breakpoints in
the corresponding source files.
