package io.codejournal.hackerrank.java.strings;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;

public class DuplicateWordsTest {

    @Test
    public void defaultCase() throws UnsupportedEncodingException {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        // @formatter:off
        final String expected = "Goodbye bye world\n"
                              + "Sam went to his business\n"
                              + "Reya is the best player in eye game\n"
                              + "in inthe\n"
                              + "Hello Ab";
        // @formatter:on

        DuplicateWords.main(null);

        final String actual = output.toString(String.valueOf(UTF_8)).trim();
        assertThat(actual).isEqualTo(expected);
    }
}
