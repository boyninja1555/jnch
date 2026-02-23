package com.boyninja1555.jnch;

import com.boyninja1555.jnch.elements.generic.Div;
import com.boyninja1555.jnch.elements.generic.Paragraph;
import com.boyninja1555.jnch.elements.lib.Attribute;
import com.boyninja1555.jnch.elements.lib.Element;
import com.boyninja1555.jnch.elements.lib.Text;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JNCH {

    /**
     * CSS inline styles helper you can directly plug into an attribute's value.
     *
     * @param styles Attributes being used as key-value pairs for inline CSS (create each with style() for readability)
     * @return Inline CSS (String)
     */
    public static String styles(Attribute... styles) {
        return String.join("; ", Arrays.stream(styles).map(s -> s.name() + ": " + s.value()).toList());
    }

    /**
     * HTML tag attribute helper.
     *
     * @param name  Attribute name
     * @param value Attribute value (automatically converted to String)
     * @return New Attribute class
     */
    public static Attribute style(String name, Object value) {
        return new Attribute(name, value.toString());
    }

    /**
     * HTML tag multi-attribute helper.
     *
     * @param name1  Attribute 1 - Name
     * @param value1 Attribute 1 - Value
     * @param name2  Attribute 2 - Name
     * @param value2 Attribute 2 - Value
     * @param name3  Attribute 3 - Name
     * @param value3 Attribute 3 - Value
     * @param name4  Attribute 4 - Name
     * @param value4 Attribute 4 - Value
     * @param name5  Attribute 5 - Name
     * @param value5 Attribute 5 - Value
     * @param name6  Attribute 6 - Name
     * @param value6 Attribute 6 - Value
     * @param name7  Attribute 7 - Name
     * @param value7 Attribute 7 - Value
     * @param name8  Attribute 8 - Name
     * @param value8 Attribute 8 - Value
     * @return New {@literal List<Attribute>}
     */
    public static List<Attribute> attributes(String name1, Object value1, String name2, Object value2, String name3, Object value3, String name4, Object value4, String name5, Object value5, String name6, Object value6, String name7, Object value7, String name8, Object value8) {
        return new ArrayList<>(List.of(attribute(name1, value1), attribute(name2, value2), attribute(name3, value3), attribute(name4, value4), attribute(name5, value5), attribute(name6, value6), attribute(name7, value7), attribute(name8, value8)));
    }

    /**
     * HTML tag multi-attribute helper.
     *
     * @param name1  Attribute 1 - Name
     * @param value1 Attribute 1 - Value
     * @param name2  Attribute 2 - Name
     * @param value2 Attribute 2 - Value
     * @param name3  Attribute 3 - Name
     * @param value3 Attribute 3 - Value
     * @param name4  Attribute 4 - Name
     * @param value4 Attribute 4 - Value
     * @param name5  Attribute 5 - Name
     * @param value5 Attribute 5 - Value
     * @param name6  Attribute 6 - Name
     * @param value6 Attribute 6 - Value
     * @param name7  Attribute 7 - Name
     * @param value7 Attribute 7 - Value
     * @return New {@literal List<Attribute>}
     */
    public static List<Attribute> attributes(String name1, Object value1, String name2, Object value2, String name3, Object value3, String name4, Object value4, String name5, Object value5, String name6, Object value6, String name7, Object value7) {
        return new ArrayList<>(List.of(attribute(name1, value1), attribute(name2, value2), attribute(name3, value3), attribute(name4, value4), attribute(name5, value5), attribute(name6, value6), attribute(name7, value7)));
    }

    /**
     * HTML tag multi-attribute helper.
     *
     * @param name1  Attribute 1 - Name
     * @param value1 Attribute 1 - Value
     * @param name2  Attribute 2 - Name
     * @param value2 Attribute 2 - Value
     * @param name3  Attribute 3 - Name
     * @param value3 Attribute 3 - Value
     * @param name4  Attribute 4 - Name
     * @param value4 Attribute 4 - Value
     * @param name5  Attribute 5 - Name
     * @param value5 Attribute 5 - Value
     * @param name6  Attribute 6 - Name
     * @param value6 Attribute 6 - Value
     * @return New {@literal List<Attribute>}
     */
    public static List<Attribute> attributes(String name1, Object value1, String name2, Object value2, String name3, Object value3, String name4, Object value4, String name5, Object value5, String name6, Object value6) {
        return new ArrayList<>(List.of(attribute(name1, value1), attribute(name2, value2), attribute(name3, value3), attribute(name4, value4), attribute(name5, value5), attribute(name6, value6)));
    }

    /**
     * HTML tag multi-attribute helper.
     *
     * @param name1  Attribute 1 - Name
     * @param value1 Attribute 1 - Value
     * @param name2  Attribute 2 - Name
     * @param value2 Attribute 2 - Value
     * @param name3  Attribute 3 - Name
     * @param value3 Attribute 3 - Value
     * @param name4  Attribute 4 - Name
     * @param value4 Attribute 4 - Value
     * @param name5  Attribute 5 - Name
     * @param value5 Attribute 5 - Value
     * @return New {@literal List<Attribute>}
     */
    public static List<Attribute> attributes(String name1, Object value1, String name2, Object value2, String name3, Object value3, String name4, Object value4, String name5, Object value5) {
        return new ArrayList<>(List.of(attribute(name1, value1), attribute(name2, value2), attribute(name3, value3), attribute(name4, value4), attribute(name5, value5)));
    }

    /**
     * HTML tag multi-attribute helper.
     *
     * @param name1  Attribute 1 - Name
     * @param value1 Attribute 1 - Value
     * @param name2  Attribute 2 - Name
     * @param value2 Attribute 2 - Value
     * @param name3  Attribute 3 - Name
     * @param value3 Attribute 3 - Value
     * @param name4  Attribute 4 - Name
     * @param value4 Attribute 4 - Value
     * @return New {@literal List<Attribute>}
     */
    public static List<Attribute> attributes(String name1, Object value1, String name2, Object value2, String name3, Object value3, String name4, Object value4) {
        return new ArrayList<>(List.of(attribute(name1, value1), attribute(name2, value2), attribute(name3, value3), attribute(name4, value4)));
    }

    /**
     * HTML tag multi-attribute helper.
     *
     * @param name1  Attribute 1 - Name
     * @param value1 Attribute 1 - Value
     * @param name2  Attribute 2 - Name
     * @param value2 Attribute 2 - Value
     * @param name3  Attribute 3 - Name
     * @param value3 Attribute 3 - Value
     * @return New {@literal List<Attribute>}
     */
    public static List<Attribute> attributes(String name1, Object value1, String name2, Object value2, String name3, Object value3) {
        return new ArrayList<>(List.of(attribute(name1, value1), attribute(name2, value2), attribute(name3, value3)));
    }

    /**
     * HTML tag multi-attribute helper.
     *
     * @param name1  Attribute 1 - Name
     * @param value1 Attribute 1 - Value
     * @param name2  Attribute 2 - Name
     * @param value2 Attribute 2 - Value
     * @return New {@literal List<Attribute>}
     */
    public static List<Attribute> attributes(String name1, Object value1, String name2, Object value2) {
        return new ArrayList<>(List.of(attribute(name1, value1), attribute(name2, value2)));
    }

    /**
     * HTML tag multi-attribute helper.
     *
     * @param name  Attribute 1 - Name
     * @param value Attribute 1 - Value
     * @return New {@literal List<Attribute>}
     */
    public static List<Attribute> attributes(String name, Object value) {
        return new ArrayList<>(List.of(attribute(name, value)));
    }

    /**
     * HTML tag multi-attribute helper.
     *
     * @param attributes List of Attribute classes
     * @return New {@literal List<Attribute>}
     */
    public static List<Attribute> attributes(Attribute... attributes) {
        return new ArrayList<>(Arrays.asList(attributes));
    }

    /**
     * HTML tag attribute helper.
     *
     * @param name  Attribute name
     * @param value Attribute value (automatically converted to String)
     * @return New Attribute class
     */
    public static Attribute attribute(String name, Object value) {
        return new Attribute(name, value.toString());
    }

    /**
     * HTML text (used as a regular element for simplicity).
     *
     * @return New Text class
     */
    public static Text text(@NotNull String text) {
        return new Text(text);
    }

    /**
     * HTML {@code <div>} tag.
     *
     * @param attributes Attributes applied to element
     * @param children   Children inside element's tree structure
     * @return New Div class
     */
    public static Div div(@NotNull List<Attribute> attributes, @NotNull Element... children) {
        return new Div(attributes, children);
    }

    /**
     * HTML {@code <div>} tag.
     *
     * @param attributes Attributes applied to element
     * @param children   Children inside element's tree structure
     * @return New Div class
     */
    public static Div div(@NotNull List<Attribute> attributes, @NotNull String... children) {
        return new Div(attributes, children);
    }

    /**
     * HTML {@code <div>} tag.
     *
     * @param children Children inside element's tree structure
     * @return New Div class
     */
    public static Div div(@NotNull Element... children) {
        return new Div(children);
    }

    /**
     * HTML {@code <div>} tag.
     *
     * @param children Children inside element's tree structure
     * @return New Div class
     */
    public static Div div(@NotNull String... children) {
        return new Div(children);
    }

    /**
     * HTML {@code <p>} tag.
     *
     * @param attributes Attributes applied to element
     * @param children   Children inside element's tree structure
     * @return New Paragraph class
     */
    public static Paragraph p(@NotNull List<Attribute> attributes, @NotNull Element... children) {
        return new Paragraph(attributes, children);
    }

    /**
     * HTML {@code <p>} tag.
     *
     * @param attributes Attributes applied to element
     * @param children   Children inside element's tree structure
     * @return New Paragraph class
     */
    public static Paragraph p(@NotNull List<Attribute> attributes, @NotNull String... children) {
        return new Paragraph(attributes, children);
    }

    /**
     * HTML {@code <p>} tag.
     *
     * @param children Children inside element's tree structure
     * @return New Paragraph class
     */
    public static Paragraph p(@NotNull Element... children) {
        return new Paragraph(children);
    }

    /**
     * HTML {@code <p>} tag.
     *
     * @param children Children inside element's tree structure
     * @return New Paragraph class
     */
    public static Paragraph p(@NotNull String... children) {
        return new Paragraph(children);
    }

    /**
     * Renders the input element as an HTML tree starting from its root.
     *
     * @param element Input element
     * @return Unformatted HTML string
     */
    public static String render(Element element) {
        return element.render();
    }
}
