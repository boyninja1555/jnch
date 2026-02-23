package com.boyninja1555.jnch.elements.lib;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Special type of element that only renders text.
 */
public class Text extends Element {
    private final @NotNull String text;

    public @NotNull String text() {
        return text;
    }

    public Text(@NotNull String text) {
        super(List.of(), new Element[0]);
        this.text = text;
    }

    @Override
    public @NotNull String tagName() {
        return "";
    }

    @Override
    public boolean selfClosing() {
        return false;
    }

    /**
     * Renders just text.
     *
     * @return Text
     */
    @Override
    public String render() {
        return text;
    }
}
