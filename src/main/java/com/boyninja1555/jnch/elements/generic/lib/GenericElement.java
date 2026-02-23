package com.boyninja1555.jnch.elements.generic.lib;

import com.boyninja1555.jnch.elements.lib.Attribute;
import com.boyninja1555.jnch.elements.lib.Element;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@ApiStatus.Internal
public abstract class GenericElement extends Element {

    public GenericElement(@NotNull List<Attribute> attributes, @NotNull Element... children) {
        super(attributes, children);
    }

    public GenericElement(@NotNull List<Attribute> attributes, @NotNull String... children) {
        super(attributes, children);
    }

    public GenericElement(@NotNull Element... children) {
        this(List.of(), children);
    }

    public GenericElement(@NotNull String... children) {
        this(List.of(), children);
    }
}
