package io.codejournal.hackerrank.java.intro;

import static io.codejournal.hackerrank.java.intro.IfElse.NOT_WEIRD;
import static io.codejournal.hackerrank.java.intro.IfElse.WEIRD;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IfElseTest {

    private ByteArrayOutputStream output;

    private IfElse fixture = new IfElse();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() throws UnsupportedEncodingException {

        IfElse.main(null);

        final String actual = output.toString(String.valueOf(UTF_8));

        assertThat(actual).contains(WEIRD);
    }

    @Test
    void run_LogsNotWierd_WhenInputStringIs2() throws UnsupportedEncodingException {

        final String input = "2";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(String.valueOf(UTF_8));

        assertThat(actual).contains(NOT_WEIRD);
    }

    @Test
    void run_LogsNotWierd_WhenInputStringIs4() throws UnsupportedEncodingException {

        final String input = "4";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(String.valueOf(UTF_8));

        assertThat(actual).contains(NOT_WEIRD);
    }

    @Test
    void run_LogsWierd_WhenInputStringIs6() throws UnsupportedEncodingException {

        final String input = "6";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(String.valueOf(UTF_8));

        assertThat(actual).contains(WEIRD);
    }

    @Test
    void run_LogsWierd_WhenInputStringIs20() throws UnsupportedEncodingException {

        final String input = "20";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(String.valueOf(UTF_8));

        assertThat(actual).contains(WEIRD);
    }

    @Test
    void run_LogsNotWierd_WhenInputStringIs22() throws UnsupportedEncodingException {

        final String input = "22";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(String.valueOf(UTF_8));

        assertThat(actual).contains(NOT_WEIRD);
    }

    @Test
    void run_LogsWierd_WhenInputStringIsNegativeOdd() throws UnsupportedEncodingException {

        final String input = "-3";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(String.valueOf(UTF_8));

        assertThat(actual).contains(WEIRD);
    }

    @Test
    void run_LogsNotWierd_WhenInputStringIsNegativeEven() throws UnsupportedEncodingException {

        final String input = "-2";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(String.valueOf(UTF_8));

        assertThat(actual).contains(NOT_WEIRD);
    }
}
