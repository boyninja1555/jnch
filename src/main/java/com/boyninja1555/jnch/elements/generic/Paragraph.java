package com.boyninja1555.jnch.elements.generic;

import com.boyninja1555.jnch.elements.generic.lib.GenericElement;
import com.boyninja1555.jnch.elements.lib.Attribute;
import com.boyninja1555.jnch.elements.lib.Element;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Paragraph extends GenericElement {

    public Paragraph(@NotNull List<Attribute> attributes, @NotNull Element... children) {
        super(attributes, children);
    }

    public Paragraph(@NotNull List<Attribute> attributes, @NotNull String... children) {
        super(attributes, children);
    }

    public Paragraph(@NotNull Element... children) {
        super(children);
    }

    public Paragraph(@NotNull String... children) {
        super(children);
    }

    @Override
    public @NotNull String tagName() {
        return "p";
    }

    @Override
    public boolean selfClosing() {
        return false;
    }
}
