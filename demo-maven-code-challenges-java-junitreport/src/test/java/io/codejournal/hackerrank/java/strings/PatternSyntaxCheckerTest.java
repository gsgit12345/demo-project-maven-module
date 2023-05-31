package io.codejournal.hackerrank.java.strings;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;

public class PatternSyntaxCheckerTest {

    @Test
    public void defaultCase() throws UnsupportedEncodingException {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "Valid\nInvalid\nInvalid";

        PatternSyntaxChecker.main(null);

        final String actual = output.toString(String.valueOf(UTF_8)).trim();

        assertThat(actual).isEqualTo(expected);
    }
}
