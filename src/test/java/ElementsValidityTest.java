import org.junit.jupiter.api.Test;

import static com.boyninja1555.jnch.JNCH.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementsValidityTest {

    @Test
    void testDiv() {
        assertEquals("<div>Hello!</div>", render(div("Hello!")));
        assertEquals("<div class=\"hello\">Hello!</div>", render(div(attributes("class", "hello"), "Hello!")));
        assertEquals("<div style=\"color: red;\">Hello!</div>", render(div(attributes("style", styles(style("color", "red"))), "Hello!")));
    }

    @Test
    void testP() {
        assertEquals("<p>Hello!</p>", render(p("Hello!")));
    }

    @Test
    void testA() {
        assertEquals("<a href=\"https://example.com\">Hello!</a>", render(a("https://example.com", "Hello!")));
    }
}
