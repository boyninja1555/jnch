package com.boyninja1555.jnch.elements.selfclosesimple.lib;

import com.boyninja1555.jnch.elements.lib.Attribute;
import com.boyninja1555.jnch.elements.lib.Element;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

@ApiStatus.Internal
public abstract class SelfClosingSimpleElement extends Element {

    public SelfClosingSimpleElement(@NotNull Attribute... attributes) {
        super(Arrays.asList(attributes), new Element[0]);
    }
}
