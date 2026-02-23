package com.boyninja1555.jnch.elements.selfclosesimple;

import com.boyninja1555.jnch.elements.lib.Attribute;
import com.boyninja1555.jnch.elements.selfclosesimple.lib.SelfClosingSimpleElement;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class Img extends SelfClosingSimpleElement {

    public Img(@NotNull String src, @NotNull Attribute... attributes) {
        List<Attribute> attributeList = Arrays.asList(attributes);
        attributeList.add(new Attribute("src", src));
        super(attributeList.toArray(new Attribute[0]));
    }

    public Img(@NotNull String src) {
        super(new Attribute("src", src));
    }

    @Override
    public @NotNull String tagName() {
        return "img";
    }

    @Override
    public boolean selfClosing() {
        return true;
    }
}
