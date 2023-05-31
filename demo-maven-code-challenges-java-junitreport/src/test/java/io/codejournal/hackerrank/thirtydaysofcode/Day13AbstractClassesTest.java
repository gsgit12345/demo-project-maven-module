package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;

public class Day13AbstractClassesTest {

    @Test
    public void defaultCase() throws UnsupportedEncodingException {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "Title: The Alchemist\nAuthor: Paulo Coelho\nPrice: 248";

        Day13AbstractClasses.main(null);

        final String actual = output.toString(String.valueOf(UTF_8)).trim();

        assertThat(actual).isEqualTo(expected);
    }
}
