package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        Assert.assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        Assert.assertThat(selected, is(0));
    }

    @Test
    public void whenNegativeNumberInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        Assert.assertThat(selected, is(-1));
    }

    @Test
    public void whenMultiplyValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1", "2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int[] arr = new int[3];
        arr[0] = input.askInt("Enter menu:");
        arr[1] = input.askInt("Enter menu:");
        arr[2] = input.askInt("Enter menu:");
        Assert.assertArrayEquals(arr, new int[]{0, 1, 2});
    }
}