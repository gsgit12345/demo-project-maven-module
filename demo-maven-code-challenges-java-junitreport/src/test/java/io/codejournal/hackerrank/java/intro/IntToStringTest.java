package io.codejournal.hackerrank.java.intro;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class IntToStringTest {

    private ByteArrayOutputStream output;

    private final IntToString fixture = new IntToString();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() throws UnsupportedEncodingException {

        IntToString.main(null);

        final String actual = output.toString(String.valueOf(UTF_8));

        assertThat(actual.trim()).isEqualTo(IntToString.GOOD_JOB);
    }

    @Disabled("The code can never return Wrong Answer.")
    @Test
    public void run_PrintsWrongAnswer_WhenInputMisMatchesToInt() throws UnsupportedEncodingException {

        fixture.run(0x10);

        final String actual = output.toString(String.valueOf(UTF_8));

        assertThat(actual).isEqualTo(IntToString.WRONG_ANSWER);
    }
}
