<div align="center">
    <h1>JavaNativeCallsToHtml (JNCH)</h1>
</div>

**JavaNativeCallsToHtml**, or **JNCH**, is a Java library for generating HTML using plain Java function calls.

No templates,  
No XML,  
No reflection magic,  
No framework bloat?

Just Java → HTML!

---

## What Is This?

JNCH is a lightweight HTML DSL for Java.  
You write Java. You get HTML.  
Your code goes from:

```java
render(
    div(
        h1("Hello"),
        p("world!")
    )
);
```

To:

```html
<div>
    <h1>Hello</h1>
    <p>world!</p>
</div>
```

---

## Philosophy

### What You Write Is What You Get.

JNCH does not:
- Merge attributes
- Deduplicate classes
- “Fix” invalid markup
- Interpret your intent
- Inject opinions

If you write it, it renders it.

You are responsible.  
The library just does what it's told.

---

## Why Not Just Use Templates?

Because:

- Java already has types.
- Java already has logic.
- Java already has conditionals and loops.
- Java already compiles.

JNCH lets you stay inside the language you're already using.

No string concatenation spaghetti.  
No template language learning curve.  
No mixing logic into HTML with weird delimiters.

---

## Static Generation

JNCH works perfectly for:

- Static site generation
- Build-time HTML generation
- CLI-based page generation
- Writing files directly to disk

It's just Java returning a string.

You can render once and write to a file.
Done.

---

## SSR

Because JNCH is just a library, it works naturally for server-side rendering:

- Servlets
- Spring
- Netty
- Custom HTTP servers

Call `render()` inside your handler.  
Send the result to the client.

No runtime DOM.  
No hydration system.  
No virtual DOM.

Just HTML.

---

## Attributes

Short syntax:

```java
div(
    attributes("class", "container", "id", "main"),
    p("Content")
);
```

Unlimited attributes are supported via varargs.  
JNCH does not impose artificial limits.

Varargs syntax:

```java
div(
    attributes(attribute("class", "container"), attribute("id", "main")),
    p("Content")
);
```

---

## Components

If you decide to have them, components are just Java methods:

```java
public static Element card(String title, String body) {
    return div(
        h2(title),
        p(body)
    );
}
```

No special component system required!

---

## Goals

- Deterministic output
- Zero magic
- Minimal abstraction
- Easy SSR
- Easy static generation
- Clean Java DSL

---

## Non-Goals

JNCH is not:

- A frontend framework
- A React clone
- A templating engine with logic syntax
- A hydration system

It generates HTML.  
That's the job.

---

## Status

Work in progress.

But the foundation is simple:
Java → Element tree → Render → HTML.

---

## Contributing

Contributions often involve following the [MIT license](LICENSE.md) and [style guide](STYLE-GUIDE.md). Failure to follow these in most cases will result in your pull request being denied, or a direct violation of our license. Other than that, free country! Well, depends on where you live.

---

It’s called **JavaNativeCallsToHtml** because that’s exactly what it does.  
Nothing more. Nothing less.