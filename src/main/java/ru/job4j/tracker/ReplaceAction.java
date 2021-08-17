package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Update Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        do {
            out.println("=== Edit item ====");
            int id = input.askInt("Enter id: ");
            if (tracker.findById(id) == null) {
                System.out.println("Please enter valid id.");
                continue;
            }
            String name = input.askStr("Enter name : ");
            Item item = new Item(name);
            if (tracker.replace(id, item)) {
                out.println("Заяка изменена успешно.");
            } else {
                out.println("Ошибка замены заявки.");
            }
        } while (false);
        return true;
    }
}
