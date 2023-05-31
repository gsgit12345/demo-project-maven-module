package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;

public class Day23BinarySearchTreeLevelOrderTraversalTest {

    @Test
    public void defaultCase() throws UnsupportedEncodingException {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "3 2 5 1 4 7";

        Day23BinarySearchTreeLevelOrderTraversal.main(null);

        final String actual = output.toString(String.valueOf(UTF_8)).trim();

        assertThat(actual).isEqualTo(expected);
    }
}