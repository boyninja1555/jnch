package com.boyninja1555.jnch.elements.lib;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Attribute {
    private @NotNull String name;
    private @Nullable String value;

    public @NotNull String name() {
        return name;
    }

    public void name(@NotNull String name) {
        this.name = name;
    }

    public @Nullable String value() {
        return value;
    }

    public void value(@Nullable String value) {
        this.value = value;
    }

    public Attribute(@NotNull String name, @Nullable String value) {
        name(name);
        value(value);
    }

    public Attribute(@NotNull String name) {
        this(name, null);
    }
}
