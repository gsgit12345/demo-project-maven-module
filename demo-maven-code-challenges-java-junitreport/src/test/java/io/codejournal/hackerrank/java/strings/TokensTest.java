package io.codejournal.hackerrank.java.strings;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;

public class TokensTest {

    @Test
    public void defaultCase() throws UnsupportedEncodingException {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "10\nHe\nis\na\nvery\nvery\ngood\nboy\nisn\nt\nhe";

        Tokens.main(null);

        final String actual = output.toString(String.valueOf(UTF_8)).trim();

        assertThat(actual).isEqualTo(expected);
    }
}
