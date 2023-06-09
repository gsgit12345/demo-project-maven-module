package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day16StringToIntegerTest {

    private ByteArrayOutputStream output;

    private final Day16StringToInteger fixture = new Day16StringToInteger();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void parse_PrintsTheParsedInteger_WhenParsingIsSuccessful() throws UnsupportedEncodingException {

        final String expected = "3";

        Day16StringToInteger.main(null);

        final String actual = output.toString(String.valueOf(UTF_8)).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void parse_PrintsBadString_WhenParsingFails() throws UnsupportedEncodingException {

        final String expected = "Bad String";

        fixture.parse("za");

        final String actual = output.toString(String.valueOf(UTF_8)).trim();

        assertThat(actual).isEqualTo(expected);
    }
}
