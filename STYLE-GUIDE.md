<div align="center">
    <h1>JavaNativeCallsToHtml (JNCH) Code Style Guide</h1>
</div>

**JavaNativeCallsToHtml** follows a strict and consistent code style designed by the project creator with the pattern recognition skills of ChatGPT. The purpose of this guide is to document structural and formatting conventions used throughout the project.

---

## 1. File & Type Definition

- Each Java file declares a single top-level type (class, enum, record, etc.).
- A blank line follows the class definition unless a field declaration immediately follows.
- Javadoc is used for architectural explanation, not trivial comments. Only use those if a line isn't self-explanatory.

---

## 2. Member Ordering

Members inside a class follow this order:

1. Fields (private)
2. Accessor methods
3. Constructors
4. Abstract method declarations
5. Concrete methods

This order is consistent across all classes.

---

## 3. Fields

- Fields are private whenever possible.
- Constructor arguments that are collections are defensively copied.
- Annotations such as `@NotNull` are written inline with the type.

Example:

```java
private final @NotNull List<Element> children;
```

---

## 4. Accessors

- Accessor methods directly return the backing field.
- No additional logic or temporary variables are introduced unless necessary.

---

## 5. Control Flow

- `if`, `for`, and other control-flow statements do not use braces unless required for logic.
- Single-line control-flow statements remain on one line unless automatic formatting expands them.
- Braces are only used when multiple statements are required.

Example:

```java
for (Element element : children)
    tag.append(element.render());
```

---

## 6. Expression Style

- Temporary variables are avoided when unnecessary.
- Expressions may be chained for clarity and compactness.
- Methods favor direct returns instead of intermediate assignments.

---

## 7. Spacing & Layout

- Logical sections of a class are separated by a single blank line.
- No excessive vertical padding inside methods.
- Formatting should remain compatible with default IntelliJ formatting.

---

## 8. Immutability & Safety

- Internal collections are not exposed directly without intent.
- Incoming collections are copied rather than stored directly.
- Immutability is preferred wherever practical.

---

## 9. Rendering & Logic Structure

- Methods favor linear, readable construction over unnecessary abstraction.
- Helper methods are introduced only when they meaningfully improve clarity.
- Straightforward procedural flow is preferred over fragmentation.

---

This style is intentional and consistent. Contributions should adhere to these structural and formatting conventions to maintain uniformity across the project. And one more thing: Please keep everything as object-oriented as possible, will you?