# Design Patterns in Java

Small, runnable examples of classic Gang of Four design patterns. I use these patterns when designing test automation frameworks: factories for driver and page creation, singletons for shared driver and config instances, and decorators for adding logging or retries around actions.

## Patterns

| Package | Pattern | Example | Run |
|---|---|---|---|
| `simplefactory` | Simple Factory | `ShapeFactory` returns a `Circle`, `Square` or `Rectangle` from a string | `simplefactory.FireFactoryPatternDemo` |
| `factorypattern` | Factory Method | `ShapeFactoryCreator` with `BalancedFactoryCreator` and `RandomFactoryCreator` subclasses | `factorypattern.FireFactoryPatternDemo` |
| `singleton` | Singleton | Lazily created single instance with a private constructor | `singleton.Fire` |
| `decorator` | Decorator | Beverages (`Expresso`, `Decaf`) wrapped with add-ons (`SoyMilk`, `Vanila`) to build up cost and description | `decorator.Fire` |

## How it maps to test automation

- **Factory:** choose an Android, iOS or web driver at runtime from config.
- **Singleton:** share one driver or config reader across steps and page objects.
- **Decorator:** wrap element actions with logging, screenshots or retries without changing page objects.

## Run it

Requires Java and Maven.

```bash
mvn compile
java -cp target/classes simplefactory.FireFactoryPatternDemo
```

Or open the project in Eclipse/IntelliJ and run any of the classes in the **Run** column.
