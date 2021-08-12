package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] action = {
                new CreateAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, action);
        Assert.assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String index = String.valueOf(item.getId());
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", index, replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        Assert.assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteAction() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        String index = String.valueOf(item.getId());
        Input in = new StubInput(

                new String[]{"0", index, "1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        Assert.assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}