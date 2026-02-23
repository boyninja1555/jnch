package com.boyninja1555.jnch.elements.generic;

import com.boyninja1555.jnch.elements.generic.lib.GenericElement;
import com.boyninja1555.jnch.elements.lib.Attribute;
import com.boyninja1555.jnch.elements.lib.Element;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class H1 extends GenericElement {

    public H1(@NotNull List<Attribute> attributes, @NotNull Element... children) {
        super(attributes, children);
    }

    public H1(@NotNull List<Attribute> attributes, @NotNull String... children) {
        super(attributes, children);
    }

    public H1(@NotNull Element... children) {
        super(children);
    }

    public H1(@NotNull String... children) {
        super(children);
    }

    @Override
    public @NotNull String tagName() {
        return "h1";
    }

    @Override
    public boolean selfClosing() {
        return false;
    }
}
