package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        Assert.assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{
                "0", "new item", "1", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new FindAllAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        Assert.assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Create" + System.lineSeparator()
                        + "1. Show all Items" + System.lineSeparator()
                        + "2. Exit" + System.lineSeparator()
                        + "=== Create a new Item ====" + System.lineSeparator()
                        + "Добавленная заявка: Item{id=1, name='new item'}" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Create" + System.lineSeparator()
                        + "1. Show all Items" + System.lineSeparator()
                        + "2. Exit" + System.lineSeparator()
                        + "=== Show all items ====" + System.lineSeparator()
                        + "Item{id=1, name='new item'}" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Create" + System.lineSeparator()
                        + "1. Show all Items" + System.lineSeparator()
                        + "2. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{
                "0", "new item2", "1", "new item2", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new FindByNameAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        Assert.assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Create" + System.lineSeparator()
                        + "1. Find Item by name" + System.lineSeparator()
                        + "2. Exit" + System.lineSeparator()
                        + "=== Create a new Item ====" + System.lineSeparator()
                        + "Добавленная заявка: Item{id=1, name='new item2'}" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Create" + System.lineSeparator()
                        + "1. Find Item by name" + System.lineSeparator()
                        + "2. Exit" + System.lineSeparator()
                        + "=== Find items by name ====" + System.lineSeparator()
                        + "Item{id=1, name='new item2'}" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Create" + System.lineSeparator()
                        + "1. Find Item by name" + System.lineSeparator()
                        + "2. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{
                "0", "new item3", "1", "new item3", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new FindByIdAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        Assert.assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Create" + System.lineSeparator()
                        + "1. Find Item by id" + System.lineSeparator()
                        + "2. Exit" + System.lineSeparator()
                        + "=== Find item by id ====" + System.lineSeparator()
                        + "Добавленная заявка: Item{id=1, name='new item3'}" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Create" + System.lineSeparator()
                        + "1. Find Item by id" + System.lineSeparator()
                        + "2. Exit" + System.lineSeparator()
                        + "=== Find item by id ====" + System.lineSeparator()
                        + "Item{id=1, name='new item3'}" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Create" + System.lineSeparator()
                        + "1. Find Item by id" + System.lineSeparator()
                        + "2. Exit" + System.lineSeparator()
        ));
    }
}