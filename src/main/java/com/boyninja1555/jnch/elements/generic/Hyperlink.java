package com.boyninja1555.jnch.elements.generic;

import com.boyninja1555.jnch.elements.generic.lib.GenericElement;
import com.boyninja1555.jnch.elements.lib.Attribute;
import com.boyninja1555.jnch.elements.lib.Element;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Hyperlink extends GenericElement {

    public Hyperlink(@NotNull String href, @NotNull List<Attribute> attributes, @NotNull Element... children) {
        List<Attribute> attributeList = new ArrayList<>(attributes);
        attributeList.add(new Attribute("href", href));
        super(attributeList, children);
    }

    public Hyperlink(@NotNull String href, @NotNull List<Attribute> attributes, @NotNull String... children) {
        List<Attribute> attributeList = new ArrayList<>(attributes);
        attributeList.add(new Attribute("href", href));
        super(attributeList, children);
    }

    public Hyperlink(@NotNull String href, @NotNull Element... children) {
        super(List.of(new Attribute("href", href)), children);
    }

    public Hyperlink(@NotNull String href, @NotNull String... children) {
        super(List.of(new Attribute("href", href)), children);
    }

    @Override
    public @NotNull String tagName() {
        return "a";
    }

    @Override
    public boolean selfClosing() {
        return false;
    }
}
