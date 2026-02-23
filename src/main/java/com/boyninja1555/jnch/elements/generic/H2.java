package com.boyninja1555.jnch.elements.generic;

import com.boyninja1555.jnch.elements.generic.lib.GenericElement;
import com.boyninja1555.jnch.elements.lib.Attribute;
import com.boyninja1555.jnch.elements.lib.Element;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class H2 extends GenericElement {

    public H2(@NotNull List<Attribute> attributes, @NotNull Element... children) {
        super(attributes, children);
    }

    public H2(@NotNull List<Attribute> attributes, @NotNull String... children) {
        super(attributes, children);
    }

    public H2(@NotNull Element... children) {
        super(children);
    }

    public H2(@NotNull String... children) {
        super(children);
    }

    @Override
    public @NotNull String tagName() {
        return "h2";
    }

    @Override
    public boolean selfClosing() {
        return false;
    }
}
