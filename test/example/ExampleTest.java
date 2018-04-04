package example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExampleTest {

    @Test
    public void aTest() {
        assertThat(1, is(equalTo(1)));
    }

}