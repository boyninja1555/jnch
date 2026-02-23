package com.boyninja1555.jnch.elements.lib;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Internal element class used for default rendering and widespread data. This includes tag names, attributes, self-closing, and optional children for a tree-like syntax. Most elements inherit from this class.
 */
@ApiStatus.Internal
public abstract class Element {
    private final @NotNull List<Attribute> attributes;
    private final @NotNull List<Element> children;

    public @NotNull List<Attribute> attributes() {
        return attributes;
    }

    public @NotNull List<Element> children() {
        return children;
    }

    public Element(@NotNull List<Attribute> attributes, @NotNull Element... children) {
        this.attributes = new ArrayList<>(attributes);
        this.children = new ArrayList<>(Arrays.asList(children));
    }

    public Element(@NotNull List<Attribute> attributes, @NotNull String... children) {
        this(attributes, Arrays.stream(children).map(Text::new).toList().toArray(new Text[0]));
    }

    public abstract @NotNull String tagName();

    public abstract boolean selfClosing();

    /**
     * Default rendering method. Most HTML elements use this exact syntax, with some exceptions such as the text element (technically not a tag, just a representation of text as an element).
     *
     * @return Unformatted HTML string
     */
    public String render() {
        StringBuilder tag = new StringBuilder("<" + tagName());

        for (Attribute attribute : attributes)
            tag.append(" ").append(attribute.name()).append("=\"").append(attribute.value()).append("\"");

        if (selfClosing()) {
            tag.append("/>");
            return tag.toString();
        }

        tag.append(">");

        for (Element element : children)
            tag.append(element.render());

        tag.append("</").append(tagName()).append(">");
        return tag.toString();
    }
}
