# Cognizant Deep Skilling — Java Design Patterns

Worked exercises from the Cognizant Deep Skilling design patterns module. Each
folder is a small, standalone Java project demonstrating one Gang-of-Four
pattern: a couple of source classes plus a runnable test class with a
`main()` method.

## Exercises

| # | Pattern | Project | Scenario |
|---|---------|---------|----------|
| 1 | Singleton | [SingletonPatternExample](SingletonPatternExample) | A single shared `Logger` instance across the app |
| 2 | Factory Method | [FactoryMethodPatternExample](FactoryMethodPatternExample) | Creating Word/PDF/Excel documents via factories |
| 3 | Builder | [BuilderPatternExample](BuilderPatternExample) | Assembling `Computer` configurations step by step |
| 4 | Adapter | [AdapterPatternExample](AdapterPatternExample) | Unifying PayPal/Stripe gateways behind one interface |
| 5 | Decorator | [DecoratorPatternExample](DecoratorPatternExample) | Stacking Email/SMS/Slack notification channels |
| 6 | Proxy | [ProxyPatternExample](ProxyPatternExample) | Lazy-loading and caching remote images |
| 7 | Observer | [ObserverPatternExample](ObserverPatternExample) | Notifying subscribers of stock price changes |
| 8 | Strategy | [StrategyPatternExample](StrategyPatternExample) | Swapping payment methods at runtime |
| 9 | Command | [CommandPatternExample](CommandPatternExample) | Issuing on/off commands to home devices |

## Running an exercise

Each project compiles independently:

```bash
cd FactoryMethodPatternExample
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
